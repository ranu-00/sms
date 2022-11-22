package com.ranu.erp.school.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{

    @Autowired
    private DataSource dataSource;

    @Value("${spring.queries.users-query}")
    private String usersQuery;

    @Value("${spring.queries.roles-query}")
    private String rolesQuery;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {

        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(usersQuery)
                .authoritiesByUsernameQuery(rolesQuery)
                .passwordEncoder(passwordEncoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                //.antMatchers("/resources/**").permitAll()
                .antMatchers("/enquirypanel").permitAll()
                .antMatchers("/teacherpanel").access("hasRole('ROLE_TEACHER')")
                .antMatchers("/adminpanel").access("hasRole('ROLE_ADMIN')")
                .and().csrf().disable().formLogin().loginPage("/login")
                .usernameParameter("username").passwordParameter("userpassword")
                .loginProcessingUrl("/perform_login")
                .successForwardUrl("/loginsuccess")
                .failureUrl("/login?error=true")
               // .loginProcessingUrl("/perform_login")
                .and().exceptionHandling().accessDeniedPage("/access-denied")
                .and().logout().logoutUrl("/logout")
                .logoutSuccessUrl("/login").invalidateHttpSession(true);
    }

    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**", "/vendor/**");
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        return bCryptPasswordEncoder;
    }

}

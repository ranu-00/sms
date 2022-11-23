<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EK School</title>
    <meta name="author" content="" />
    <meta name="description" content="" />
    
    <!-- Don't forget to set your site up: http://google.com/webmasters -->
    <meta name="google-site-verification" content="" />
    <meta name="Copyright" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300" rel="stylesheet">
    <!--bootstrap style-->
   <link rel="stylesheet" href="resources/css/bootstrap.min-69.css">
    <link rel="stylesheet" href="resources/css/owl.carousel.min-22.css">
    <link rel="stylesheet" href="resources/css/owl.theme.default.min-743.css">
    <!--fontawosome-->
    <link href="resources/css/all.css" rel="stylesheet" type="text/css"/>
    <script src="resources/js/all.js" type="text/javascript"></script>
   <link rel="stylesheet" href="resources/css/style-403.css" type="text/css" media="all" />
    <link rel="stylesheet" type="text/css" href="resources/css/settings-72.css" media="screen" />
    <link rel="stylesheet" href="resources/css/bootstrap-228.css" type="text/css" media="all" />
    <link rel="stylesheet" href="resources/css/animate.min-486.css" type="text/css" media="all" />
    
    <link rel="stylesheet" href="resources/css/magnific-popup-579.css" type="text/css" media="all" />
    <link rel="stylesheet" href="resources/css/icon-fonts-33.css" type="text/css" media="all" />
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>

    
</head>
<body class="preloader3 light_header">

    <div id="preloader">
        <div class="spinner">
            <div class="sk-dot1"></div><div class="sk-dot2"></div>
            <div class="rect3"></div><div class="rect4"></div>
            <div class="rect5"></div>
        </div>
    </div>

    <div id="main_wrapper">
    <!-- Start Main Header -->
        <header id="site_header">
        <div class="topbar"><!-- class ( topbar_colored  ) -->
            <div class="content clearfix">           
                <div class="top_details clearfix f_left">
					<!--
                    <div class="languages-select languages-drop">
                        <span><i class="ico-globe4"></i><span>English</span></span>
                        <div class="languages-panel">
                            <ul class="languages-panel-con">
                                <li class="active"><a href="#">English <i class="ico-check lang_checked"></i></a></li>
                                <li><a href="#">RTL</a></li>
                            </ul>
                        </div>
                    </div>-->
                    <!--
                    <span class="top_login">
                        <a href="{{ route('login">Login</a>
                    </span>-->
					
                    
                    <span><i class="fas fa-phone icon ico-phone5"></i><span class="title">Call Us :</span> 8010580426</span>
                    <span><i class="fas fa-at icon ico-comment2"></i><span class="title">Support Email:</span><a href="#" style="text-transform: lowercase!important;"><a href="mailto:snlrana65@gmail.com">snlrana65@gmail.com</a></span>
					<a href="#" class="title">Course Syllabus </a>
					&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/enquirypanel" class="title" target="_blank"><span class="blink" style="padding:5px;">Online Enquiry Form</span> </a>
				
                </div>
                    
                 <div class="top-socials box_socials f_right">
                    <a href="#" target="_blank">
                        <span class="soc_name">Facebook</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-facebook-f ico-facebook4"></i>
                    </a>
                    <a href="#" target="_blank">
                        <span class="soc_name">Twitter</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-twitter ico-twitter4"></i>
                    </a>
                    <a href="#" target="_blank">
                        <span class="soc_name">Google+</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-google-plus ico-google-plus"></i>
                    </a>     
                    <a href="skype:#?call">
                        <span class="soc_name">Skype</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-skype ico-skype"></i>
                    </a>
                    <a href="#" target="_blank">
                        <span class="soc_name">Picassa</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-pinterest ico-picassa"></i>
                    </a>
                    <a href="#" target="_blank">
                        <span class="soc_name">Vimeo</span>
                        <span class="soc_icon_bg"></span>
                        <i class="fab fa-vimeo ico-vimeo"></i>
                    </a>
                 </div> 
            </div>
            <!-- End content -->
            <span class="top_expande not_expanded">
                <i class="no_exp ico-angle-double-down"></i>
                <i class="exp ico-angle-double-up"></i>
            </span>
        </div>
        <!-- End topbar -->
            
        <div id="navigation_bar">
            <div class="content">
                <div id="logo">
                    <a href="${pageContext.request.contextPath}/">
                        <img class="logo_dark" src="resources/images/logo.png" >
                        <img class="-logo_light" src="resources/images/logo.png" >
                    </a>
                </div>
                
                <!-- Top Card -->
                
                <!-- End Top Card -->
                
                <!-- Top Search -->
                <!-- <form class="top_search clearfix small_top_search">
                    <div class="top_search_con">
                        <input type="text" class="s" placeholder="Search Here ...">
                        <span class="top_search_icon"><i class="ico-search4"></i></span>
                        <input type="submit" class="top_search_submit" >
                    </div>
                </form>-->
                <!-- End Top Search -->
                <nav id="main_nav">
                    <div id="nav_menu">
                        <span class="mobile_menu_trigger">
                            <a href="#" class="nav_trigger"><span></span></a>
                        </span>     
                        <ul id="navy" class="clearfix">
<!--                            <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.dhakacollege.edu.bd/" target="_blank" ><abbr style="cursor:pointer" title="Dhaka College"><img src="resources/images/dhakacollege-972.jpg"  width="60" height="60" alt=""></abbr></a>
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.emc.edu.bd/" target="_blank"><abbr style="cursor:pointer" title="Eden Mohila College"><img src="resources/images/eclogo-377.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.bbggc.gov.bd/" target="_blank"><abbr style="cursor:pointer" title="Begum Badrunnesa Govt. Women College"><img src="resources/images/badclogo-759.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.titumircollege.gov.bd/" target="_blank"><abbr style="cursor:pointer" title="Government Titumir College"><img src="resources/images/tclogo-860.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://kncollege.gov.bd/" target="_blank"><abbr style="cursor:pointer" title="Kabi Nazrul College"><img src="resources/images/nclogo-803.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.sarkaribanglacollege.gov.bd/" target="_blank"><abbr style="cursor:pointer" title="Government Bangla College"><img src="resources/images/bclogo-184.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
							
                           </li>
                           <li class="normal_menu mobile_menu_toggle current_page_item" style="border:1px solid #000000; margin-right:5px;">
                            <a href="http://www.gsscdhaka.edu.bd/" target="_blank"><abbr style="cursor:pointer" title="Government Shahid Sohrawardi College"><img src="resources/images/sscdhaka-804.jpg" target="_blank" width="60" height="60" alt=""></abbr></a>
                           </li>-->
                         <!--
                        <li style="padding-bottom:5px; font-size:20px; color: red;">	<a href="  http://7college.du.ac.bd/scholarship/index.php" class="title" target="_blank" style="color:red;"><span class=""> Scholarship </span> </a></li>
                        -->
                        <li>
                        
                        </li>
                        <li style="padding-bottom:5px; font-size:20px; color: red;">	<a href="${pageContext.request.contextPath}/" class="title" target="_blank" style="color:red;"><span class=""> Result</span> </a></li>
                      
                        <li></li>
                            <li><a href="${pageContext.request.contextPath}/login" class="title" target="_blank" style="height:20px; padding-bottom:5px;"><span class="blink">LOGIN</span> </a></li>
                        </ul>
                    </div>
                </nav>
                <!-- End Nav -->    
                
                <div class="clear"></div>
            </div>
        </div>
    </header>
    <!-- End Main Header -->
    </div>

    <!-- Slider Revolution -->
    <!-- OWL Slider -->
	<div id="enar_owl_slider" class="owl-carousel">
	    <div class="item">
		    <img src="resources/images/slide2-720.jpg" alt="Slide Title">
		    <div class="owl_slider_con">
			
			
			<span class="owl_text_b"><span>Welcome Ek School Website</span></span><br/>
		    <span class="owl_text_c"><span>at the Uttarakhand</span></span>
			
			<span class="owl_text_d">
				<a href="#" target="_self" class="btn_a">
				<span><i class=" in_left fa fa-arrow-right" aria-hidden="true"></i><span><strong>Read More...</strong></span><i class="fa fa-arrow-right" aria-hidden="true"></i></span>
			    </a>
			</span>

		    </div>
	    </div>
	    <div class="item">
		    <img src="resources/images/slide3-395.jpg" alt="Slide Title">
		    <div class="owl_slider_con"><br/><br/>
		    <span class="owl_text_b"><span>Ek School is one of the most well known sculptures</span></span><br/>
		    <span class="owl_text_c"><span>dedicated to the sdfd in 2022.</span></span>
		    <span class="owl_text_d">
			    <a href="#" target="_self" class="btn_a">
			    <span><i class="in_left ico-cart1"></i><span>Read More...</span><i class="in_right ico-cart1"></i></span>
			</a>
		    </span>
		</div>
	    </div>
	    <div class="item">
		    <img src="resources/images/slide1-640.jpg" alt="Slide Title">
		    <div class="owl_slider_con">
			<span class="owl_text_b"><span>xyz</span></span><br/>
	<span class="owl_text_c"><span>hhdfsdf sdfb jsdfjksdfjsk</span></span>
		    <span class="owl_text_d">
			    <a href="#" target="_self" class="btn_a">
			    <span><i class="in_left ico-cart1"></i><span>Read More...</span><i class="in_right ico-cart1"></i></span>
			</a>
		    </span>
		</div>
	    </div>
	</div>
	<!-- End OWL Slider -->
    <!-- End Slider Revolution -->


   
    <!-- Intro Banner -->
    <div class="welcome_banner full_colored">
            <section class="content_section">
        <div class="title_banner t_b_color1 centered" style='height:60px;'>
            <div class="content scroll-title">
				<span>
					 <marquee behavior="scroll" direction="left" onmouseover="this.stop();" onmouseout="this.start();">
					 					   <h3 style="color:red;">
					 Notification line ek school ek school ek school ek schoolek school ek schoolek schoolek schoolek school
                                        <h3>

					 </marquee>
				</span>
				
               
            </div>
             <br/>  
        </div>
         
    </section>
        <div class="content clearfix">
            
			<div class="col-md-9">
			<h3>Message from the Honorable Vice Chancellor</h3>
				<span class="intro_text" >
				<p style="font-size:16px;text-align:justify!important;">
				For several years Spring is the most widely used software ecosystem for Java Enterprise Edition developers, it covers almost every aspect and makes it more simple and quicker to do than in a ‘standard’ way. It works as an overlord, or a platform that manage the lifecycle of all objects that are in its ecosystem in a very lightweight way, so developers can focus on more important things, like business logic.
				</p></span>
        		        <!--<a href="#" target="_self" class="btn_a f_right">
                       <span><span><strong>Read More...<strong/></span><i class="in_right"></i></span>
			
                       </a>-->
			</div>
			<div class="col-md-3">
				<img src="resources/images/vcSir-955.jpg" height="200" width="180"><br>
				Mr Sunil Rana<br>
				Dehradun<br>
				Software Engineer

				
			</div>
        
		</div>

    </div>  

    <!-- End Intro Banner -->
    <!-- Icon Boxes Style 1 A-->
    <section class="content_section">
        <div class="container icons_spacer">
            
            <div class="icon_boxes_con style1 clearfix">
                <div class="col-md-4">
                    <div class="service_box">
                        <span class="icon"><i class="ico-mobile4"></i></span>
                        <div style="" class="service_box_con ">
                            <div id="grad1"><h3 style="color:#ffffff!important; text-shadow: 0 2px 2px #000000;"  class="centered">News & Event</h3></div>             <div style="max-height:480px; overflow:auto;">                                              
                                									
                                     <a href="#"><b>National University Exam Regulation For The Masters Program Regulation</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>										
                                									
                                     <a href="#"><b>National University Exam Regulation For Preliminary to Masters Program Regulation</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>										
                                									
                                     <a href="#"><b>National University Exam Regulation For Bachelor of Pass Degree Regulation 2013-2014</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>										
                                									
                                     <a href="#"><b>National University Exam Regulation For Bachelor Degree (Honours) (Revised) Regulation 2009-2010</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>										
                                     <a href="#"><b>National University Exam Regulation For Bachelor Degree (Honours) (Revised) Regulation 2009-2010</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                     <a href="#"><b>National University Exam Regulation For Bachelor Degree (Honours) (Revised) Regulation 2009-2010</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                     <a href="#"><b>National University Exam Regulation For Bachelor Degree (Honours) (Revised) Regulation 2009-2010</b><br>
            17/05/2018&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                 </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="service_box">
                        <span class="icon"><i class="color1 ico-mobile4"></i></span>
                        <div class="service_box_con ">
                            <div id="grad1"><h3  style="color:#ffffff!important; text-shadow: 0 2px 2px #000000;"  class="centered">Notice</h3></div>
                             
                             <div style="max-height:480px; overflow:auto;">
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="http://7college.du.ac.bd/frontend/notice/208"><b>HONOURS 4TH YEAR EXAMINATION-2016 RESULT OF RESCRUITINY</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                                <a href="#"><b>Degree 3rd Year-2015 Rescrunity Result</b><br>&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>
                              </div>
                            
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="service_box">
                        <span class="icon"><i class="color2 ico-mobile4"></i></span>
                        <div class="service_box_con ">
                            <div id="grad1"><h3  style="color:#ffffff!important; 
							text-shadow: 0 2px 2px #000000; padding-left:10px!important; letter-spacing:2px;"  
							class="centered">Result</h3></div>
                            <div style="max-height:480px; overflow:auto;">
                               <a href="#"><b>sadgsdfdsfjdsfjd jsdfhksdj</b><br>21/05/2019&nbsp;&nbsp;<button class="btn btn-info btn-xs">Read More...</button></a><hr>

                            </div>
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
     <!--End Icon Boxes Style 1 A -->

    <!-- <div class="welcome_banner full_colored">
        <div class="content clearfix">
            <h3 style="text-shadow: 0 2px 2px #000000;">About Inclusion of 7 Colleges at the University of Dhaka</h3>
        <span class="intro_text">

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae congue tellus, nec convallis ipsum. Etiam ut neque quis sem efficitur lobortis eget auctor urna. Nunc lacinia diam sit amet rhoncus lobortis. Suspendisse sed eleifend elit. Duis pharetra sit amet erat in vehicula. Aliquam erat volutpat. Aenean mollis in magna sed pretium. Curabitur accumsan, turpis eu dictum posuere, orci augue iaculis eros, vel posuere ipsum nisl ac nibh. Donec vel egestas sem, eget cursus odio. Quisque sed magna quis mi mattis blandit. Praesent sit amet massa nec lectus fermentum condimentum.
<br/>
Duis sagittis euismod commodo. Suspendisse pharetra velit nec metus pellentesque, nec molestie arcu auctor. Mauris ex orci, blandit ac imperdiet ac, lacinia vel arcu. Nulla et convallis diam. Vestibulum eleifend odio nec eros sodales posuere. Nulla at volutpat nulla, non imperdiet metus. Duis tempor est in commodo mattis. Sed cursus, ligula eget ornare mattis, purus massa aliquam erat, ac feugiat mi ligula ac leo. Sed sed turpis sem. Fusce id nulla eget eros ornare pellentesque. Mauris ac porta ipsum. Mauris massa magna, commodo quis augue quis, mollis ultricies neque. Aliquam a auctor tellus. Donec feugiat tellus eget nisi rutrum ultricies. </span>
                <a href="#" target="_self" class="btn_a f_right">
           						<span><span>Read More</span><i class="in_right"></i></span>
        </a>
		</div>
    </div>-->


    <!-- footer -->
    <footer id="footer">
        <div class="container row_spacer clearfix">
            <div class="rows_container clearfix">
                <div class="col-md-4" >
                    <div id="grad1"><h1 class="footer_title">Quick Links</h1></div>
                    <ul>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">University of Uttarakhand</a></li>
                         <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">University Grant Commission</a></li>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">Ministry of Education</a></li>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">Others</a></li>
                    </ul>
                </div><!-- Grid -->
                
                <div class="col-md-4">
                    <div id="grad1"><h1 class="footer_title">Useful Links</h1></div>
                    <ul>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">University of Uttarakhand</a></li>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">University Grant Commission</a></li>
                        <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">Ministry of Education</a></li>
                       <li style="line-height:25px!important;"><span class="glyphicon glyphicon-arrow-right"></span>&nbsp;<a href="#">Others</a></li>
                    </ul>
					 
					
					
                </div><!-- Grid -->
                
                <div class="col-md-4">
                    <div id="grad1"><h1 class="footer_title">Contact Address</h1></div>
                    <ul>
                        <li>Faculty of Business Studies, <br/>CBSC, <br/>Dehradun, Uttarakhand<br/>
						Phone: 8010580426
						<br/>Fax: ##########
						<br/>Email: <a href="#">snlrana65@gmail.com</a>
						<br/>Web:<a href="#">www.baddaalatunnesa.org</a>
						</li>
                    </ul>
					
					<div style="margin-top:50px" id="google_translate_element"></div>
                </div>
                
            </div>
			 
        </div>

		<section class="content_section">
        <div class="title_banne">
            <div class="content">
                                <h6 style="color:white;"><!--Visitor Counter : {{$visitor->visitor}}--></h6>
                
            </div>
			
        </div>
            
        </section>
        <div class="footer_copyright">
            <div class="container clearfix">
                <div class="col-md-6">
                    <span class="footer_copy_text">Copyright &copy; 2022 Ek school - All Rights Reserved | Developed By: Ranu</span>
                </div>
                <div class="col-md-6 clearfix">
                    <ul class="footer_menu clearfix">
                        <li><a href="#"><span>Home</span></a></li>
                        <li>/</li>
                        <li><a href="#"><span>About Us</span></a></li>
                        <li>/</li>
                        <li><a href="#"><span>Help Center</span></a></li>
                        <li>/</li>
                        <li><a href="#"><span>Contact Us</span></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <!-- <a href="#0" class="hm_go_top"></a> -->
          
</div>

<script type="text/javascript" src="resources/js/jquery.min-765.js"></script>
<script>window.jQuery || document.write('<script src="resources/js/jquery.js"><\/script>')</script>

<script type="text/javascript" src="resources/js/plugins-141.js"></script>
<script type="text/javascript" src="resources/js/jquery.themepunch.tools.min-571.js"></script>
<script type="text/javascript" src="resources/js/jquery.themepunch.revolution.min-321.js"></script>
<script type="text/javascript" src="resources/js/isotope.pkgd.min-110.js"></script>
<script type="text/javascript" src="resources/js/functions-775.js"></script>

<script type="text/javascript">
function googleTranslateElementInit() {
  new google.translate.TranslateElement({pageLanguage: 'en'}, 'google_translate_element');
}
</script>

<script type="text/javascript" src="resources/js/element-643.js"></script>


</body>
</html>

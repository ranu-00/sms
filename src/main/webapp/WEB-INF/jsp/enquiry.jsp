<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>SMS-->Sign Up Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link rel="stylesheet" media="screen" href="resources/css/signup.css">
        <script src="resources/js/particles.js" type="text/javascript"></script>
        <script src="resources/js/particles.min.js" type="text/javascript"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
        <style>


            .card{
                position: absolute;
                top:20px;
                left:450px;
                width: 480px;
                overflow: hidden;
            }
            .titletext h4{
                background: #eee;
                height: 30px;
                text-align: center;
                font-weight: bold;
            }

        </style>
    </head>
    <body class="bg-dark">


        <!-- particles.js container -->
        <div id="particles-js"></div>
        <div class="card bg-light">
            <article class="card-body mx-auto">
                <div class="card-title">
                    <center><img style="width: 180px; height: 100px;" src="resources/images/logo/schoollogo.png"/></center>
                </div>
                <div class="titletext">
                    <h4 class="">Admission Enquiry Here</h4>
                </div>
                <hr>
                <form:form modelAttribute="enquiry" action="enquiry">
                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                        </div>
                        <form:input type="text" class="form-control" placeholder="Student Name"
                                    path="studentname" required="true"></form:input>

                        </div> <!-- form-group// -->
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="text" class="form-control" placeholder="Father Name"
                                     path="fname" required="true"></form:input>
              </div>
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="text" class="form-control" placeholder="Mother Name"
                                     path="mname" required="true"></form:input>
              </div>
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="textarea" class="form-control" placeholder="Address"
                                     path="address" required="true"></form:input>
              </div>
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="text" class="form-control" placeholder="city"
                                     path="city" required="true"></form:input>
              </div>
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="text" class="form-control" placeholder="state"
                                     path="state" required="true"></form:input>
              </div>
               <div class="form-group input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                    </div>
               <form:input type="text" class="form-control" placeholder="pincode"
                                     path="pincode" required="true"></form:input>
              </div>
                        <div class="form-group input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
                            </div>
                        <form:input type="text" class="form-control" placeholder="Contact No."
                                    path="userPhone" required="true"></form:input>
                        </div> <!-- form-group// -->
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                         <form:input type="text" class="form-control" placeholder="Class"
                                               path="classs" required="true"></form:input>
                        </div>
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                         <form:input type="text" class="form-control" placeholder="Aadhar No"
                                               path="addhar" required="true"></form:input>
                        </div>
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                                                   <form:select  class="form-control" path="gender" required="true">
                                                       <option value="">----Select----</option>
                                                       <option value="MALE">MALE</option>
                                                       <option value="FEMALE">FEMALE</option>
                                                   </form:select>
                        </div>
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                                                   <form:select  class="form-control" path="nationality" required="true">
                                                       <option value="">----Select----</option>
                                                       <option value="INDIAN">INDIAN</option>
                                                       <option value="OTHERS">OTHERS</option>
                                                   </form:select>
                        </div>
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                                <form:input type="text" class="form-control" placeholder="DOB"
                                                            path="dob" required="true"></form:input>
                        </div>
                        <div class="form-group input-group">
                              <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                              </div>
                                     <form:select  class="form-control" path="status" required="true">
                                          <option value="">----Select----</option>
                                          <option value="INTERESTED">INTERESTED</option>
                                          <option value="CONFIRM">CONFIRM</option>
                                          <option value="REJECTED">REJECTED</option>
                                       </form:select>
                        </div>
                        <div class="form-group input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
                            </div>
                        <form:input type="text" class="form-control" placeholder="Email Address"
                                    path="email" required="true"></form:input>
                        </div> <!-- form-group// -->
                               
                    <div class="form-group">
                        <button type="submit" name="Submit" id="loginbutton" class="btn btn-primary btn-block">Submit</button>
                        <button type="submit" name="Submit" id="loginbutton" class="btn btn-outline-danger btn-block"><a href="${pageContext.request.contextPath}/enquirypanel" id="loginbutton">Cancel</a></button>
                    </div> <!-- form-group// -->      
               </form:form>
            </article>
        </div> <!-- card.// -->

        <!-- scripts -->
        <script src="resources/js/particles.js"></script>
        <script src="resources/js/app.js"></script>

        <script src="resources/js/lib/stats.js"></script>


    </body>
</html>

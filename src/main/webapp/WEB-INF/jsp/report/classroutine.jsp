<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Class Routine Report</title>
        <script src="resources/js/angular.min.js" type="text/javascript"></script>
        <jsp:include page="../partial/head.jsp"></jsp:include>
            <!-- inject:css -->
            <link rel="stylesheet" href="resources/css/style.css">
            <link href="resources/css/customstyle.css" rel="stylesheet" type="text/css"/>
            <link href="resources/css/all.css" rel="stylesheet" type="text/css"/>
            <script src="resources/js/all.js" type="text/javascript"></script>
        </head>
        <body ng-app="myApp">

            <div class="container-scroller">
                <!-- partial:partials/_navbar.html -->
            <jsp:include page="../partial/topnav.jsp"></jsp:include>
                <!-- partial -->
                <div class="container-fluid page-body-wrapper">
                    <!-- partial:partials/_sidebar.html -->
                <jsp:include page="../partial/admin/sidebar.jsp"></jsp:include>
                    <!-- partial -->
                    <div class="main-panel">
                        <div class="content-wrapper">
                            <div class="row">                                
                                <div class="col-12 grid-margin float-right stretch-card">
                                    <div class="card">
                                        <div class="card-body">
                                            <h4 class="card-title">Class Routine Report</h4>
                                        <form:form method="POST" class="form-inline" modelAttribute="classroutineInputForm" action="classroutineView">

                                            <div class="input-group mb-2 mr-sm-2">

                                                <form:input class="form-control" placeholder="Enter Class Name" path="classname" id="title"/>
                                            </div>


                                            <div class="input-group mb-2 mr-sm-2">
                                                <form:input class="form-control" placeholder="Enter Attendence Date" path="secname" id="title"/>

                                            </div>
                                            <div class="input-group mb-2 mr-sm-2">
                                                <input type="submit" class="btn btn-outline-primary" target="_blank" value="Generate Report"  />

                                            </div>


                                        </form:form>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- content-wrapper ends -->
                    <!-- partial:partials/_footer.html -->
                    <jsp:include page="../partial/footer.jsp"></jsp:include>
                        <!-- partial -->
                    </div>
                    <!-- main-panel ends -->
                </div>
                <!-- page-body-wrapper ends -->
            </div>
            <!-- container-scroller -->

        <jsp:include page="../partial/jsinclude.jsp"></jsp:include>

        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>

        <script>
            $(document).ready(function () {
                var date_input = $('input[name="atdate"]'); //our date input has the name "date"
                var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
                date_input.datepicker({
                    format: 'yyyy-mm-dd',
                    container: container,
                    todayHighlight: true,
                    autoclose: true,
                })
            })
        </script>
    </body>
</html>



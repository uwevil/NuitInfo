<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>User account</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="pages/assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="pages/assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="pages/assets/css/light-bootstrap-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="../assets/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="../assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="assets/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    Mike
                </a>
            </div>

            <ul class="nav">
                <li>
                    <a href="dashboard.html">
                        <i class="pe-7s-graph"></i>
                        <p>Sign Up</p>
                    </a>
                </li>
                <li class="active">
                    <a href="user.html">
                        <i class="pe-7s-user"></i>
                        <p>Sign In</p>
                    </a>
                </li>
            </ul>
    	</div>
    </div>



    <div class="main-panel">
<!--         <nav class="navbar navbar-default navbar-fixed"> -->
<!--             <div class="container-fluid"> -->
<!--                 <div class="navbar-header"> -->
<!--                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2"> -->
<!--                         <span class="sr-only">Toggle navigation</span> -->
<!--                         <span class="icon-bar"></span> -->
<!--                         <span class="icon-bar"></span> -->
<!--                         <span class="icon-bar"></span> -->
<!--                     </button> -->
<!--                     <a class="navbar-brand" href="#">Profile</a> -->
<!--                 </div> -->
<!--                 <div class="collapse navbar-collapse"> -->
<!--                     <ul class="nav navbar-nav navbar-left"> -->
<!--                         <li> -->
<!--                             <a href="#" class="dropdown-toggle" data-toggle="dropdown"> -->
<!--                                 <i class="fa fa-dashboard"></i> -->
<!--                             </a> -->
<!--                         </li> -->
                        
<!--                         <li class="dropdown"> -->
<!--                               <a href="#" class="dropdown-toggle" data-toggle="dropdown"> -->
<!--                                     <i class="fa fa-globe"></i> -->
<!--                                     <b class="caret"></b> -->
<!--                                     <span class="notification">5</span> -->
<!--                               </a> -->
<!--                               <ul class="dropdown-menu"> -->
<!--                                 <li><a href="#">Notification 1</a></li> -->
<!--                                 <li><a href="#">Notification 2</a></li> -->
<!--                                 <li><a href="#">Notification 3</a></li> -->
<!--                                 <li><a href="#">Notification 4</a></li> -->
<!--                                 <li><a href="#">Another notification</a></li> -->
<!--                               </ul> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                            <a href=""> -->
<!--                                 <i class="fa fa-search"></i> -->
<!--                             </a> -->
<!--                         </li> -->
<!--                     </ul> -->

<!--                     <ul class="nav navbar-nav navbar-right"> -->
                      
                    
<!--                     </ul> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </nav> -->


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="content">
                            
                                
                                <html:form action="/AddContact">
						            <h2 class="form-signin-heading">Please sign up</h2>
						            <br/>
						
						            <label for="text" class="sr-only">First name</label>
						            <input type="text" class="form-control" placeholder="First name" name="first name">
						            <br/>
						
						            <label for="text" class="sr-only">Last name</label>
						            <input type="text" class="form-control" placeholder="Last name" name="last name" >
						            <br/>
						
						            <label for="text" class="sr-only">Login</label>
						            <input type="text" class="form-control" placeholder="Login" name="login" >
						            <br/>
						
						            <label for="inputEmail" class="sr-only">Email address</label>
						            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="email" >
						            <br/>
						
						            <label for="inputPassword" class="sr-only">Password</label>
						            <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" >
									<br/>
									
						            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
								</html:form>
                                
                                
                                
                                
                            </div>
                        </div>
                    </div>
                    
                    
                    
                    
                    
<!--                     <div class="col-md-4"> -->
<!--                         <div class="card card-user"> -->
<!--                             <div class="image"> -->
<!--                                 <img src="https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400" alt="..."/> -->
<!--                             </div> -->
<!--                             <div class="content"> -->
<!--                                 <div class="author"> -->
<!--                                      <a href="#"> -->
<!--                                     <img class="avatar border-gray" src="../assets/img/faces/face-3.jpg" alt="..."/> -->

<!--                                       <h4 class="title">Mike Andrew<br /> -->
<!--                                          <small>michael24</small> -->
<!--                                       </h4> -->
<!--                                     </a> -->
<!--                                 </div> -->
<!--                                 <p class="description text-center"> "Lamborghini Mercy <br> -->
<!--                                                     Your chick she so thirsty <br> -->
<!--                                                     I'm in that two seat Lambo" -->
<!--                                 </p> -->
<!--                             </div> -->
<!--                             <hr> -->
<!--                             <div class="text-center"> -->
<!--                                 <button href="#" class="btn btn-simple"><i class="fa fa-facebook-square"></i></button> -->
<!--                                 <button href="#" class="btn btn-simple"><i class="fa fa-twitter"></i></button> -->
<!--                                 <button href="#" class="btn btn-simple"><i class="fa fa-google-plus-square"></i></button> -->

<!--                             </div> -->
<!--                         </div> -->
<!--                     </div> -->

                </div>
            </div>
        </div>




    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="../assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Checkbox, Radio & Switch Plugins -->
	<script src="../assets/js/bootstrap-checkbox-radio-switch.js"></script>

	<!--  Charts Plugin -->
	<script src="../assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="../assets/js/bootstrap-notify.js"></script>

    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="../assets/js/light-bootstrap-dashboard.js"></script>

	<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
	<script src="../assets/js/demo.js"></script>

</html>

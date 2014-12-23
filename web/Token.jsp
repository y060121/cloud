
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> 

<%@page import="javax.swing.JOptionPane"%>
<%@ page import="java.sql.*"%>
<% Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");%>
<%@page import="java.util.Random"%>

<html class="no-js"> <!--<![endif]-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <head>
        <meta charset="utf-8">
        <!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
        <!--
        Zoom Template 
        http://www.templatemo.com/preview/templatemo_414_zoom
        -->
        <title>Zoom HTML5 Template by templatemo</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        
        <!-- Google Web Font Embed -->
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,600,500,300,700' rel='stylesheet' type='text/css'>
        
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/templatemo_main.css">
    </head>
    <body>
        <div id="main-wrapper">

            <!--[if lt IE 7]>
                <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
            <![endif]-->
            
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center templatemo-logo margin-top-20">
                <h1 class="templatemo-site-title">
                    <a href="#"><span class="cyan"></a></span>
                </h1>
               
            </div>
            <div class="image-section">
                <div class="image-container"> 
                    <img src="images/zoom-bg-3.jpg" id="menu-img" class="main-img inactive" alt="Zoom HTML5 Template by templatemo.com">
                    <img src="images/zoom-bg-2.jpg" id="products-img" class="inactive" alt="Product">
                    <img src="images/zoom-bg-3.jpg" id="services-img"  class="inactive" alt="Services">
                    <img src="images/zoom-bg-4.jpg" id="about-img" class="inactive" alt="About">
                    <img src="images/zoom-bg-5.jpg" id="contact-img" class="inactive" alt="Contact">
                    <img src="images/zoom-bg-6.jpg" id="company-intro-img" class="main-img inactive" alt="Company Intro">
                    <img src="images/zoom-bg-7.jpg" id="testimonials-img" class="main-img inactive" alt="Testimonials">
                </div>
            </div>
            
             <%            
            Random r = new Random();
            int Low = 1;
            int High = 99;
            int R = r.nextInt(High-Low) + Low;
           /* Random r1 = new Random();
            int Low1 = 1;
            int High1 = 5;
            int R1 = r.nextInt(High1-Low1) + Low1;
            int cnt= 0;               
               System.out.println(R);                         
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\ACUTE-PC\\SQLEXPRESS:1433;databaseName=Cloud","cloudadmin","mathiarasu");
                Statement stmt = connection.createStatement();                               
                ResultSet rs= stmt.executeQuery("select name from Register where Password ='crysis' ");   */  
            %>
            <center>
                <div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 margin-bottom-20">
                     <form action="Token" method="post">
                        <div class="black-bg col-sm-12 col-md-12 col-lg-12">
                                <h2>  </h2>
                                
                                        <div class="form-group">
                                                    <!--<label for="contact_email">Email Address</label>-->
                                                    <input type="text" name="name" class="form-control" value="" placeholder="NAME"/>
                                        </div>
                                
                                        <div class="form-group">
                                                    <!--<label for="contact_message">Message</label>-->
                                                    <input type="text" name="token"  class="form-control" value="<%=R%>" placeholder="TOKEN"/>
                                        </div>
                                                <button type="submit" class="btn btn-primary">REGISTER TOKEN</button>
                                                <button type="reset"  value="reset" class=" btn btn-primary">CLEAR</button>
                         </div> 
                      </form>
                </div>
               </center>

            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 footer">
                    <p class="footer-text"> <!-- Credit: www.templatemo.com --></p>
                </div><!-- /.footer --> 
            </div>

		</div><!-- /#main-wrapper -->
        
        <div id="preloader">
            <div id="status">&nbsp;</div>
        </div><!-- /#preloader -->
        
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.backstretch.min.js"></script>
        <script src="js/templatemo_script.js"></script>

    </body> 
</html>
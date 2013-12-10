<%-- 
    Document   : main
    Created on : 2012-10-11, 10:24:12
    Author     : rock
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index Page</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/superfish.css" rel="stylesheet" type="text/css" />
<link href='http://fonts.googleapis.com/css?family=PT+Serif' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="media/stylesheets/base.css" />
<link rel="stylesheet" href="media/scripts/gridslider/gridslider.css" />

<!-- ICONS -->
    <link rel="shortcut icon" href="img/favicon.png"/>
    
       
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

<script type="text/javascript" src="js/custom.js"></script>

<script>document.getElementsByTagName('html')[0].setAttribute('id','js-1')</script>
	
	
	<!--[if IE 7]><link href="media/stylesheets/ie7.css" rel="stylesheet"  /><![endif]-->
	<!--[if IE 8]><link href="media/stylesheets/ie8.css" rel="stylesheet"  /><![endif]-->
	<!--[if lte IE 8]><link href="media/stylesheets/lteie8.css" rel="stylesheet"  />
<![endif]-->
	<!--[if lte IE 9]><link href="media/stylesheets/lteie9.css" rel="stylesheet"  />
<![endif]-->
		
	<!--[if lte IE 8]><script src="media/scripts/lteie8.js"></script><![endif]-->
	<!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>-->

	<!--<script src="media/scripts/libs/jquery.easing.js"></script>-->
	<!--<script src="media/scripts/gridslider/gridslider.js"></script>-->
	<script src="media/scripts/gridslider/gridslider.1.0.min.js"></script>
	<script src="media/scripts/main.js"></script>
	
	
	<!-- [if IE 7] -->

<style type="text/css">

	.container_bottom {*padding:12px 0 20px 0;}

    .contentBlock1 {*padding:0 0 15px 0;}

    .getPad1 {*padding:0px;}

    .full_width {*padding:40px 13px 0 28px;}

    .full_block_top {*padding:0 0 25px 0;}

    .content_main2 {*padding:12px 12px 0 12px;}

    .small_PicBox {*margin:0 8px -3px 0;}

    .getPad2 {*padding:12px 12px 0 12px;}

    .cont_bottom {*padding:12px 12px 0 12px;}

    .get_mar2 {*margin:0 8px 0 0 !important;}

</style>



<!-- [endif] -->
	

</head>
<body>
	
      <jsp:include page="headblock.jsp"></jsp:include>

	<div>
		<menu></menu>
	</div>
	<h4>${userid}</h4>
	<h4>${email}</h4>
	<h4>${username}</h4>
	<h4>${mobile}</h4>
	
	
	<footer class="footerwrapper1"> <!--footerwrapper_bottom Start-->
        <section class="footer_main"> <!--footer_main Start-->
            <section class="footer_top"> 
                <div class="box2">
                    <img src="img/logo3.png" alt="" />
                </div>
                
                <div class="box2">
                    Twitter Widget
                </div>
                
                <div class="box2">
                    Recent Comments
                </div>
                
                <div class="box2 nomar2">
                    Flickr Widget
                </div>
                <div class="clear"></div>
            </section> <!--footer_top End--> 
            <section class="footer_mid"> <!--footer_mid Start-->
                 
            </section> <!--footer_mid End--> 
            
            <section class="footer_bottom"> <!--footer_bottom Start-->
                
                <div class="bottomRight fltright"> <!--bottomRight Start-->
                    <div class="copy_right">&copy; 2013 Fixim. All rights reserved.</div>
                </div> <!--bottomRight End-->
      <!--bottomRight End-->
      <div class="clear"></div>
      
    </section>
    <!--footer_bottom End--> 
  </section>
  <!--footer_main End--> 
</footer>
<!--footerwrapper_bottom Start-->
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
	
</body>
</html>

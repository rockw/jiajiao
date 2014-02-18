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
	<header class="header_wrapper"><!--header_wrapper Start-->
		<div class="header"><!--header Start-->
			<div class="logo fltleft">
				<a href="#"><img src="img/logo.png" alt="" /></a>
			</div>
			<div class="navigation fltright">
				<!--navigation Start-->
				<ul class="sf-menu">
					<li class="active"><a href="index.jsp">首页</a></li>
                    <li id="nosep"><a href="register.jsp">注册</a></li>	            
				</ul>
			</div>
			<!--navigation End-->
		</div>
		<!--header End-->

	</header>
	<!--header_wrapper End-->

<section class="container_middle"><!--container_top Start-->
		<section class="container_top"><!--container_bottom Start-->
			<section class="container_bottom"><!--container_middle Start-->
				<section class="cotent_bolck1"> <!--cotent_bolck1 Start-->
        		<div class="block_left fltleft" src=> <!--block_left Start-->
        		<iframe width="453" height="309" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" 
                                	src="img/login.jpg";spn=21.597575,39.726562&amp;z=4&amp;output=embed">
                                	</iframe><br />
        		</div><!--block_left End-->
		        <div class="block_right fltright"> <!--block_right Start-->
                        <div class="formArea2"> <!--formArea2 Start-->
                        <html:errors/>
                            <logic:present name="msg" scope="request">
                                <h4>${msg}</h4>
                            </logic:present>
                        	<form action="login.do" method="post" onsubmit="return checkForm()">
                            	<div class="form_boxMid"> <!--form_boxMid Start-->
                                	<div class="form_boxTop"> <!--form_boxTop Start-->
                                    	<div class="form_boxBottom">
                                    	<h4 class="text_left">用户名: 
                                    	    <span id="username" style="color:red">
                                    	    <html:errors property="username" ></html:errors>
                                    	    </span>
                                    	</h4>                                  	
                                        <input name="username" type="text" class="text_field2" placeholder="6到12个字符 ...." 
                                            onclick="" onfocus="this.select()" onblur="checkinserver('username',this.value);" />                                                                                                                                                                   
                                         <h4 class="text_left" >密码:
                                         	<span id="confirmerror" style="color:red"> 
                                              <html:errors property="password" ></html:errors>
                                             </span> 
                                         </h4>                                             
                                         <input name="passwordConfirm" id="passwordConfirm" type="password" class="text_field2" placeholder="请输入密码 ...." 
                                            onclick="this.value='';" onfocus="this.select()" onblur="confirmPassword();" />
                                           <div class="clear"></div>
                                        </div>
                                    </div> <!--form_boxTop End-->
                                </div> <!--form_boxMid End-->
                                <div class="form_botton_box"> <!--form_botton_box Start-->
                                	<input name="" type="submit" value="登录" class="form_btn2" />
                                </div> <!--form_botton_box End-->
                            </form>
                        </div> <!--formArea2 End--> 
                    </div> <!--block_right End-->
                   <div class="clear"></div>
                   </section> <!--cotent_bolck1 End-->
                   </section><!--content_main2 End-->                   
             </section>
	</section>
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

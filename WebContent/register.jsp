<%-- 
    Document   : main
    Created on : 2012-10-11, 10:24:12
    Author     : rock
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/superfish.css" rel="stylesheet" type="text/css" />
<link href='http://fonts.googleapis.com/css?family=PT+Serif' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'>
<!-- ICONS -->
    <link rel="shortcut icon" href="img/favicon.png"/>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jflickrfeed.js"></script>
<script type="text/javascript" src="js/jquery.twitter.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/checkinserver.js"></script>

<!--[if IE 7]>
<style type="text/css">
	.container_bottom {*padding:12px 0 35px 0;}
    .contentBlock1 {*padding:0 0 15px 0;}
    .getPad1 {*padding:0px;}
    .full_width {*padding:40px 13px 0 28px;}
    .full_block_top {*padding:0 0 25px 0;}
    .content_main2 {*padding:12px 12px 0 12px;}
    .small_PicBox {*margin:0 8px -3px 0;}
    .getPad2 {*padding:12px 12px 0 12px;}
    .cont_bottom {*padding:12px 12px 0 12px;}
</style>
<![endif]-->

</head>
<body class="bg6">
	<jsp:include page="headblock.jsp"></jsp:include>
	<section class="container_middle"><!--container_top Start-->
		<section class="container_top"><!--container_bottom Start-->
			<section class="container_bottom"><!--container_middle Start-->
				<section class="cotent_bolck1"> <!--cotent_bolck1 Start-->
                	<div class="block_left fltleft"> <!--block_left Start-->
                        <div class="formArea2"> <!--formArea2 Start-->
                        <h3>新用户注册</h3>
                        	<form action="register.do" method="post" onsubmit="return checkForm()">
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
                                                                                       
                                        <h4 class="text_left" >Email:
                                            <span id="email" style="color:red">
                                            <html:errors property="email" ></html:errors>
                                            </span>
                                        </h4>
                                        <input name="email" type="email" class="text_field2" placeholder="你的电子邮箱 ...."
                                            onclick="" onfocus="this.select()" onblur="checkinserver('email',this.value);"  />
                                       
                                         <h4 class="text_left" >密码:  
                                         	<span id="passworderror" style="color:red"></span>                                     
                                         </h4>
                                         <input name="password1" id="password" type="password" class="text_field2" placeholder="6到12个字符 ...." 
                                           onclick="this.value='';" onfocus="this.select()" onblur="checkLength(this.value);" />
                                         <h4 class="text_left" >确认密码:
                                         	<span id="confirmerror" style="color:red"> 
                                              <html:errors property="password" ></html:errors>
                                             </span> 
                                         </h4>                                             
                                         <input name="passwordConfirm" id="passwordConfirm" type="password" class="text_field2" placeholder="请重新输入上面的密码 ...." 
                                            onclick="this.value='';" onfocus="this.select()" onblur="confirmPassword();" />
                                           <div class="clear"></div>
                                        </div>
                                    </div> <!--form_boxTop End-->
                                </div> <!--form_boxMid End-->
                                <div class="form_botton_box"> <!--form_botton_box Start-->
                                	<input name="" type="submit" value="提交信息" class="form_btn2" />
                                </div> <!--form_botton_box End-->
                            </form>
                        </div> <!--formArea2 End--> 
                    </div> <!--block_left End-->

                   <div class="block_right fltright"> <!--block_right Start-->
				               欢迎！！        
				       <div class="mapArea"> <!--mapArea Start-->
                        	<h3>FIND US ON THE MAP!</h3>
                            	<div class="map_PicBox"> <!--map_PicBox Start-->
                                	<iframe width="453" height="309" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" 
                                	src="http://maps.google.com/?ie=UTF8&amp;t=h&amp;ll=37.09024,-95.712891&amp;spn=21.597575,39.726562&amp;z=4&amp;output=embed">
                                	</iframe><br />
                                	<small><a href="http://maps.google.com/?ie=UTF8&amp;t=h&amp;ll=37.09024,-95.712891&amp;spn=21.597575,39.726562&amp;z=4&amp;source=embed" 
                                	style="color:#0000FF;text-align:left"></a>
                                	</small>
                                </div> <!--map_PicBox End--> 
                                
                                <div class="adderssBox"> <!--adderssBox Start-->
                                	<h2>CONTACT INFORMATION</h2>
                                    	<div class="text_left fltleft">
                                        	Move Studio <br />
                                            Technoparkstrasse 1 <br />
                                            8005 Milano <br />
                                            Italy
                                        </div>
                                        
                                        <div class="text_right fltright">
                                        	Tel: (555) 216-4404 <br />
                                            E: <a href="#">johndoe@gmail.com</a> <br />
                                            Twitter: @fiximGFX
                                        </div>
                                        <div class="clear"></div>
                                </div> <!--adderssBox End-->
                        </div> <!--mapArea End-->       
			       </div> <!--block_right End-->
                   <div class="clear"></div>
               </section> <!--cotent_bolck1 End-->
			</section><!--content_main2 End-->
		</section>
	</section>

	<footer class="footerwrapper1">
		<!--footerwrapper_bottom Start-->
		<section class="footer_main">
			<!--footer_main Start-->
			<section class="footer_top">
				<div class="box2">
					<img src="img/logo3.png" alt="" />
				</div>

				<div class="box2">Twitter Widget</div>

				<div class="box2">Recent Comments</div>

				<div class="box2 nomar2">Flickr Widget</div>
				<div class="clear"></div>
			</section>
			<!--footer_top End-->
			<section class="footer_mid">
				<!--footer_mid Start-->

			</section>
			<!--footer_mid End-->

			<section class="footer_bottom">
				<!--footer_bottom Start-->

				<div class="bottomRight fltright">
					<!--bottomRight Start-->
					<div class="copy_right">&copy; 2013 Fixim. All rights
						reserved.</div>
				</div>
				<!--bottomRight End-->
				<!--bottomRight End-->
				<div class="clear"></div>

			</section>
			<!--footer_bottom End-->
		</section>
		<!--footer_main End-->
	</footer>
	<!--footerwrapper_bottom Start-->
	<div style="display: none">
		<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540'
			language='JavaScript' charset='gb2312'></script>
	</div>

</body>
</html>

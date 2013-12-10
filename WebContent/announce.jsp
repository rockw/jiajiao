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
<title>我的资料</title>

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
    
    #headphoto {float: left;}
    #baseinfo {padding-left:210px;}
  
</style>



<!-- [endif] -->
	

</head>
<body>
	 <jsp:include page="headblock.jsp"></jsp:include>

<section class="container_middle"> <!--container_top Start-->
  <section class="container_top"> <!--container_bottom Start-->
    <section class="container_bottom"> <!--container_middle Start-->
      <section class="content_main2"> <!--content_main2 Start-->
      <form >
      	<div> 
			我&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp是   ：
			<select>
				<option>学生，想找老师</option>
				<option>老师，想找学生</option>
			</select><br><br>
			   地&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp点   ：	
      	    <input name="country" list="country_list" value="中国" oninput="find_country(this.value);"/>
      	    <datalist id="country_list">
	           <option label="W3School" value="http://www.w3school.com.cn" />
	           <option label="Google" value="http://www.google.com" />
	           <option label="Microsoft" value="http://www.microsoft.com" />
            </datalist>
			<select name="province">
				<option>上海</option>
			</select> 
			<select name="city">
				<option></option>
			</select>
			<select name="area" placeholder="区，县">
				<option></option>
			</select> 
			<input name="street"  placeholder="街道、小区"> <br><br>   
			教授年级 ：
			<select>
				<option>高中</option>
				<option>高一</option>
				<option>高二</option>
				<option>高三</option>
				<option>初中</option>
				<option>初一</option>
				<option>初二</option>
				<option>初三</option>
				<option>小学</option>
				<option>高中和初中</option>
				<option>初中和小学</option>
				<option>学前</option>
				<option>不限</option>
			</select><br><br>
			教授科目 ：
			<select>
				<option>数学</option>
				<option>英语</option>
				<option>语文</option>
				<option>奥数</option>
				<option>物理</option>
				<option>化学</option>
				<option>美术</option>
				<option>钢琴</option>
			</select>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp其它：<input /><br><br>
			价&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp格 ：
			<select>
				<option>20元 以下/小时</option>
				<option>20元-30 元/小时</option>
				<option>30元-40 元/小时</option>
				<option>40元-50 元/小时</option>
				<option>50元-70 元/小时</option>
				<option>70元-100 元/小时</option>
				<option>100元以上 /小时</option>
				<option>面谈</option>
			</select> <br><br>
			授课方式 ：
			<select>
				<option>老师上门</option>
				<option>学生上门</option>
				<option>面谈</option>
			</select> <br><br>
			授课时间 ：
			<select>
				<option>周一至周五</option>
				<option>周五周六</option>
				<option>寒暑假</option>
				<option>面谈</option>
			</select> <br><br>
			手&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp机 ：<input/>
		</div>
		<div class="form_botton_box"> <!--form_botton_box Start-->
            <input name="" type="button" value="提交信息" class="form_btn2" />
        </div> <!--form_botton_box End-->
	</form>
           </section> <!--content_main2 End-->
        
      </section> <!--content_main2 End-->
      <div class="clear"></div>
    </section>
      </section>
     
      
	<div>
		<menu></menu>
	</div>



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

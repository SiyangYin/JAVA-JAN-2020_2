<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Q&ASystemBasedonSocialNetworks</title>
<meta name="keywords" content="HTML, CSS, Design Gallery, CSS Template, Free Download, Website Layout" />
<meta name="description" content="Beautiful Design Gallery, CSS Template, Free Download" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="Shortcut Icon" href="images/p.png" type="image/x-icon" />
<script>
    function check(){
        var a = document.ff.name.value;
        var b = document.ff.user.value;
        var c = document.ff.pass.value;
        var d = document.ff.email.value;
        var e = document.ff.dob.value;
        var f = document.ff.loc.value;
        var g = document.ff.sex.value;
        
   
         if(a==0){
            alert('Please Enter Name');
           document.getElementById("name").focus();          
           return false;
       } if(b==0){
            alert('Please Enter Userid');
           document.getElementById("user").focus();            
            return false;
      
        } if(c==0){
            alert('Please Enter Password');
            document.getElementById("pass").focus();            
            return false;
            
        } if(d==0){
            alert('Please Enter E-mail Id');
            document.getElementById("email").focus();            
            return false;
            
        } if(e==0){
            alert('Please Enter Date of Birth');
            document.getElementById("dob").focus();            
            return false;
            
        } if(f==0){
            alert('Please Enter Your Interest');
            document.getElementById("loc").focus();            
            return false;
            
        } if(g==0){
            alert('Please Enter Gender');
            document.getElementById("sex").focus();            
            return false;
            
        } 
        
    }
    
    
</script>
</head>
<body>
    <%
if(request.getParameter("msgg")!=null) {
out.println("<script>alert('Error Found..!!')</script>");
}                       

%>
<!--  Free CSS Templates from www.templatemo.com -->
	<div id="templatemo_background_top">
    
		<div class="templatemo_container">
        
        	<div id="templatemo_header">
            </div>
            
            <div class="templatemo_content">
            	<div id="templatemo_content_white_top">
                	<div id="templatemo_menu">
        				<ul>
                            <li><a href="index.jsp"  class="current">Home</a></li>
                            <li><a href="userlog.jsp">UserLogin</a></li>                          
                            <li><a href="regpage.jsp">User Register</a></li>            
                        </ul>
				</div>
                </div>
                <div id="templatemo_content_white_middle">
                	<div class="templatemo_post_area">
                    
                    	<h1>Abstract</h1>
                      <p><img alt="Design Gallery" src="images/templatemo_thumb_1.jpg" />
                         Recently, emerging research efforts have been focused on question and answer (Q&A) systems based on social networks.
The social-based Q&A systems can answer non-factual questions, which cannot be easily resolved by web search engines. These
systems either rely on a centralized server for identifying friends based on social information or broadcast a user?s questions to all of its
friends. Mobile Q&A systems, where mobile nodes access the Q&A systems through Internet, are very promising considering the rapid
increase of mobile users and the convenience of practical use. However, such systems cannot directly use the previous centralized
methods or broadcasting methods, which generate high cost of mobile Internet access, node overload, and high server bandwidth cost
with the tremendous number of mobile users. We propose a distributed Social-based mObile Q&A System (SOS) with low overhead
and system cost as well as quick response to question askers. SOS enables mobile users to forward questions to potential answerers
in their friend lists in a decentralized manner for a number of hops before resorting to the server. It leverages lightweight knowledge
engineering techniques to accurately identify friends who are able to and willing to answer questions, thus reducing the search and
computation costs of mobile nodes. The trace-driven simulation results show that SOS can achieve a high query precision and recall
rate, a short response latency and low overhead. We have also deployed a pilot version of SOS for use in a small group in Clemson
University. The feedback from the users shows that SOS can provide high-quality answers
                      </p>
                     
                        
          				
                           
                        
						<div class="cleaner_with_height"></div>
                    </div><!-- End Of Post Area -->
                </div><!-- End Of Content Middle -->
            </div><!-- End Of Content -->
        </div><!-- End Of Container --> 
    </div><!-- End Of Background Top --> 
	<div id="templatemo_background_middle">
    	<div class="templatemo_container">
        	<div class="templatemo_content">
                <div id="templatemo_content_white_blue_joint">
                </div>
                
                <div id="templatemo_content_blue_middle">
                	<div class="templatemo_post_area">
                    	<h1>User Register here..!</h1>
                        <p><a href="http://www.templatemo.com" target="_parent"><img src="images/templatemo_thumbs.jpg" alt="Free CSS Templates" border="0" /></a></p>
                      <h2></h2>
              <p class="color-4 p1" style="text-align: justify; width: 900px; "> 
              <form action="regaction.jsp" name="ff"  method="get" onsubmit="return check()">
                    Name: <br><input type="text" name="name" id="name" style="background:  #aaa; height: 28px;  width:250px;"><br><br>
                    UserId: <br><input type="text" name="user" id="user" style="background:  #aaa; height: 28px;  width:250px;"><br><br>
                    Password: <br><input type="password" name="pass" id="pass" style="background:  #aaa; height: 28px;  width:250px;"><br><br>
                    Email Id:<br> <input type="email" name="email" id="mail" style="background:  #aaa; height: 28px;  width:250px;"><br><br>
                    Date of Birth:<br> <input type="date" name="dob" id="dob" style="background:  #aaa; height: 28px;  width:250px;"><br><br>
<!--                 Interest:<br> <input type="text" name="loc" id="loc" style="background:  #aaa; height: 28px;  width:250px;"><br><br>-->
Interest:<br><select name="loc" id="loc" style="background:  #aaa; height: 28px;  width:250px;">
    <option>Music</option>
    <option>Education</option>
    <option>Sports</option>
    <option>Entertainment</option>
</select>
<br><br></br>
                    Gender:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name ="sex" id="sex" style="background:  #aaa; height: 28px;  width:180px;"><option>Male</option>
                        <option>Female</option>
                    </select><br></br>
                    
                    
                    <div style="margin-left: 3px;">  
                        <input type="submit" value="Register!!" style="background-color: green; height: 30px; border: 4px; font-weight: bold;">&nbsp;&nbsp;&nbsp;
                    </form>
                    <input type="reset" value="Clear" style="background-color: red; height: 30px; width: 80px; border: 4px; font-weight: bold;"></div>
             
                        <p><a href="#">Read Details</a></p>
                      <div class="cleaner_with_height"></div>
                    </div>
                </div><!-- End Of Content Middle -->
                
                <div id="templatemo_content_blue_two_col_joint">
                </div>
                
                <div id="templatemo_content_two_col_middle">
                	<div class="templatemo_post_area_left">
                    	<h1>Who We Are</h1>
                    <img alt="Design Blog" src="images/templatemo_thumb_2.jpg" />
<!--                         <img src="images/suma2.png" width="200" height="200">-->
                    </div><!-- End Of Post Area left -->
                    
                    <div class="templatemo_post_area_right">
                    	<h1>Testimonials</h1>
                        <div class="post_area">
                        	 
                            <img src="images/suma.png" width="350" height="200">
                        </div>         <!-- End Of Post Area t -->               
                    </div><!-- End Of Post Area Right -->
                    <div class="cleaner_with_height"></div>
                </div>
                
                <div id="templatemo_content_two_col_bottom">
                </div>
                <div class="templatemo_copyright">           
                	Copyright ? 2015 
                </div>
                
            </div>
        </div><!-- End Of Container --> 
    <!--  Download CSS Templates from www.templatemo.com -->  
	</div><!-- End Of Background Middle --> 
<div align=center></div></body>
</html>
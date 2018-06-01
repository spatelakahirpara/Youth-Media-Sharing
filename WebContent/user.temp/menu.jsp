<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="col-sm-3 col-md-2 sidebar" style="background: #185C85 none repeat scroll 0px 0px;">
<!-- <nav class="col-sm-3 col-md-2 sidebar" style="background: #185c85 none repeat scroll 0px 0px;"> -->
			<div class="top-navigation">
				<div class="t-menu">MENU</div>
				<div class="t-img">
					<img src="images/lines.png" alt="" />
				</div>
				<div class="clearfix"> </div>
			</div>
		
<div class="drop-navigation drop-navigation">

				  <ul class="nav nav-sidebar">
					<li class="active"><a href="dashboard.jsp" class="home-icon"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
					<li><a href="serial.jsp" class="user-icon"><span class="glyphicon glyphicon-home glyphicon-blackboard" aria-hidden="true"></span>TV Shows</a></li>
					
					<li><a class="menu1"><span class="glyphicon glyphicon-film" aria-hidden="true"></span>Movies<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a></li>
						<ul class="cl-effect-2">
							<li><a href="movies.jsp">English</a></li>                                             
							<li><a href="movies.jsp">Chinese</a></li>
							<li><a href="movies.jsp">Hindi</a></li> 
						</ul>
						<!-- script-for-menu -->
						<script>
							$( "li a.menu1" ).click(function() {
							$( "ul.cl-effect-2" ).slideToggle( 300, function() {
							// Animation complete.
							});
							});
						</script>
					<li><a  class="menu"><span class="glyphicon glyphicon-film glyphicon-king" aria-hidden="true"></span>Sports<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a></li>
						<ul class="cl-effect-1">
							<li><a href="sports.jsp">Football</a></li>                                             
							<li><a href="sports.jsp">Cricket</a></li>
							<li><a href="sports.jsp">Tennis</a></li> 
							<li><a href="sports.jsp">Shattil</a></li>  
						</ul>
						<!-- script-for-menu -->
						<script>
							$( "li a.menu" ).click(function() {
							$( "ul.cl-effect-1" ).slideToggle( 300, function() {
							// Animation complete.
							});
							});
						</script>
					<li><a href="movies.jsp" class="song-icon"><span class="glyphicon glyphicon-music" aria-hidden="true"></span>Songs</a></li>
					<li><a href="news.jsp" class="news-icon"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>News</a></li>
					<c:if test="${sessionScope.usertype eq 'User' }">
					<li><a href="feedback.jsp" class="news-icon"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>Feedback</a></li>
					<li><a href="complain.jsp" class="news-icon"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>Complain</a></li>
					</c:if>
					<li><a href="Index4.jsp" class="sub-icon"><span class="glyphicon glyphicon-home glyphicon-hourglass" aria-hidden="true"></span>Comparision</a></li>
				  </ul>
				  <!-- script-for-menu -->
						<script>
							$( ".top-navigation" ).click(function() {
							$( ".drop-navigation" ).slideToggle( 300, function() {
							// Animation complete.
							});
							});
						</script>
					<div class="side-bottom">
						<div class="side-bottom-icons">
							<ul class="nav2">
								<li><a href="#" class="facebook"> </a></li>
								<li><a href="#" class="facebook twitter"> </a></li>
								<li><a href="#" class="facebook chrome"> </a></li>
								<li><a href="#" class="facebook dribbble"> </a></li>
							</ul>
						</div>
						
					</div>
				</div>
				</div>
				
</body>
</html>
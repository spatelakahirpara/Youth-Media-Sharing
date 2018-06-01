    <!-- #732FCD
    youth media background #131E30 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" style="background: rgb(44, 60, 95) none repeat scroll 0px 0px;">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="dashboard.jsp"><h1><img src="images/logo-final.png" STYLE="width: 230px;" alt="" /></h1></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
			<div class="top-search">
				<form class="navbar-form navbar-right"   method="post">
					<input type="text" class="form-control" placeholder="Search..." >
					<input type="submit" value=" ">
				</form>
			</div>
			<div class="header-top-right">
				<div class="file">
					<a href="<%=request.getContextPath() %>/FileUploadController?flag=uploadvideo">Upload</a>
				</div>	
				<div class="signin">
				<c:if test="${sessionScope.usertype ne 'User' }">
					<a href="<%=request.getContextPath() %>/RegistrationController?flag=drop" class="play-icon popup-with-zoom-anim">Sign Up</a>
				</c:if>
					<!-- pop-up-box -->
									<script type="text/javascript" src="js/modernizr.custom.min.js"></script>    
									<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
									<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
									<!--//pop-up-box -->
									
									</div>
									<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
									<c:if test="${sessionScope.usertype ne 'User'}">
				<div class="signin">
					<a href="../user.side/login.jsp" class="play-icon popup-with-zoom-anim">Log In</a>
					</div>
					</c:if>
									<c:if test="${sessionScope.usertype eq 'User'}">
				<div class="signin">
					<a href="abc?flag=logout" class="play-icon popup-with-zoom-anim">Log Out</a>
					</div>
					</c:if>
				<div class="clearfix"> </div>
			</div>
        </div>
		<div class="clearfix"> </div>
      </div>
    </nav>
</body>
</html>
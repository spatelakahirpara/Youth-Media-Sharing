<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><!DOCTYPE HTML>
<html>
<head>
<title>My Play a Entertainment Category Flat Bootstrap Responsive Website Template | Movies :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="My Play Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' media="all" />
<!-- //bootstrap -->
<link href="css/dashboard.css" rel="stylesheet">
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
<script src="js/jquery-1.11.1.min.js"></script>
<!--start-smoth-scrolling-->
<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
<!-- //fonts -->
</head>
  <body>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
ga('create', 'UA-30027142-1', 'w3layouts.com');
  ga('send', 'pageview');
</script>
<script async type='text/javascript' src='//cdn.fancybar.net/ac/fancybar.js?zoneid=1502&serve=C6ADVKE&placement=w3layouts' id='_fancybar_js'></script>


<jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="menu.jsp"></jsp:include>
  
        <div class="col-sm-9 col-sm-offset-3 col-md-5 col-md-offset-2 main">
		<h3>Upload Video</h3>

<div class="all-comments">
						
							
							<div class="box">
								<form action="<%=request.getContextPath() %>/FileUploadController" method="post" enctype="multipart/form-data">
								<input type="hidden" name="flag" value="userupload">
								<div class="form-group">
								<h4>Video Name</h4>
								</div>
								<div>
									<input type="text" class="form-control" id="exampleInputName" name="video_name">
									</div>
								<div class="form-group">
								<h4>	Category</h4>			           					   
								
									<select class="form-control" id="exampleInputState" name="select_category">
                    	<c:forEach items="${sessionScope.subcategoryList}" var="i">                      
                    	<option value="${i.cat_id }">${i.cat_name }</option>
                    	</c:forEach>
                        </select>
								</div>
								<div class="form-group">
									<h4>Subcategory</h4>
									<select class="form-control" id="exampleInputState" name="select_subcategory">
                    <c:forEach items="${sessionScope.subcategoryList1}" var="j">                      
                    <option value="${j.subcat_id }" >${j.subcat_name }</option>
                    </c:forEach>
                        </select>   
                   
								</div>
								<div class="form-group">
								<h4>Select File</h4>
								<div id="actions" class="row">
								
                    				<div id="fileUpload">
								 <input type="file" value="add file" name="abc">
									</div>
								</div>
								<div align="right">
									<input type="submit" value="upload">
									</div>
									<div class="clearfix"> </div>
								</form>
							</div>
							
                        
								
							</div>
						</div>
	
					</div>
</body>
</html>
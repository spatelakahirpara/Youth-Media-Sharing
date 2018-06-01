<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin-file upload</title>
</head>
<body>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="shortcut icon" href="../src/img/favicon.ico">
    <title>youth media sharing</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Ubuntu:300,400,700' rel='stylesheet' type='text/css'>

    <link href="css/sugarrush.css" rel="stylesheet" type="text/css">

    <!-- SugarRush CSS -->
    <!-- <link href="css/sugarrush.css" rel="stylesheet"> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body class="">
    <div class="animsition">  
    
      <!-- start of LOGO CONTAINER -->
      
      <!-- end of LOGO CONTAINER -->

      <!-- - - - - - - - - - - - - -->
       <!-- start of SIDEBAR        -->
      <!-- - - - - - - - - - - - - -->
      <jsp:include page="menu.jsp"></jsp:include>
      <!-- - - - - - - - - - - - - -->
      <!-- end of SIDEBAR          -->
            <!-- - - - - - - - - - - - - -->

      <main id="playground">

            
        <!-- - - - - - - - - - - - - -->
        <!-- start of TOP NAVIGATION -->
        <!-- - - - - - - - - - - - - -->
        <jsp:include page="header.jsp"></jsp:include>
        <!-- - - - - - - - - - - - - -->
        <!-- end of TOP NAVIGATION   -->
        <!-- - - - - - - - - - - - - -->


        <!-- PAGE TITLE -->
        <section id="page-title" class="row">

          <div class="col-md-8">
            <h1>Post video</h1>
          </div>

          <div class="col-md-4">

            <ol class="breadcrumb pull-right no-margin-bottom">
              <li><a href="#">Admin panel</a></li>
              <li><a href="#">Users</a></li>
              <li class="active">New user</li>
            </ol>

          </div>
        </section> <!-- / PAGE TITLE -->

        <div class="container-fluid">
          <div class="row">
       
            <div class="col-md-6">

              <section class="panel">
                <header class="panel-heading">
                  <h3 class="panel-title">Insert information</h3>
                </header>
                <div class="panel-body">
                  <form action="<%=request.getContextPath() %>/FileUploadController" method="post"  enctype="multipart/form-data">
                  <input type="hidden" name="flag" value="insert">
                    <div class="form-group">
                      <label for="exampleInputName">Video Name</label>
                      <input type="text" class="form-control" id="exampleInputName" name="video_name">
                    </div>
                    
                    <div class="form-group">
                      <label>Category</label>
                      <select class="form-control" id="exampleInputState" name="select_category">
                    <c:forEach items="${sessionScope.subcategoryList}" var="i">                      
                    <option value="${i.cat_id }">${i.cat_name }</option>
                    </c:forEach>
                        </select>
                            
                     </div>
                    <div class="form-group">
                      <label for="exampleInputState">Subcategory</label>
                       <select class="form-control" id="exampleInputState" name="select_subcategory">
                    <c:forEach items="${sessionScope.subcategoryList1}" var="j">                      
                    <option value="${j.subcat_id }" >${j.subcat_name }</option>
                    </c:forEach>
                        </select>   
                   
					</div>
 <div id="actions" class="row">
                    <div id="fileUpload">
                      <!-- The fileinput-button span is used to style the file input field as button -->
                      <span >
                          
                          
                          <input type="file" value="add file" name="abc">
                          
                          
                      </span>
                      <!-- <button type="submit" class="btn btn-primary start btn-sm">
                          <i class="ti-cloud-up"></i>
                          <span>Start upload</span>
                      </button>
                      <button type="reset" class="btn btn-warning cancel btn-sm">
                          <i class="ti-hand-stop"></i>
                          <span>Cancel upload</span>
                      </button> -->
                    </div>

                    <div>
                      <!-- The global file processing state -->
                      
                    </div>
                  </div> 
                  <div class="row">
                 <div class="col-md-12">
                   <div class="panel">
                     <div class="panel-body">
                     <center>
                  <button type="submit" class="btn btn-primary">Post</button></center> 
                </div>
              </div>
            </div>
          </div>
                  </form>
</div>
         </div>
              </section>

            </div> <!-- / col-md-6 -->
           
          </div> <!-- / row -->
        
        </div> <!-- / container-fluid -->     
  </main> <!-- /playground -->


    <!-- - - - - - - - - - - - - -->
    <!-- start of NOTIFICATIONS  -->
    <!-- - - - - - - - - - - - - -->
    
    <!-- - - - - - - - - - - - - -->
    <!-- start of NOTIFICATIONS  -->
    <!-- - - - - - - - - - - - - -->

    <div class="scroll-top">
      <i class="ti-angle-up"></i>
    </div>
  </div> <!-- /animsition -->

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="js/raphael-min.js"></script>
  <script src="js/jquery-1.11.2.min.js"></script>
  <script src="js/jquery-ui.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/jquery.animsition.min.js"></script>

  <script src="js/includes.js"></script>
  <script src="js/sugarrush.js"></script>
  <script src="js/sugarrush.forms.js"></script>
  

</body>
</html>
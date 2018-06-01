<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin-reply</title>
</head>
<body>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="shortcut icon" href="img/favicon.ico">
    <title>SugarRush - Admin template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Ubuntu:300,400,700' rel='stylesheet' type='text/css'>

    <link href="css/sugarrush.css" rel="stylesheet" type="text/css">

    
  </head>

  <body class="">
   
      <jsp:include page="menu.jsp"></jsp:include>
         <main id="playground">
      <jsp:include page="header.jsp"></jsp:include>
        <!-- PAGE TITLE -->
        <section id="page-title" class="row">

          <div class="col-md-8">
            <h1> Complain Reply </h1>
          </div>

         
        </section> <!-- / PAGE TITLE -->
        
        
        <div class="container-fluid">
          <div class="row">
       
            <div class="col-md-6">

              <section class="panel">
                
                <div class="panel-body">
                	
                  <form action="<%=request.getContextPath() %>/ComplainController" method="post">
                  
                  <c:forEach items="${sessionScope.complainList}" var="i">
								<input type="hidden" name="complainTo" value="${i.complainFrom.login_id}"/>
					<input type="hidden" name="flag" value="replyPost"/>			
                    <div class="form-group">
                      <label for="exampleInputName">Complain Name</label>
                      <div class="control-group">
                      <input type="text" value="${i.complainName}" class="form-control" name="complainName" required/>
                    </div>
                    </div>
                    
                      <div class="form-group">
                      <label for="exampleInputLName">Complain Description</label>
                      <div class="panel-body">
						<textarea class="form-control" name="complaindescriptionName" required>${i.complainDescription}</textarea>
											
						</div>                 
                    </div>     
                    <div class="form-group">
                      <label for="exampleInputLName">Reply Complain</label>
                      <div class="panel-body">
						
							<textarea class="form-control" placeholder="enter text here." rows="5" name="replydescriptionName" id="exampleInputLName"></textarea>
						
						</div>                 
                    </div>                   
                    
                    <div class="row">
                 <div class="col-md-12">
                   <div class="panel">
                     <div class="panel-body">
                  <button type="submit" class="btn btn-primary">Submit</button> 
                </div>
              </div>
            </div>
            </div>
            </c:forEach>
            </form>
          </div>
			

                    
                  
                </div>
              </section>

            </div> <!-- / col-md-6 -->

            

          </div> <!-- / row -->

          

        </div> <!-- / container-fluid -->
        </main>  <div class="scroll-top">
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
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath }/user.side/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="img/background.jpg">

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login | SugarRush - Admin template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:900,300,400' rel='stylesheet' type='text/css'>

    <link href="css/sugarrush.css" rel="stylesheet" type="text/css">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body class="login-page">
    <div class="animsition">

      <main class="login-container">

        <div class="panel-container">
          <section class="panel">
          <header class="panel-heading">
             <img src="img/logo-final.png">
            
           <br>
              Login
            </header>
            <div class="panel-body">
              <form action="abc" method="post">
              <input type="hidden" name="flag" value="login">
                <div class="form-group">
                  <label for="username">Username</label>
                  <input type="text" name="username" class="form-control" id="username" placeholder="Username">
                </div>

                <div class="form-group">
                  <label for="password">Password</label> <a href="recover.html" class="pull-right forgot-link">
                 <!--  <small>Forgot?</small> --></a>
                  <input type="password" name="password" class="form-control" id="password" placeholder="Password">
                </div>
                
                <div class="form-group text-center">
                  <input type="submit" value="Login" class="btn-login btn btn-primary">
                </div>

                
              </form>
              <hr>
              <div class="register-now">
                Not registered? <a href="<%=request.getContextPath()%>/RegistrationController?flag=drop">Register now</a>
              </div>
            </div>
          </section>
        </div>
      </main> <!-- /playground -->

      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <script src="js/jquery-1.11.2.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <!-- Include all compiled plugins (below), or include individual files as needed -->
      <script src="js/jquery.animsition.min.js"></script>
      <script src="js/login.js"></script>

    </div>
  </body>
</html>
</body>
</html>
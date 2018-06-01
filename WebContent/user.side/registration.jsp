<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function checkPasswordMatch() {
    var password = $("#password").val();
    var confirmPassword = $("#repeat-password").val();

    if (password != confirmPassword)
        $("#divCheckPasswordMatch").html("Passwords do not match!");
    else
        $("#divCheckPasswordMatch").html("Passwords match.");
}
</script>


</head>
<body >
 

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register | SugarRush - Admin template</title>

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

      <main class="register-container">
    

        <div class="panel-container">
          
          <section class="panel">
            <header class="panel-heading">
            <img src="img/logo-final.png">
            
           <br>
              
              <p>Registration</p>
            </header>
            <div class="panel-body">
              <form action="<%=request.getContextPath() %>/RegistrationController" method="post">
              <input type="hidden" name="flag" value="insert">
              
              
              <div class="form-group">
                  <label for="name"> First Name</label>
                  <input type="text" name="f_name" class="form-control" id="name" placeholder="Type in your name">
                </div>
              <div class="form-group">
                  <label for="lastname">Last name</label>
                  <input type="text" name="l_name" class="form-control" id="lastname" placeholder="Type in your last name">
                </div>
                <div class="form-group">
                
                  <label for="username">Username</label>
                  <input type="text" name="u_name" class="form-control" id="username" placeholder="Choose a username">
                </div>

                <div class="form-group">
                  <label for="email">E-mail</label>
                  <input type="email" name="email" class="form-control" id="email" placeholder="Type in your e-mail">
                </div>

                <div class="form-group">
                  <label for="password">Password</label>
                  <input type="password" name="password" class="form-control" id="password" placeholder="Password"><br>
                  </div>
                  <div class="form-group">
                  <label for="password">repeat-Password</label>
                  <input type="password" name="repassword" class="form-control" id="repeat-password" placeholder="Repeat your password" onChange="checkPasswordMatch();">
                </div>
                <font color="red">
                <div class="registrationFormAlert" id="divCheckPasswordMatch">
</div></font>

             
                 <div class="form-group">
                      <label for="exampleInputAddress">Address</label>
                      <div class="input-group">
                        <span class="input-group-addon"><i class="ti-home"></i></span>
                        <input type="text" name="address" class="form-control" id="exampleInputAddress">
                      </div>
                    </div>
                     <div class="form-group">
                      <label for="exampleInputState">City</label>
                      <select name="city" class="form-control" id="exampleInputState">
                        <c:forEach items="${sessionScope.list1 }" var="i">                      
                    <option value="${i.city_id }">${i.city_name }</option>
                    </c:forEach>
                        </select>
                        </div>
                        
                     <div class="form-group">
                     
                      <label for="exampleInputState">State</label>
                      <select name="state" class="form-control" id="exampleInputState">
                        <c:forEach items="${sessionScope.list2 }" var="j">                      
                    <option value="${j.state_id }">${j.state_name }</option>
                    </c:forEach>
                        </select>
                        </div>
                       
                <div class="form-group">
                      <label>Country</label>
                      <select name="country" class="form-control">
                        <c:forEach items="${sessionScope.list3 }" var="k">                      
                    <option value="${k.country_id }">${k.country_name }</option>
                    </c:forEach>
                        </select>
                        </div>

                <div class="form-group text-center">
                  <input type="submit" value="Register" class="btn-login btn btn-primary"> 
                  <input type="reset" value="Cancel" class="btn-login btn btn-danger">
                </div>
              </form>
              <hr>
              <div class="register-now">
                Already a user? <a href="login.jsp">Sign in</a>
              </div>
            </div>
          </section>
        </div>
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
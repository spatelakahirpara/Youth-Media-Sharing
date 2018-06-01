<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin-add category</title>
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

    <!-- SugarRush CSS -->
    <!-- <link href="../css/sugarrush.css" rel="stylesheet"> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body class="">
    

      <!-- - - - - - - - - - - - - -->
       <!-- - - - - - - - - - - - - -->
      <!-- start of SIDEBAR        -->
      <!-- - - - - - - - - - - - - -->
      
      <jsp:include page="menu.jsp"></jsp:include>
      
      <!-- - - - - - - - - - - - - -->
      <!-- end of SIDEBAR          -->
      <!-- - - - - - - - - - - - - -->
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
            <h1>Add Category</h1>
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
                
                <div class="panel-body">
                  <form action="<%=request.getContextPath() %>/addcategorycontroller" method="post">
                  <input type="hidden" name="flag" value="insert">
                    <div class="form-group">
                      <label for="exampleInputName">Category Name</label>
                      <div class="control-group">
                      <input type="text" class="form-control" name="category_name" id="exampleInputName" required>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputName">Region</label>                      
                       <select class="form-control" name="select_region" >
                       
                        <option value="us-west-2">Oregon</option>
                        <option value="us-west-1">Northern California</option>
                        <option value="ap-southeast-1">Singapore</option>
                        <option value="ap-northeast-1">Tokyo</option>
                        <option value="ap-southeast-2">Sydney</option>
                        <option value="sa-east-1">Sao Paulo</option>
                        <option value="eu-central-1">Frankfurt</option>
                        <option value="ap-northeast-2">Seoul</option>
                        </select>
                        </div>
                      
                    <div class="form-group">
                      <label for="exampleInputLName">Category Description</label>
                      <div class="panel-body">
						
							<textarea class="form-control" placeholder="enter text here." rows="5" name="category_desc" id="exampleInputLName"></textarea>
						
						</div>                 
                    </div>                   
                    </div>
                    <div class="row">
                 <div class="col-md-12">
                   <div class="panel">
                     <div class="panel-body">
                  <button type="submit" class="btn btn-primary">Submit</button> <button class="btn btn-danger pull-right">Cancel</button>
                </div>
              </div>
            </div>
          </div>


                    
                  </form>
                </div>
              </section>

            </div> <!-- / col-md-6 -->

            

          </div> <!-- / row -->

          

        </div> <!-- / container-fluid -->
        </main> <!-- /playground -->


    <!-- - - - - - - - - - - - - -->
    <!-- start of NOTIFICATIONS  -->
    <!-- - - - - - - - - - - - - -->
    <aside id="multi-panel">
      <div class="container-fluid no-margin slimscroll">

        <ul id="multi-panel-tabs" class="nav nav-tabs" role="tablist">
          <li><a href="#" class="close-multi-panel"><i class="fa fa-indent"></i></a></li>
          <li role="presentation" class="active"><a href="#contacts" role="tab" id="contacts-tab" data-toggle="tab" aria-controls="contacts" aria-expanded="true">Contacts</a></li>
          <li role="presentation"><a href="#alerts" id="alerts-tab" role="tab" data-toggle="tab" aria-controls="alerts">Alerts</a></li>
        </ul> 

        <section class="panel ">
            
          <div id="multi-panel-tabs-content" class="tab-content">




            <!-- Chat -->
            <div role="tabpanel" class="tab-pane fade in active" id="contacts" aria-labelledby="contacts-tab">

              <div class="widget chat-widget list-group">
                <a class="list-group-item" href="chat.html">
                  <span class="chat-status success"></span> Daenerys Targaryen <span class="label label-warning pull-right">13</span>
                </a>
              </div>

              <div class="widget chat-widget list-group">
                <a class="list-group-item" href="chat.html">
                  <span class="chat-status success"></span> Tyrion Lannister
                </a>
              </div>

              <div class="widget chat-widget list-group">
                <a class="list-group-item" href="chat.html">
                  <span class="chat-status warning"></span> Cersei Lannister <span class="label label-warning pull-right">2</span>
                </a>
              </div>

              <div class="widget chat-widget list-group">
                <a class="list-group-item" href="chat.html">
                  <span class="chat-status danger"></span> Arya Stark
                </a>
              </div>

              <div class="widget chat-widget list-group">
                <a class="list-group-item" href="chat.html">
                  <span class="chat-status danger"></span> Sansa Stark
                </a>
              </div>

            </div> <!-- / Chat -->

            <!-- Alerts -->
            <div role="tabpanel" class="tab-pane fade" id="alerts" aria-labelledby="alerts-tab">
              
              <div class="widget">

                <h4 class="widget-title">Tasks Updated</h4>
                <div class="panel-body">
                  <div class="form-group">
                    <div class="small"><span class="initialism">HTML</span> coding <span class="pull-right label label-danger">90%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%;"></div>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="small">Server setup <span class="pull-right label label-info">21%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="21" aria-valuemin="0" aria-valuemax="100" style="width: 21%;"></div>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="small">Bandwidth <span class="pull-right label label-warning">16%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="16" aria-valuemin="0" aria-valuemax="100" style="width: 16%;"></div>
                    </div>
                  </div>
                </div>

              </div>

              <!-- MESSAGES WIDGET -->
              <div class="widget messages-widget">
                <h4 class="widget-title">New Messages</h4>
                <ul class="list-group">
                  <li class="list-group-item unread">
                    <span class="from"><a href="#">Jon Snow</a></span> <span class="label label-success">Jobs</span>
                    <p><a href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></p>
                  </li>
                  <li class="list-group-item">
                    <span class="from"><a href="#">Cersei Lannister</a></span> <span class="label label-info">PHP</span> <span class="label label-danger">Javascript</span>
                    <p><a href="#">Class aptent taciti sociosqu ad litora torquent per conubia nostra, vestibulum.</a></p>
                  </li>
                  <li class="list-group-item">
                    <span class="from"><a href="#">Sansa Stark</a></span>
                    <p><a href="#">Aenean cursus lacinia dolor et lacinia. Duis felis, venenatis et.</a></p>
                  </li>
                </ul>
              </div> <!-- / MESSAGES WIDGET -->

              <!-- MESSAGES WIDGET -->
              <div class="widget files-widget">
                <h4 class="widget-title">New Uploads</h4>
                <ul class="list-group">
                  <li class="list-group-item unread">
                    <i class="ti-clip"></i> <span class="from"><a href="#">project1.jpg</a></span> by <strong>Sansa S.</strong>
                    <a href="#" class="btn btn-danger btn-xs pull-right"><i class="ti-cloud-down"></i></a>
                  </li>
                  <li class="list-group-item">
                    <i class="ti-clip"></i> <span class="from"><a href="#">userlist.xls</a></span> by <strong>Jamie L.</strong>
                    <a href="#" class="btn btn-danger btn-xs pull-right"><i class="ti-cloud-down"></i></a>
                  </li>
                  <li class="list-group-item unread">
                    <i class="ti-clip"></i> <span class="from"><a href="#">userphoto.jpg</a></span> by <strong>John S.</strong>
                    <a href="#" class="btn btn-danger btn-xs pull-right"><i class="ti-cloud-down"></i></a>
                  </li>
                  <li class="list-group-item">
                    <i class="ti-clip"></i> <span class="from"><a href="#">item_codecanyon.rar</a></span> by <strong>Sansa S.</strong>
                    <a href="#" class="btn btn-danger btn-xs pull-right"><i class="ti-cloud-down"></i></a>
                  </li>
                </ul>
              </div> <!-- / MESSAGES WIDGET -->


            </div> <!-- / Alerts -->

          </div>

        </section>


      </div>
    </aside>
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

</body>
</html>
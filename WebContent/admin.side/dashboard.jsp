<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath }/admin.side/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin-homepage</title>
</head>
<body>
<!DOCTYPE html>

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

    <link href="css/epoch.min.css" rel="stylesheet" type="text/css">
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
            <h1>Dashboard</h1>
            <p class="lead">Welcome back. Last login on <strong>jan 12, 2015</strong>.</p>
          </div>

          <div class="col-md-4">

            <ol class="breadcrumb pull-right no-margin-bottom">
              <li><a href="#">Admin panel</a></li>
              <li class="active">Dashboard</li>
            </ol>

          </div>
        </section> <!-- / PAGE TITLE -->

        <div class="container-fluid">
          <div class="row">
       
            <div class="col-md-6">
              <div class="alert alert-warning fade in">
                  <button data-dismiss="alert" class="close close-sm" type="button">
                      <i class="ti-close"></i>
                  </button>
                  <strong>NEW VERSION!</strong>
                  <p>Version 1.43.0 is available for download.</p>
              </div>

              <section class="panel tasks-widget">
                <header class="panel-heading">
                  <h3 class="panel-title">Tasks progress</h3>
                </header>
                <div class="panel-body">

                  <div class="form-group">
                    <div class="small"><span class="initialism">HTML</span> coding <span class="pull-right label label-primary">90%</span></div>
                    <div class="progress">
                      <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%;"></div>
                    </div>
                  </div>

                  <div class="form-group">
                    <div class="small"><span class="initialism">PHP</span> <span class="pull-right label label-success">75%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 75%;"></div>
                    </div>
                  </div>

                  <div class="form-group">
                    <div class="small">Javascript <span class="pull-right label label-warning">51%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="51" aria-valuemin="0" aria-valuemax="100" style="width: 51%;"></div>
                    </div>
                  </div>

                  <div class="form-group">
                    <div class="small">Server setup <span class="pull-right label label-info">21%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="21" aria-valuemin="0" aria-valuemax="100" style="width: 21%;"></div>
                    </div>
                  </div>

                  <div class="form-group">
                    <div class="small">Domain setup <span class="pull-right label label-danger">6%</span></div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="6" aria-valuemin="0" aria-valuemax="100" style="width: 6%;"></div>
                    </div>
                  </div>
      
                </div> <!-- / panel-body -->
                <div class="panel-footer text-right">
                  <a href="#" class="btn btn-primary">All projects</a>
                </div>
              </section>


              <div class="row">
                <div class="col-md-6 no-left-padding">
                  <section class="card hovercard">
                    <div class="cardheader"></div>
                    <div class="avatar">
                        <img alt="" src="img/demoimage.gif">
                    </div>

                    <div class="info">
                        <div class="title">
                            <a href="#">Arya Stark</a>
                        </div>
                        <div class="desc">Web designer</div>
                        <div class="desc">Ninja developer</div>
                        <div class="desc">CSS guru</div>
                    </div>
                    <div class="bottom">
                        <a class="btn btn-primary btn-twitter btn-sm" href="#"><i class="ti-twitter"></i></a>
                        <a class="btn btn-danger btn-sm" rel="publisher" href="#"><i class="ti-google"></i></a>
                        <a class="btn btn-primary btn-sm" rel="publisher" href="#"><i class="ti-facebook"></i></a>
                        <a class="btn btn-warning btn-sm" rel="publisher" href="#"><i class="ti-instagram"></i></a>
                    </div>
                  </section>
                </div>
                <div class="col-md-6 no-right-padding">
                  <section class="panel widget-carousel panel-primary">
                    <header class="panel-heading">
                      <h4 class="panel-title">Facebook feed</h4>
                    </header>
                    <div class="panel-body">

                      <div class="carousel slide" data-ride="carousel" id="quote-carousel-2">
                        <!-- Bottom Carousel Indicators -->
                        <ol class="carousel-indicators">
                          <li data-target="#quote-carousel-2" data-slide-to="0" class=""></li>
                          <li data-target="#quote-carousel-2" data-slide-to="1" class=""></li>
                          <li data-target="#quote-carousel-2" data-slide-to="2" class="active"></li>
                        </ol>
                        
                        <!-- Carousel Slides / Quotes -->
                        <div class="carousel-inner">
                        
                          <!-- Quote 1 -->
                          <div class="item">
                            <blockquote>
                              <div class="row">
                                <div class="col-sm-12 animateme scrollme" data-when="enter" data-from="0.2" data-to="0" data-crop="false" data-opacity="0" data-scale="0.5" style="opacity: 1; transform: translate3d(0px, 0px, 0px) rotateX(0deg) rotateY(0deg) rotateZ(0deg) scale3d(1, 1, 1);">
                                  <p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit!</p>
                                </div>
                              </div>
                            </blockquote>
                          </div>
                          <!-- Quote 2 -->
                          <div class="item">
                            <blockquote>
                              <div class="row">
                                <div class="col-sm-12 animateme scrollme" data-when="enter" data-from="0.2" data-to="0" data-crop="false" data-opacity="0" data-scale="0.5" style="opacity: 1; transform: translate3d(0px, 0px, 0px) rotateX(0deg) rotateY(0deg) rotateZ(0deg) scale3d(1, 1, 1);">
                                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam auctor nec lacus ut tempor. Mauris.</p>
                                </div>
                              </div>
                            </blockquote>
                          </div>
                          <!-- Quote 3 -->
                          <div class="item active">
                            <blockquote>
                              <div class="row">
                                <div class="col-sm-12 animateme scrollme" data-when="enter" data-from="0.2" data-to="0" data-crop="false" data-opacity="0" data-scale="0.5" style="opacity: 1; transform: translate3d(0px, 0px, 0px) rotateX(0deg) rotateY(0deg) rotateZ(0deg) scale3d(1, 1, 1);">
                                  <p>Lorem ipsum dolor eget pretium nisl accumsan. Sed ultricies commodo tortor, eu pretium mauris.</p>
                                </div>
                              </div>
                            </blockquote>
                          </div>
                        </div>
                      </div>         

                    </div>
                  </section>
                </div>
              </div>

              <section class="panel todo-widget">

                 <header class="panel-heading">
                  <h3 class="panel-title">ToDo List 
                    <span class="panel-heading-icons">
                      <a href="#" class="panel-reload"><i class="ti-plus"></i></a>
                    </span>
                  </h3>
                </header>
                
                <ul class="list-group">
                  <li class="list-group-item">
                    <div class="checkbox">
                      <label><input type="checkbox" class="tiny checkbox-primary"> Some task name</label>
                    </div>
                  </li>
                  <li class="list-group-item">
                    <div class="checkbox">
                      <label><input type="checkbox" class="tiny checkbox-primary"> Some task name</label>
                    </div>
                  </li>
                  <li class="list-group-item finished">
                    <div class="checkbox">
                      <label><input type="checkbox" class="tiny checkbox-primary" checked> Some task name</label>
                    </div>
                  </li>
                </ul>
                <div class="panel-footer text-right">
                  <a href="#" class="btn btn-primary">All tasks</a>
                </div>

              </section>

            </div> <!-- / col-md-6 -->

            <div class="col-md-6">

              <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-6 no-left-padding">
                  <a href="#" class="text-widget color-1">
                    <header><strong>2</strong> new messages</header>
                    <small class="hidden-xs hidden-sm">in your message inbox</small>
                    <span class="icon"><i class="ti-email"></i></span>
                  </a>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-6 no-right-padding">
                  <a href="#" class="text-widget color-2">
                    <header><strong>2 </strong> payments received</header>
                    <small class="hidden-xs hidden-sm">4 still pending</small>
                    <span class="icon"><i class="ti-money"></i></span>
                  </a>
                </div>
              </div>
              
              <section class="panel">
                <header class="panel-heading">
                  <h4 class="panel-title">Sales</h4>
                </header>
                <div class="panel-body">
                  <div id="real-time-bar" class="epoch" style="height: 200px"></div>
                </div>
              </section>

              <section class="panel panel-danger">
                <header class="panel-heading">
                  <h3 class="panel-title">New registered users</h3>
                </header>


                  <table class="table table-hover table-condensed">
                    <tbody>
                      <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                      </tr>
                      <tr>
                        <th scope="row">2</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                      </tr>
                      <tr>
                        <th scope="row">3</th>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                      </tr>
                      <tr>
                        <th scope="row">4</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                      </tr>
                      <tr>
                        <th scope="row">5</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                      </tr>
                      <tr>
                        <th scope="row">6</th>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                      </tr>
                    </tbody>
                  </table>


                <div class="panel-footer text-right">
                  <a href="#" class="btn btn-primary">All users</a>
                </div>
              </section>

              <section class="panel">
                <header class="panel-heading">
                    <h4 class="panel-title">Events</h4>
                </header>
                  <div class="list-group">
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">7 minutes ago</span>
                        <i class="ti-comments text-warning margin-right-15"></i> Commented on a post
                    </a>
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">16 minutes ago</span>
                        <i class="ti-truck text-warning margin-right-15"></i> Order 392 shipped
                    </a>
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">36 minutes ago</span>
                        <i class="ti-world text-warning margin-right-15"></i> Invoice 653 has paid
                    </a>
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">1 hour ago</span>
                        <i class="ti-user text-warning margin-right-15"></i> A new user has been added
                    </a>
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">1.23 hour ago</span>
                        <i class="ti-user text-warning margin-right-15"></i> A new user has added
                    </a>
                    <a href="#" class="list-group-item">
                        <span class="label label-primary pull-right">yesterday</span>
                        <i class="ti-world text-warning margin-right-15"></i> Saved the world
                    </a>
                  </div>
                  <div class="panel-footer text-right">
                    <a href="#" class="btn btn-primary">All Events</a>
                  </div>
              </section>

            </div> <!-- / col-md-6 -->

          </div> <!-- / row -->

        </div> <!-- / container-fluid -->



      <footer>
        <p>Powered by <a href="#">SugarRush</a> Admin Panel</p>
      </footer>


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
  <script src="js/d3.min.js"></script>
  <script src="js/epoch.min.js"></script>

  <script src="js/includes.js"></script>
  <script src="js/sugarrush.js"></script>
  <script>
  jQuery(document).ready(function() {
    // REAL TIME DATA GENERATOR
    /*
     * Real-time data generators for the example graphs in the documentation section.
     */
    (function() {

        /*
         * Class for generating real-time data for the area, line, and bar plots.
         */
        var RealTimeData = function(layers) {
            this.layers = layers;
            this.timestamp = ((new Date()).getTime() / 1000)|0;
        };

        RealTimeData.prototype.rand = function() {
            return parseInt(Math.random() * 100) + 50;
        };

        RealTimeData.prototype.history = function(entries) {
            if (typeof(entries) != 'number' || !entries) {
                entries = 60;
            }

            var history = [];
            for (var k = 0; k < this.layers; k++) {
                history.push({ values: [] });
            }

            for (var i = 0; i < entries; i++) {
                for (var j = 0; j < this.layers; j++) {
                    history[j].values.push({time: this.timestamp, y: this.rand()});
                }
                this.timestamp++;
            }

            return history;
        };

        RealTimeData.prototype.next = function() {
            var entry = [];
            for (var i = 0; i < this.layers; i++) {
                entry.push({ time: this.timestamp, y: this.rand() });
            }
            this.timestamp++;
            return entry;
        }

        window.RealTimeData = RealTimeData;


        /*
         * Gauge Data Generator.
         */
        var GaugeData = function() {};

        GaugeData.prototype.next = function() {
            return Math.random();
        };

        window.GaugeData = GaugeData;



        /*
         * Heatmap Data Generator.
         */

        var HeatmapData = function(layers) {
            this.layers = layers;
            this.timestamp = ((new Date()).getTime() / 1000)|0;
        };
        
        window.normal = function() {
            var U = Math.random(),
                V = Math.random();
            return Math.sqrt(-2*Math.log(U)) * Math.cos(2*Math.PI*V);
        };

        HeatmapData.prototype.rand = function() {
            var histogram = {};

            for (var i = 0; i < 1000; i ++) {
                var r = parseInt(normal() * 12.5 + 50);
                if (!histogram[r]) {
                    histogram[r] = 1;
                }
                else {
                    histogram[r]++;
                }
            }

            return histogram;
        };

        HeatmapData.prototype.history = function(entries) {
            if (typeof(entries) != 'number' || !entries) {
                entries = 60;
            }

            var history = [];
            for (var k = 0; k < this.layers; k++) {
                history.push({ values: [] });
            }

            for (var i = 0; i < entries; i++) {
                for (var j = 0; j < this.layers; j++) {
                    history[j].values.push({time: this.timestamp, histogram: this.rand()});
                }
                this.timestamp++;
            }

            return history;
        };

        HeatmapData.prototype.next = function() {
            var entry = [];
            for (var i = 0; i < this.layers; i++) {
                entry.push({ time: this.timestamp, histogram: this.rand() });
            }
            this.timestamp++;
            return entry;
        }

        window.HeatmapData = HeatmapData;


    })();

    // Real time line epoch

    var data3 = new RealTimeData(3);

    var chart = $('#real-time-bar').epoch({
        type: 'time.bar',
        data: data3.history(),
        axes: [],
        margins: { top: 0, right: 0, bottom: 0, left: 0 }
    });

    setInterval(function() { chart.push(data3.next()); }, 1000);
    chart.push(data3.next());



    setTimeout(function() {
      jQuery.notify({
          message: '<strong>Cersei Lannister</strong> just messages you.<br> Go to <a href="chat.html">conversation</a>' 
      },{
          type: 'primary',
          placement: {
            from: "top",
            align: "right"
          },
          delay: 10000,
          animate: {
            enter: 'animated fadeInDown',
            exit: 'animated fadeOutUp'
          }
      });
      /*
      setTimeout(function() {
        jQuery.notify({
            message: '<strong>4</strong> new tasks were added to the <strong>project name</strong>.<br> Go to <a href="#">projects page</a>' 
        },{
            type: 'primary',
            placement: {
              from: "bottom",
              align: "right"
            },
            delay: 10000,
            animate: {
              enter: 'animated fadeInDown',
              exit: 'animated fadeOutUp'
            }
        });
      }, 2000);
      */
    }, 4000);
  });
  </script>
  </body>
</html>

</body>
</html>
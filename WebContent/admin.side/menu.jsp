<div id="sidebar">
        <div class="sidebar_scroll"> <!-- start of slimScroll -->

          <!--
          <div class="welcome">
            <div class="left">
              <div class="img-container">
                <img src="img/demoimage.gif" class="welcome-img">
              </div>
            </div>

            <div class="right">
              <span>Welcome, <strong>Bruno</strong></span>
              <ul class="user-options">
                <li><a href="#"><i class="ti-user"></i></a></li>
                <li><a href="#"><i class="ti-pencil"></i></a></li>
                <li><a href="#"><i class="ti-settings"></i></a></li>
                <li><a href="#"><i class="ti-power-off"></i></a></li>
              </ul>
            </div>
          </div>
          -->

          <ul class="nav lg-menu" id="main-nav">
            <li class="sidebar-title">
              <h5 class="text-center margin-bottom-30 margin-top-15">Navigation</h5>
            </li>
             <li><a href="dashboard.jsp">  <span>Dashboard</span> </a>
            </li>
             <li><a href="#">  <span>Manage user</span> </a>
              <ul class="nav nav-submenu submenu-hidden"> 
                <li><a href="<%=request.getContextPath() %>/ManageUserController?flag=search" >All Users</a></li>
              </ul>
            </li>

            <li><a href="#">  <span>Manage category</span></a>
              <ul class="nav nav-submenu submenu-hidden"> 
                <li><a href="addcategory.jsp" >Add category</a></li>
                <li><a href="<%=request.getContextPath() %>/addcategorycontroller?flag=searchCategory">Search Category</a></li>
              </ul>
            </li>
             <li><a href="#"><span>Manage SubCategory</span> </a>
              <ul class="nav nav-submenu submenu-hidden"> 
                <li><a href="<%=request.getContextPath() %>/SubCategoryController?flag=searchCategory" >Add SubCategory</a></li>
                <li><a href="<%=request.getContextPath() %>/SubCategoryController?flag=displaySubCategory" >Search SubCategory</a></li>
              </ul>
            </li>

            <li><a href="<%=request.getContextPath() %>/FileUploadController?flag=searchCategory"><span>file upload</span> </a>
              
            </li>

            <li><a href="<%=request.getContextPath() %>/FileUploadController?flag=searchVideo"> <span>Search Video</span> </a>
              
            </li>

            
            <li><a href="<%=request.getContextPath() %>/CommentController?flag=searchComment"><span>Manage comment</span> </a>
                          </li>

<li><a href="<%=request.getContextPath() %>/SearchController?flag=searchComplain"> <span>Manage complain</span></a>
            </li>
            
            <li><a href="<%=request.getContextPath() %>/SearchController?flag=searchFeedback"><span>Manage feedback</span></a>
            </li>
                    
              </ul>
             

        </div> <!-- end of slimScroll -->
      </div>

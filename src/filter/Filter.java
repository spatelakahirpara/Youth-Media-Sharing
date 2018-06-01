package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import vo.LoginVO;




/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/*")
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
    public Filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		
		HttpSession session =(((HttpServletRequest) request).getSession());
		RequestDispatcher requestDispatcher;
		String flag = request.getParameter("flag");

		String uri = ((HttpServletRequest)request).getRequestURI();
		System.out.println(uri);
//1	
		if(uri.contains("user.temp/dashboard.jsp")||uri.contains("user.temp/openvideo3.jsp")||uri.contains("user.temp/openvideo2.jsp")||uri.contains("user.temp/openvideo.jsp")||uri.contains("user.temp/movies.jsp")||uri.contains("user.temp/serial.jsp") ||uri.contains("RegistrationController") || uri.contains("/css") || uri.contains("/js") && !uri.contains(".jsp") || uri.contains("/img")||uri.contains("/images")|| uri.contains("/fonts") ||uri.contains("/reg.jsp")||uri.contains("user.side/registration.jsp") || uri.contains("registration")||uri.contains("User/User.jsp"))
		{
			System.out.println("inside reg");

			//requestDispatcher = request.getRequestDispatcher("/user/register.jsp");  
			//requestDispatcher.forward(request,response);  


		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		}
		else if (flag!= null && flag.equals("logout")) {
			//session.removeAttribute("userID");
			//System.out.println("logout in else if");

			session.invalidate();
			requestDispatcher = request.getRequestDispatcher("/user.side/login.jsp");  
			requestDispatcher.forward(request,response);
		}
//3
		else if(flag != null && flag.equals("login") )
		{
			//System.out.println("Login");

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println(username+""+password);

			LoginVO loginVO = new LoginVO();
			loginVO.setUser_name(username);
			loginVO.setPassword(password);

			LoginDAO loginDAO = new LoginDAO();
			List list = new ArrayList();
			try {
				list = loginDAO.authentication(loginVO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("sizeeeee : " +list.size());
			if(list != null && list.size()>=1){

				//Iterator itr = list.iterator();

				//while(itr.hasNext()){
				LoginVO user=(LoginVO) list.get(0);

				String y = user.getUser_name();
				session.setAttribute("username", y);
				
				int userID = user.getLogin_id();
				System.out.println("UserID  : "+userID);
				session.setAttribute("userID",userID);

				//System.out.println(user.getRSegistrationUsername();
				//	System.out.println(session.getAttribute("userId"));
				String type = user.getUsertype();
				System.out.println(type);
				
				session.setAttribute("usertype",type);
				System.out.println(y);
				if(type.equalsIgnoreCase("admin"))
				{
					requestDispatcher = request.getRequestDispatcher("/admin.side/dashboard.jsp");  
					requestDispatcher.forward(request,response);
				}
				else if(type.equalsIgnoreCase("user"))
				{
					requestDispatcher = request.getRequestDispatcher("/user.temp/dashboard.jsp");  
					requestDispatcher.forward(request,response);
				}
				
				else
				{
					requestDispatcher = request.getRequestDispatcher("/user.side/login.jsp");  
					requestDispatcher.forward(request,response);  
				}
			}
			else
			{
				requestDispatcher = request.getRequestDispatcher("/user.side/login.jsp");
				requestDispatcher.forward(request,response);
			}	
		}
//4
		else if(session.getAttribute("userID") != null)
		{
			String h = (String)session.getAttribute("usertype");
			//System.out.println("type = = = " + h);

			if(h!=null && h.equalsIgnoreCase("admin")){

				//System.out.println("chain");
				chain.doFilter(request,response);
			}

			
			else if(h!=null && h.equalsIgnoreCase("User"))
			{
				//System.out.println("chain");
				chain.doFilter(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/user/error.jsp");  
				rd.forward(request,response);
			}
		}

		else
		{
			System.out.println("outside");
			RequestDispatcher rd = request.getRequestDispatcher("/user.side/login.jsp");  
			rd.forward(request,response);  

		}
		}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

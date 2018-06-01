package controller;

import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ComplainVO;
import vo.LoginVO;
import dao.ComplainDAO;
import dao.LoginDAO;


/**
 * Servlet implementation class ComplainController
 */
public class ComplainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String flag = request.getParameter("flag");
		
		if (flag.equals("search"))
		{
			search(request, response);
		}
		else if (flag.equals("replay"))
		{
			replyComplain(request,response);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insertComplain"))
		{
			insertComplain(request,response);
			
		}
		else if(flag.equals("replyPost"))
		{
			replyPost(request,response);
			search(request, response);
		}

	}
	
	private void replyComplain(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		int complainId = Integer.parseInt(request.getParameter("id"));
		
		ComplainVO complainVO = new ComplainVO();
		complainVO.setComplainId(complainId);
		
		ComplainDAO complainDAO = new ComplainDAO();
		List complainList = complainDAO.replyComplain(complainVO);
		
		HttpSession session = request.getSession();
		session.setAttribute("complainList", complainList);
		
		response.sendRedirect("admin.side/replycomplain.jsp");

	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		ComplainDAO dao = new ComplainDAO();
		List ls = dao.search();
		
		HttpSession session = request.getSession();
		session.setAttribute("ComplainList", ls);

		response.sendRedirect("admin.side/searchcomplain.jsp");
	
	}

	private void replyPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
	
		String complainName = request.getParameter("complainName");
		String complaindescriptionName = request.getParameter("complaindescriptionName");
		String replydescriptionName = request.getParameter("replydescriptionName");
		String complainTo = request.getParameter("complainTo");
		int loginId = (int) request.getSession().getAttribute("userID");
		
		ComplainVO complainVO = new ComplainVO();
		complainVO.setComplainName(complainName);
		complainVO.setComplainDescription(complaindescriptionName);
		complainVO.setReplaycomplainDescription(replydescriptionName);
		complainVO.setStatus("replied");

		LoginVO loginVO = new LoginVO();
		loginVO.setLogin_id(loginId);
		
		LoginDAO loginDAO = new LoginDAO();
	    List complainList = loginDAO.search1(loginVO);
	    
	    LoginVO loginVO1 = (LoginVO) complainList.get(0);
	    loginVO1.setLogin_id(Integer.parseInt(complainTo));
	    
	    
	    Date date=new Date(); 
		Time time=new Time(date.getTime());
		
		complainVO.setComplainDate(date);
		complainVO.setComplainTime(time);
		
	    
	    complainVO.setComplainTo(loginVO1);
	    complainVO.setComplainFrom(loginVO);
	    
		ComplainDAO complainDAO = new ComplainDAO();
		complainDAO.replyPost(complainVO);
		
			
	}	
	private void insertComplain(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String complainName = request.getParameter("complainName");
		String complaindescription = request.getParameter("complaindescription");
		int loginId = (int) request.getSession().getAttribute("userID"); 
		
		ComplainVO complainVO = new ComplainVO();
		complainVO.setComplainName(complainName);
		complainVO.setComplainDescription(complaindescription);
		
		Date date=new Date(); 
		Time time=new Time(date.getTime());
		
		complainVO.setComplainDate(date);
		complainVO.setComplainTime(time);
		
		complainVO.setStatus("pending");
		
		
		LoginDAO loginDAO = new LoginDAO();
	    List adminList = loginDAO.searchAdmin();
		
	    LoginVO complainTo = (LoginVO) adminList.get(0);
	    System.out.println("LoginVo :: "+complainTo.getLogin_id());
	    complainVO.setComplainTo(complainTo);
	    
	    LoginVO loginVO = new LoginVO();
	    loginVO.setLogin_id(loginId);
	    
	    complainVO.setComplainFrom(loginVO);
	    
		ComplainDAO complainDAO = new ComplainDAO();
		complainDAO.insertComplain(complainVO);
	
		response.sendRedirect("user.temp/complain.jsp");
		
	}
	
}

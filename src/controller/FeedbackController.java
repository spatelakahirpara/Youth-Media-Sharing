package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.CommentVO;
import vo.FeedbackVO;
import dao.CommentDAO;
import dao.FeedbackDAO;

/**
 * Servlet implementation class FeedbackController
 */
public class FeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackController() {
        super();
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			displayFeedback(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("feedback"))
		{
			try {
				addFeedback(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void addFeedback(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String name1=request.getParameter("name");
		String title=request.getParameter("title");
		String feedback=request.getParameter("f");
	
		
		FeedbackVO v=new FeedbackVO();
		 v.setFeedbackDesc(feedback);
		 v.setFeedbackTitle(title);
	
		FeedbackDAO d = new FeedbackDAO();
		d.insert(v);
		response.sendRedirect("user.temp/feedback.jsp");
		
	}
	private void displayFeedback(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		FeedbackVO vo1 = new FeedbackVO();
		FeedbackDAO dao1 = new FeedbackDAO();
		List subcategoryList1 = dao1.display(vo1);
		HttpSession session = request.getSession();
		session.setAttribute("subcategoryList1", subcategoryList1);
		
		response.sendRedirect("user.temp/feedback.jsp");
	}
}

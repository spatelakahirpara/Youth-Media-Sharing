package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.CommentVO;
import vo.LoginVO;
import vo.categoryvo;
import vo.subCategoryVO;
import dao.CommentDAO;
import dao.LoginDAO;
import dao.SubCategoryDAO;
import dao.categorydao;

/**
 * Servlet implementation class CommentController
 */
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag=request.getParameter("flag");
		 if(flag!=null && flag.equals("display"))
			{
				try {
					displayComment(request,response);		
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		 if(flag.equals("searchComment"))
			{
				try {
					searchComment(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		 if(flag!=null && flag.equals("deleteComment"))
		{
			try {
				delete(request, response);
				searchComment(request,response);
				System.out.println("after");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("comment"))
		{
			try {
				addComment(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void addComment(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String user_name=request.getParameter("user_name");
		
		String email_id=request.getParameter("email_id");
		String comment=request.getParameter("comment_desc");
		System.out.println("cccc"+comment);
		
		CommentVO v=new CommentVO();
		v.setEmail_id(email_id);
		v.setUser_name(user_name);
		v.setComment_desc(comment);
	
		CommentDAO d = new CommentDAO();
		d.insertComment(v);
		response.sendRedirect("CommentController?flag=display");
		
	}
	private void displayComment(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		CommentVO vo1 = new CommentVO();
		CommentDAO dao1 = new CommentDAO();
		List subcategoryList1 = dao1.display_Comment(vo1);
		HttpSession session = request.getSession();
		session.setAttribute("subcategoryList1", subcategoryList1);
		
		response.sendRedirect("user.temp/openvideo.jsp");
		
	}
private void delete(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		CommentVO vo = new CommentVO();
		CommentDAO dao = new CommentDAO();
		vo.setComment_id(Integer.parseInt(request.getParameter("commentId")));
			dao.delete(vo);
	}
protected void search(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub

	CommentVO vo1 = new CommentVO();
	CommentDAO dao1 = new CommentDAO();
	List subcategoryList1 = dao1.display_Comment(vo1);
	HttpSession session = request.getSession();
	session.setAttribute("subcategoryList1", subcategoryList1);

response.sendRedirect("admin.side/searchcomment.jsp");


}
private void searchComment(HttpServletRequest request,
		HttpServletResponse response) throws IOException {
	// TODO Auto-generated method stub
	CommentVO vo1 = new CommentVO();
	
	CommentDAO dao1 = new CommentDAO();
	List subcategoryList = dao1.display_Comment(vo1);
	HttpSession session = request.getSession();
	session.setAttribute("List1", subcategoryList);
	
	response.sendRedirect("admin.side/searchcomment.jsp");
	
}


}

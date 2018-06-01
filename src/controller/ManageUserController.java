package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.RegistrationVO;
import vo.categoryvo;
import vo.subCategoryVO;
import dao.RegistrationDAO;
import dao.SubCategoryDAO;
import dao.categorydao;

/**
 * Servlet implementation class ManageUserController
 */
public class ManageUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String flag= request.getParameter("flag");
		 
		
		if(flag.equals("search"))
		{
			try {
				search(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(flag!=null && flag.equals("deleteUser"))
		{
			try {
				delete(request, response);
				display_Sub(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(flag!=null && flag.equals("editUser"))
		{
			edit(request, response);
			response.sendRedirect("admin.side/edituser.jsp");
		}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	String flag=request.getParameter("flag");
	if(flag.equals("update"))
{
	update(request,response);
	search(request,response);
		} 
	
	}
private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside");
		int regId = Integer.parseInt(request.getParameter("regId"));
		String f_name = request.getParameter("fisrtName");
		String l_name = request.getParameter("lastName");
		String u_name = request.getParameter("userName");
		String email_id = request.getParameter("emailid");
		String password = request.getParameter("pass");
		
		RegistrationVO vo = new	RegistrationVO();
		vo.setReg_id(regId);
		vo.setFirst_name(f_name);
		vo.setLast_name(l_name);
		vo.setUser_name(u_name);
		vo.setEmail(email_id);
		vo.setPassword(password);
		
		
		RegistrationDAO dao = new RegistrationDAO();
		dao.update(vo);
		
		
	}
	


	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("before");
		RegistrationVO vo = new	RegistrationVO();
		RegistrationDAO dao = new RegistrationDAO();
		List l1 = dao.manageusersearch(vo);
		HttpSession session = request.getSession();
		session.setAttribute("l1",l1);
		System.out.println("after");
		response.sendRedirect("admin.side/manageuser.jsp");
		
		
	}
private void delete(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		RegistrationVO vo = new RegistrationVO();
		RegistrationDAO dao = new RegistrationDAO();
		
		vo.setReg_id(Integer.parseInt(request.getParameter("userId")));
		dao.delete(vo);
	}
protected void display_Sub(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub

	RegistrationVO vo = new RegistrationVO();
	RegistrationDAO dao = new RegistrationDAO();
List subcategoryList1 = dao.display_Sub(vo);
HttpSession session = request.getSession();
session.setAttribute("l1", subcategoryList1);

response.sendRedirect("admin.side/manageuser.jsp");


}
protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int regId = Integer.parseInt(request.getParameter("userId"));
	
	RegistrationVO vo = new RegistrationVO();
	vo.setReg_id(regId);
	
	RegistrationDAO dao = new RegistrationDAO();
	List l = dao.edit(vo);
	HttpSession session = request.getSession();
	session.setAttribute("List", l);
	
}

}

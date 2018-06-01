package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;



import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.Permission;

import vo.CommentVO;
import vo.ComplainVO;
import vo.FeedbackVO;

import vo.categoryvo;
import dao.CommentDAO;
import dao.ComplainDAO;
import dao.FeedbackDAO;

import dao.categorydao;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("searchComplain"))
		{
			try {
				searchComplain(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(flag.equals("searchFeedback"))
		{
			try {
				searchFeedback(request,response);
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
		if(flag.equals("makePublic"))
		{
			try {
				makePublic(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	private void searchComplain(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		ComplainVO vo1 = new ComplainVO();
		ComplainDAO dao1 = new ComplainDAO();
		List subcategoryList = dao1.display(vo1);
		HttpSession session = request.getSession();
		session.setAttribute("List1", subcategoryList);
		
		response.sendRedirect("admin.side/searchcomplain.jsp");
		
	}
	private void searchFeedback(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		FeedbackVO vo1 = new FeedbackVO();
		FeedbackDAO dao1 = new FeedbackDAO();
		List subcategoryList = dao1.display(vo1);
		HttpSession session = request.getSession();
		session.setAttribute("List1", subcategoryList);
		
		response.sendRedirect("admin.side/searchfeedback.jsp");
		
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
	private void makePublic(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(request.getParameter("videoId"));
		
		String bucketName="data-download-out";
			
		AWSCredentials credentials = null;
		try {
			credentials = new ProfileCredentialsProvider("default")
					.getCredentials();
		} catch (Exception e) {
			throw new AmazonClientException(
					"Cannot load the credentials from the credential profiles file. "
							+ "Please make sure that your credentials file is at the correct "
							+ "location (C:\\Users\\Acer\\.aws\\credentials), and is in valid format.",
					e);
		}

		AmazonS3 s3 = new AmazonS3Client(credentials);
		
		System.out.println("===========================================");
		System.out.println("Getting Started with Amazon S3??");
		System.out.println("===========================================\n");

		try {

			System.out.println("private");
			
			AccessControlList bucketacl = s3.getObjectAcl(bucketName, "/job");
			Grant grant1=new Grant(GroupGrantee.AllUsers, Permission.Read);
			bucketacl.getGrantsAsList().add(grant1);
			s3.setObjectAcl(bucketName, "/job", bucketacl);
		} catch (AmazonServiceException ase) {
			System.out
					.println("Caught an AmazonServiceException, which means your request made it "
							+ "to Amazon S3, but was rejected with an error response for some reason.");
			System.out.println("Error Message:    " + ase.getMessage());
			System.out.println("HTTP Status Code: " + ase.getStatusCode());
			System.out.println("AWS Error Code:   " + ase.getErrorCode());
			System.out.println("Error Type:       " + ase.getErrorType());
			System.out.println("Request ID:       " + ase.getRequestId());
		}

		
		
		response.sendRedirect("admin.side/searchvideo.jsp");
		
	}

}

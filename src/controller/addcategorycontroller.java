package controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import com.amazonaws.regions.Regions;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import vo.categoryvo;
import vo.subCategoryVO;
import dao.categorydao;

/**
 * Servlet implementation class addcategorycontroller
 */
public class addcategorycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUFFIX = "/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addcategorycontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("searchCategory"))
		{
			try {
				search(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(flag!=null && flag.equals("deleteCat"))
		{
			try {
				delete(request, response);
				search(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(flag!=null && flag.equals("editCat"))
		{
			edit(request, response);
			response.sendRedirect("admin.side/editcategory.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag= request.getParameter("flag");
		if(flag.equals("insert"))
		{
		insert(request, response);
		}
		
		
	}
	
	protected void insert(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String cat_name1 = request.getParameter("category_name");
			String cat_region1 = request.getParameter("select_region");
			String cat_desc1 = request.getParameter("category_desc");

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
			
			String bucketName = cat_name1;

			System.out.println("===========================================");
			System.out.println("Getting Started with Amazon S3??");
			System.out.println("===========================================\n");

			try {

				System.out.println("Creating bucket " + bucketName + "\n");
				s3.createBucket(bucketName,cat_region1);
				
				System.out.println("Listing buckets");
				for (Bucket bucket : s3.listBuckets()) {
					System.out.println(" - " + bucket.getName());
				}
				System.out.println();

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

			categoryvo v = new categoryvo();
			v.setCat_name(cat_name1);
			v.setCat_region(cat_region1);
			v.setCat_desc(cat_desc1);

			categorydao d = new categorydao();
			d.insert(v);
			response.sendRedirect("admin.side/addcategory.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void search(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		categoryvo categoryvo1 = new categoryvo();
		categorydao categorydao1 = new categorydao();
		List categoryList = categorydao1.search(categoryvo1);
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", categoryList);
		response.sendRedirect("admin.side/searchcategory.jsp");
		
		
	}
	private void delete(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		categoryvo vo = new categoryvo();
		categorydao dao = new categorydao();
		vo.setCat_id(Integer.parseInt(request.getParameter("catId")));
		dao.delete(vo);
	}
	
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int catId = Integer.parseInt(request.getParameter("catId"));
		
		categoryvo vo = new categoryvo();
		vo.setCat_id(catId);
		categorydao dao = new categorydao();
		List l = dao.edit(vo);
		HttpSession session = request.getSession();
		session.setAttribute("List", l);
		
	}
}

package controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.categoryvo;
import vo.subCategoryVO;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import dao.SubCategoryDAO;
import dao.categorydao;

/**
 * Servlet implementation class SubCategoryController
 */
public class SubCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUFFIX = "/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubCategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag= request.getParameter("flag");
		if(flag.equals("displaySubCategory"))
		{
			try {
				display_Sub(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(flag.equals("searchCategory"))
		{
			try {
				search(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(flag!=null && flag.equals("deleteSubCat"))
		{
			try {
				delete(request, response);
				display_Sub(request,response);
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
		String flag= request.getParameter("flag");
		if(flag.equals("insert"))
		{
			try {
				insertsubcategory(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	protected void insertsubcategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			int id=Integer.parseInt(request.getParameter("select_category"));
			System.out.println("ID ::::  " + id);
			//String cat_name = request.getParameter("select_category");
			String subcat_name = request.getParameter("subcategory_name");
			String subcat_desc = request.getParameter("subcategory_desc");
			
			
			
			
			categoryvo categoryvo=new categoryvo();
			categoryvo.setCat_id(id);
			categorydao categorydao= new categorydao();
			List CategoryNameList= categorydao.searchCategoryName(categoryvo);
			
			categoryvo= (categoryvo)CategoryNameList.get(0); 
			
			String cat_name1=categoryvo.getCat_name();
			System.out.println("Cat Name >>>>> " + cat_name1);
			
			
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
			System.out.println("bucket name is=="+cat_name1);
			String bucketName = cat_name1;
			String folderName = subcat_name;
			
			
			
			System.out.println("===========================================");
			System.out.println("Getting Started with Amazon S3----");
			System.out.println("===========================================\n");

			try {
				System.out.println("Creating folder " + folderName + "\n");
				System.out.println("bucket is="+bucketName);
				
				createFolder(bucketName, folderName, s3);
				
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

			subCategoryVO v = new subCategoryVO();
			//v.setCat_name(cat_name);
			v.setSubcat_name(subcat_name);
			v.setSubcat_desc(subcat_desc);
			v.setCategoryvo(categoryvo);
		
			
		
			SubCategoryDAO d = new SubCategoryDAO();
			d.insertsubcategory(v);
			response.sendRedirect("admin.side/addsubcategory.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void createFolder(String bucketName, String folderName, AmazonS3 client) {
		// create meta-data for your folder and set content-length to 0
		ObjectMetadata metadata = new ObjectMetadata();
		metadata.setContentLength(0);
		// create empty content
		InputStream emptyContent = new ByteArrayInputStream(new byte[0]);
		// create a PutObjectRequest passing the folder name suffixed by /
		PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName,
				folderName + SUFFIX, emptyContent, metadata);
		// send request to S3 to create folder
		client.putObject(putObjectRequest);
	}
	
	protected void search(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		categoryvo categoryvo1 = new categoryvo();
		SubCategoryDAO categorydao1 = new SubCategoryDAO();
		List subcategoryList = categorydao1.search(categoryvo1);
		HttpSession session = request.getSession();
		session.setAttribute("subcategoryList", subcategoryList);
		response.sendRedirect("admin.side/addsubcategory.jsp");
		
		
	}
	protected void display_Sub(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	subCategoryVO subcategoryvo1 = new subCategoryVO();
	SubCategoryDAO subcategorydao1 = new SubCategoryDAO();
	List subcategoryList1 = subcategorydao1.display_Sub(subcategoryvo1);
	HttpSession session = request.getSession();
	session.setAttribute("subcategoryList1", subcategoryList1);
	
	response.sendRedirect("admin.side/searchsubcategory.jsp");

	
	}
private void delete(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		subCategoryVO vo = new subCategoryVO();
		SubCategoryDAO dao = new SubCategoryDAO();
		vo.setSubcat_id(Integer.parseInt(request.getParameter("subcatId")));
			dao.delete(vo);
	}
}

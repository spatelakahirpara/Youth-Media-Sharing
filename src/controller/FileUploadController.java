package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

import vo.FileUploadVO;
import vo.categoryvo;
import vo.subCategoryVO;
import dao.FileUploadDAO;
import dao.SubCategoryDAO;
import dao.categorydao;

/**
 * Servlet implementation class FileUploadController
 */
@MultipartConfig
public class FileUploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUFFIX = "/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("////");
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
		if(flag.equals("uploadvideo"))
		{
			try {
				upload(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(flag.equals("searchVideo"))
		{
			try {
				searchVideo(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/*HttpSession session = request.getSession();
		String s = (String) session.getAttribute("upload");
		if(s.equals("upload"))
		{
				try{
				
			fileupload(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	*/
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
			fileupload(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		if(flag.equals("userupload"))
		{
		try {
			userupload(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	protected void searchVideo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FileUploadVO vo1 = new FileUploadVO();
		FileUploadDAO dao1 = new FileUploadDAO();
			List List1 =dao1.searchVideo(vo1);
	HttpSession session1 = request.getSession();
	session1.setAttribute("List1", List1);
	response.sendRedirect("admin.side/searchvideo.jsp");
	
	}

	protected void search(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		categoryvo categoryvo1 = new categoryvo();
		SubCategoryDAO categorydao1 = new SubCategoryDAO();
		List subcategoryList = categorydao1.search(categoryvo1);
		HttpSession session = request.getSession();
		session.setAttribute("subcategoryList", subcategoryList);

		subCategoryVO subcategoryvo1 = new subCategoryVO();
	SubCategoryDAO subcategorydao1 = new SubCategoryDAO();
	List subcategoryList1 = subcategorydao1.display_Sub(subcategoryvo1);
	HttpSession session1 = request.getSession();
	session1.setAttribute("subcategoryList1", subcategoryList1);
	response.sendRedirect("admin.side/fileupload.jsp");
	
	}
	protected void upload(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		categoryvo categoryvo1 = new categoryvo();
		SubCategoryDAO categorydao1 = new SubCategoryDAO();
		List subcategoryList = categorydao1.search(categoryvo1);
		HttpSession session = request.getSession();
		session.setAttribute("subcategoryList", subcategoryList);

		subCategoryVO subcategoryvo1 = new subCategoryVO();
	SubCategoryDAO subcategorydao1 = new SubCategoryDAO();
	List subcategoryList1 = subcategorydao1.display_Sub(subcategoryvo1);
	HttpSession session1 = request.getSession();
	session1.setAttribute("subcategoryList1", subcategoryList1);
	response.sendRedirect("user.temp/uploadvideo.jsp");
	
	}

	
	private void fileupload(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("upload");
		for(Part filePart : request.getParts())
		{
			
			if(filePart.getSubmittedFileName()!=null && !filePart.getSubmittedFileName().equals(""))
			{
				
				String fileName = filePart.getSubmittedFileName();
			    InputStream fileContent = filePart.getInputStream();
			   
				byte[] buffer = new byte[fileContent.available()];
				fileContent.read(buffer);
			 
				String filePath = getServletContext().getRealPath(request.getServletPath());
				
				int path = filePath.lastIndexOf('\\');
				String path1= filePath.substring(0, path) +"\\doc\\";
				
				File targetFile = new File(path1+fileName);
			    OutputStream outStream = new FileOutputStream(targetFile);
			    outStream.write(buffer);
			   
			    System.out.println("File Output Path :: "+path1+fileName);
			    HttpSession session = request.getSession();
				session.setAttribute("path", path1+fileName);
				outStream.close();
			}
		}
		
		// TODO Auto-generated method stub
		
		String video=request.getParameter("video_name");
		int cat_id=Integer.parseInt(request.getParameter("select_category"));
		int subcat_id=Integer.parseInt(request.getParameter("select_subcategory"));
		
		categoryvo categoryvo=new categoryvo();
		categoryvo.setCat_id(cat_id);
		categorydao categorydao= new categorydao();
		List CategoryNameList= categorydao.searchCatName(categoryvo);		
		categoryvo= (categoryvo)CategoryNameList.get(0); 		
		String cat_name1=categoryvo.getCat_name();
		
		subCategoryVO subcategoryvo=new subCategoryVO();
		subcategoryvo.setSubcat_id(subcat_id);
		SubCategoryDAO subcategorydao= new SubCategoryDAO();
		List CategoryNameList1= subcategorydao.display_Sub(subcategoryvo);		
		subcategoryvo= (subCategoryVO)CategoryNameList1.get(0); 		
		String subcat_name1=subcategoryvo.getSubcat_name();
		
		System.out.println("cat="+cat_name1+"subcat="+subcat_name1);
		
		System.out.println("aws code starting here.........");
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\Acer\\.aws\\credentials), and is in valid format.",
                    e);
        }

        AmazonS3 s3 = new AmazonS3Client(credentials);
        AmazonS3Client client = new AmazonS3Client();
        
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        s3.setRegion(usWest2);
        
        String bucketName = cat_name1;
        
        String key = video;
        HttpSession session = request.getSession();
        String s = (String) session.getAttribute("path");
		 System.out.println("Getting Started with Amazon S3");       

       try {            
            System.out.println("Uploading a new object to S3 from a file\n");
            String fileName = subcat_name1+SUFFIX+ video;
            s3.putObject(new PutObjectRequest(bucketName, fileName, new File(s)));
                       
            URL u=client.getUrl(bucketName, key);
            String url1=u.toString();
			System.out.println("new url::"+url1);
            
           
           // int login=Integer.parseInt(request.getParameter(""));
            categoryvo c=new categoryvo();
            c.setCat_id(cat_id);
            subCategoryVO sc=new subCategoryVO();
            sc.setSubcat_id(subcat_id);
            
            FileUploadVO v = new FileUploadVO();
            v.setVideo_name(video);
            v.setVideo_path(url1);    
            v.setCat_id(c);
            v.setSubcat_id(sc);
            
			
            FileUploadDAO d1 = new FileUploadDAO();
			d1.insertvideo(v);
            
              }
        catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it "
                    + "to Amazon S3, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } 
      
       response.sendRedirect("admin.side/fileupload.jsp");
     
    }

	
	private void userupload(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("upload");
		for(Part filePart : request.getParts())
		{
			
			if(filePart.getSubmittedFileName()!=null && !filePart.getSubmittedFileName().equals(""))
			{
				
				String fileName = filePart.getSubmittedFileName();
			    InputStream fileContent = filePart.getInputStream();
			   
				byte[] buffer = new byte[fileContent.available()];
				fileContent.read(buffer);
			 
				String filePath = getServletContext().getRealPath(request.getServletPath());
				
				int path = filePath.lastIndexOf('\\');
				String path1= filePath.substring(0, path) +"\\doc\\";
				
				File targetFile = new File(path1+fileName);
			    OutputStream outStream = new FileOutputStream(targetFile);
			    outStream.write(buffer);
			   
			    System.out.println("File Output Path :: "+path1+fileName);
			    HttpSession session = request.getSession();
				session.setAttribute("path", path1+fileName);
				outStream.close();
			}
		}
		
		// TODO Auto-generated method stub
		
		String video=request.getParameter("video_name");
		int cat_id=Integer.parseInt(request.getParameter("select_category"));
		int subcat_id=Integer.parseInt(request.getParameter("select_subcategory"));
		
		categoryvo categoryvo=new categoryvo();
		categoryvo.setCat_id(cat_id);
		categorydao categorydao= new categorydao();
		List CategoryNameList= categorydao.searchCatName(categoryvo);		
		categoryvo= (categoryvo)CategoryNameList.get(0); 		
		String cat_name1=categoryvo.getCat_name();
		
		subCategoryVO subcategoryvo=new subCategoryVO();
		subcategoryvo.setSubcat_id(subcat_id);
		SubCategoryDAO subcategorydao= new SubCategoryDAO();
		List CategoryNameList1= subcategorydao.display_Sub(subcategoryvo);		
		subcategoryvo= (subCategoryVO)CategoryNameList1.get(0); 		
		String subcat_name1=subcategoryvo.getSubcat_name();
		
		System.out.println("cat="+cat_name1+"subcat="+subcat_name1);
		
		System.out.println("aws code starting here.........");
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\Acer\\.aws\\credentials), and is in valid format.",
                    e);
        }

        AmazonS3 s3 = new AmazonS3Client(credentials);
        AmazonS3Client client = new AmazonS3Client();
        
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        s3.setRegion(usWest2);
        
        String bucketName = cat_name1;
        
        String key = video;
        HttpSession session = request.getSession();
        String s = (String) session.getAttribute("path");
		 System.out.println("Getting Started with Amazon S3");       

       try {            
            System.out.println("Uploading a new object to S3 from a file\n");
            String fileName = subcat_name1+SUFFIX+ video;
            s3.putObject(new PutObjectRequest(bucketName, fileName, new File(s)));
                       
            URL u=client.getUrl(bucketName, key);
            String url1=u.toString();
			System.out.println("new url::"+url1);
            
           
           // int login=Integer.parseInt(request.getParameter(""));
            categoryvo c=new categoryvo();
            c.setCat_id(cat_id);
            subCategoryVO sc=new subCategoryVO();
            sc.setSubcat_id(subcat_id);
            
            FileUploadVO v = new FileUploadVO();
            v.setVideo_name(video);
            v.setVideo_path(url1);    
            v.setCat_id(c);
            v.setSubcat_id(sc);
            
			
            FileUploadDAO d1 = new FileUploadDAO();
			d1.insertvideo(v);
            
              }
        catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it "
                    + "to Amazon S3, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } 
      
       response.sendRedirect("user.temp/uploadvideo.jsp");
     
    }

		
}



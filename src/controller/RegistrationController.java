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

import vo.CityVO;
import vo.CountryVO;
import vo.LoginVO;
import vo.RegistrationVO;
import vo.StateVO;
import vo.categoryvo;
import vo.subCategoryVO;
import dao.LoginDAO;
import dao.RegistrationDAO;
import dao.SubCategoryDAO;
import dao.categorydao;

/**
 * Servlet implementation class addcategorycontroller
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SUFFIX = "/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
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
		if(flag.equals("drop"))
		{
		try {
			insertinfo(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		if(flag.equals("login"))
		{
		signin(request, response);
		}
		
		
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
	protected void insert(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String f_name = request.getParameter("f_name");
			String l_name = request.getParameter("l_name");
			String u_name = request.getParameter("u_name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");					
			String address = request.getParameter("address");
			int city_id=Integer.parseInt(request.getParameter("city"));
			int state_id=Integer.parseInt(request.getParameter("state"));
			int country_id=Integer.parseInt(request.getParameter("country"));
			
			CityVO cityvo=new CityVO();
			StateVO statevo=new StateVO();
			CountryVO countryvo=new CountryVO();
			cityvo.setCity_id(city_id);
			statevo.setState_id(state_id);
			countryvo.setCountry_id(country_id);

			
			RegistrationVO v = new RegistrationVO();
			v.setFirst_name(f_name);
			v.setLast_name(l_name);
			v.setUser_name(u_name);
			v.setEmail(email);
			v.setPassword(password);
			v.setAddress(address);
			v.setCityvo(cityvo);
			v.setCountryvo(countryvo);
			v.setStatevo(statevo);
			
			
			RegistrationDAO d = new RegistrationDAO();
			try{
			d.insert(v);	
			}
			catch(Exception E)
			{
				
			}
			
			
			response.sendRedirect("user.side/login.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void signin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			
			LoginVO v = new LoginVO();
			v.setUser_name(username);
			v.setPassword(password);
			v.setUsertype("User");
			LoginDAO d = new LoginDAO();
			d.signin(v);
			response.sendRedirect("user.temp/dashboard.jsp");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void insertinfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		CityVO v1 = new CityVO();
		RegistrationDAO d1 = new RegistrationDAO();
		List list1 = d1.search1(v1);
		HttpSession session = request.getSession();
		session.setAttribute("list1", list1);
		
		StateVO v2 = new StateVO();
		RegistrationDAO d2 = new RegistrationDAO();
		List list2 = d2.search2(v2);		
		session.setAttribute("list2", list2);
		
		CountryVO v3 = new CountryVO();
		RegistrationDAO d3 = new RegistrationDAO();
		List list3 = d3.search3(v3);		
		session.setAttribute("list3", list3);
		
	
		response.sendRedirect("user.side/registration.jsp");
		
		
	}
	
	
	
}

package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import vo.FileUploadVO;
import vo.categoryvo;
import vo.subCategoryVO;

public class FileUploadDAO {
	
	
	
	public void insertvideo(FileUploadVO v) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			session.save(v);
			tr.commit();
			System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

}
	public List searchVideo(FileUploadVO v)throws Exception
	{
		List l=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from FileUploadVO");
		l=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
	
}

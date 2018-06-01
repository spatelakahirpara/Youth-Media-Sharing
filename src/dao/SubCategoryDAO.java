package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import vo.categoryvo;
import vo.subCategoryVO;

public class SubCategoryDAO {
	
	public List search(categoryvo categoryvo1)throws Exception
	{
		List l=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from categoryvo");
		l=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
	
	
	public void insertsubcategory(subCategoryVO v) {
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
	public List display_Sub(subCategoryVO subcategoryvo1)throws Exception
{
	List l1=new ArrayList();
	
	try{
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session =sessionFactory.openSession();
	
	Query q=session.createQuery("from subCategoryVO");
	l1=q.list();
	
	System.out.println("done??");
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return l1;
}


	public List searchCatName(categoryvo categoryvo1) {
		// TODO Auto-generated method stub
		List l5=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from categoryvo");
		l5=q.list();
		
		System.out.println("done++");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l5;
		
	}
	public void delete(subCategoryVO vo)throws Exception
	{
		try{
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.delete(vo);
		tr.commit();
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

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

public class categorydao {
	public void insert(categoryvo v)throws Exception
	{
		
		
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
	
	public List search(categoryvo categoryvo)throws Exception
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
	

	public List addsubCategory(categoryvo categoryvo2) {
		// TODO Auto-generated method stub
List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from categoryvo");
		l1=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}

	public List searchCategoryName(categoryvo categoryvo1) {
		// TODO Auto-generated method stub
List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from categoryvo where cat_id='"+categoryvo1.getCat_id()+"'");
		l1=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;

	}

	public List searchCatName(categoryvo categoryvo1) {
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
	public void delete(categoryvo vo)throws Exception
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
	 public List edit(categoryvo vo) {
			
	       List l = new ArrayList();
			
			try {

				SessionFactory sessionFactory = new Configuration().configure()
						.buildSessionFactory();

				Session session = sessionFactory.openSession();

				Transaction tr = session.beginTransaction();

				Query query = session.createQuery("from categoryvo where catId='"+vo.getCat_id()+"' ");
				
				l = query.list();
				
				tr.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return l;

		}
	}




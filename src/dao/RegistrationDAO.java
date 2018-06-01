package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import vo.CityVO;
import vo.CountryVO;
import vo.RegistrationVO;
import vo.StateVO;
import vo.categoryvo;
import vo.subCategoryVO;

public class RegistrationDAO {
	public void insert(RegistrationVO v)throws Exception
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
	public List search1(CityVO v1)throws Exception
	{
		List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from CityVO");
		l1=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}
	public List search2(StateVO v2)throws Exception
	{
		List l2=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from StateVO");
		l2=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l2;
	}
	public List search3(CountryVO v3)throws Exception
	{
		List l3=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from CountryVO");
		l3=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l3;
	}
	public List manageusersearch(RegistrationVO vo) {
List l4=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from RegistrationVO");
		l4=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l4;
	}
	public void delete(RegistrationVO vo)throws Exception
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
	public List display_Sub(RegistrationVO vo)throws Exception
	{
		List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from RegistrationVO");
		l1=q.list();
		
		System.out.println("done??");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}
	 public List edit(RegistrationVO vo) {
			
	       List l = new ArrayList();
			
			try {

				SessionFactory sessionFactory = new Configuration().configure()
						.buildSessionFactory();

				Session session = sessionFactory.openSession();

				Transaction tr = session.beginTransaction();

				Query query = session.createQuery("from RegistrationVO where reg_id='"+vo.getReg_id()+"' ");
				
				l = query.list();
				
				tr.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return l;

		}
	 public void update(RegistrationVO vo) {
			
			try {
				
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

				Session session = sessionFactory.openSession();

				Transaction tr = session.beginTransaction();

				session.saveOrUpdate(vo);
				
				tr.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }

	}




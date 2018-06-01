package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.ComplainVO;

public class ComplainDAO {
	public void insert(ComplainVO v) {
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(v);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public List display(ComplainVO vo1) {
		// TODO Auto-generated method stub
List l1 = new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from ComplainVO");
		l1=q.list();
		
		System.out.println("done??");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}
	public void insertComplain(ComplainVO complainVO) {
		// TODO Auto-generated method stub
		try {

			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tr = session.beginTransaction();

			session.save(complainVO);

			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public List search() {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		try{
			System.out.println("Inserting in DAO..");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			Query q = session.createQuery("from ComplainVO");
			ls = q.list();

			System.out.println("cat list in dao : "+ls.size());

			tr.commit();
			System.out.println("Searching in DAO Done!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;

	}

	public List replyComplain(ComplainVO complainVO) {
		// TODO Auto-generated method stub
		List complainList = new ArrayList();
		try{
			SessionFactory sessionFactory = new	Configuration().configure().buildSessionFactory();
			
			Session	session = sessionFactory.openSession();
				
				
				Transaction tr = session.beginTransaction();
				// Create new instance of Contact and set

				// values in it by reading them from form object
				System.out.println("Inserting Record");
				
				Query q= session.createQuery("from ComplainVO where id="+complainVO.getComplainId());
				complainList=q.list();
				
				tr.commit();
				System.out.println("Done");
				session.flush();
				session.close();

				
			} catch (Exception e) {
				e.printStackTrace();
		}
		return complainList;	
		}

	public void replyPost(ComplainVO complainVO) {
		// TODO Auto-generated method stub
		try {

			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction tr = session.beginTransaction();

			session.save(complainVO);

			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



}

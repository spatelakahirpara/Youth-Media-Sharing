package dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.FeedbackVO;

public class FeedbackDAO {
	public void insert(FeedbackVO v) {
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

	

	public List display(FeedbackVO vo1) {
		// TODO Auto-generated method stub
List l1 = new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from FeedbackVO");
		l1=q.list();
		
		System.out.println("done??");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}	}



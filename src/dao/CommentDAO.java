package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import vo.CommentVO;
import vo.FeedbackVO;
import vo.subCategoryVO;

public class CommentDAO {

	public void insertComment(CommentVO v) {
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

	public List display_Comment(CommentVO vo1) {
		List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from CommentVO");
		l1=q.list();
		
		System.out.println("done??");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
		// TODO Auto-generated method stub
		
	}
	public void delete(CommentVO vo)throws Exception
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
	public List search(CommentVO vo1) {
		List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from CommentVO");
		l1=q.list();
		
		System.out.println("done??");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
		// TODO Auto-generated method stub
		
	}


	

}

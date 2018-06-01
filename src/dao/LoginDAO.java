package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import vo.CityVO;
import vo.LoginVO;

public class LoginDAO {

	public void signin(LoginVO v) {
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
	
	public List authentication(LoginVO loginVO)throws Exception
	{
		List l1=new ArrayList();
		
		try{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Query q=session.createQuery("from LoginVO where user_name='"+loginVO.getUser_name()+"' and password='"+loginVO.getPassword()+"'");
		l1=q.list();
		
		System.out.println("done");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}	
	public List search1(LoginVO loginVO) {
		// TODO Auto-generated method stub
		List complainList = new ArrayList();
		try{
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			Transaction tr = session.beginTransaction();
			
			Query q=session.createQuery("from LoginVO where login_id='"+loginVO.getLogin_id()+"'");

			complainList = q.list();

			tr.commit();
			System.out.println("User List :: "+complainList.size());

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return complainList;

	}
	public List searchAdmin() {
		// TODO Auto-generated method stub

		List ls=null;

		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from LoginVO where usertype='admin' ");
			ls = q.list();
		} catch (Exception e) {
			// TODO: handle exception-
			e.printStackTrace();
		}
		return ls;

	}
}



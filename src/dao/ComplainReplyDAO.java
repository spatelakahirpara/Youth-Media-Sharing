package dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ComplainReplyDAO {
	public void insert(ComplainReplyVo complainReplyVo)
	{
		// TODO Auto-generated method stub
		
		try 
		{
			
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

				Session session = sessionFactory.openSession();

				Transaction tr = session.beginTransaction();

				session.save(complainReplyVo);
				
				tr.commit();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
	
	
	}

}

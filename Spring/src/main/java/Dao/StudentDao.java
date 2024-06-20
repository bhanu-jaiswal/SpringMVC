 package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

 
public class StudentDao {

	private SessionFactory sessionFactory;
	
	public StudentDao(){
		
		Configuration config=new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	
	public Student findbyId(int id) { 
		
		Session  session=sessionFactory.openSession();
		Student student=session.get(Student.class, id);
		
		
		return student;}


}




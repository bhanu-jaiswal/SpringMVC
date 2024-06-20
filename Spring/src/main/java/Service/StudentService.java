package Service;

import com.entities.Student;

import Dao.StudentDao;

public class StudentService {

	
	
	private StudentDao studentDao;
	
	public StudentService() {
	studentDao=new StudentDao();	
		
	}
	public Student findbyId(int id) {
		return studentDao.findbyId(id);
	}
	
	
}
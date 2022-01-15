package Day_15;

public class StudentIdNotFoundException extends Exception {
	int sid;
	
	StudentIdNotFoundException()
	{
		
	}
	

	public StudentIdNotFoundException(int sid) {
		
		this.sid = sid;
	}
	


	@Override
	public String toString() {
		return "Student id not found" ;
	
		
	}
	


	@Override
	public String getMessage() {
		return "Student with" + " id " + " not found " ;
	}
}




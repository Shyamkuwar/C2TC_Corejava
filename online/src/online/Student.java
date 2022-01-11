package online;

public class Student {
	

	int usn;
	String name;
	String email;
	long num;
	
	public Student() {
		
	}
	
	public Student(int usn) {
		this.usn=usn;
	}

	public String toString() {
		String str="("+usn+","+name+","+email+","+num+")";
		return str;
		
}

	public Student(int usn, String name, String email, long num) {
		super();
		this.usn = usn;
		this.name = name;
		this.email = email;
		this.num = num;
	}
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.usn=101;
		s1.name="Sk";
		s1.email="sk@1";
		s1.num=1234566789L;
	System.out.println(s1.toString());
	
	Student s2=new Student(102,"Pk","pk@1",9876543210L);
	System.out.println(s2.toString());
	
	Student s3=new Student(103);
	System.out.println(s3.toString());
		
	}

}

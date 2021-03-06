package Day_11;

public class Employee {
	
	int id;
	String name;
	String email;
	float salary;

	public Employee() {
		
	}

	public Employee(int id, String name, String email, float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public Employee(int id) {
		this.id=id;
	}
	
	public String toString() {
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="Sk";
		e1.email="sk@1";
		e1.salary=45.99f;
		System.out.println(e1.toString());
		
		Employee e2=new Employee(102,"Pk","pk@1",45.55f);
		System.out.println(e2.toString());
	
		Employee e3=new Employee(103);
		System.out.println(e3.toString());
		
		
				
		
	}

}

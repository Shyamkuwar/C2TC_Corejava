package online;

public class Variable_Demo1 {
	final static int a=1024;
	int b;
	
	void func() {
		final int c;
		c=10;
		System.out.println("class variable " + a + " " + b);
		System.out.println("lacal variable " + c);
		// a=7890;
		b=56;
		System.out.println("class variable " + a + " " + b);
	}
	public static void main(String[] args) {
		Variable_Demo1 obj=new Variable_Demo1();
		System.out.println(Variable_Demo1.a);
	}
	}

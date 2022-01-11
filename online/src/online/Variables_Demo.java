package online;

public class Variables_Demo {
	int a = 1024;
    int b;
	
	void func1() {
		int c;
		c = 10;
		System.out.println("class variables " + a + " " +b);
		System.out.println("local variable " + c);
		a=7890;
		b=56;
		System.out.println("class vaeiables " + a + " " + b);
	}
	void func2() {
		System.out.println("class variables " + a + " " + b);
	}
	
	public static void main(String[] args) {
		
	}

}

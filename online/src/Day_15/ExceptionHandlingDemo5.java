package Day_15;

import java.io.IOException;
public class ExceptionHandlingDemo5 {
	void m() throws IOException
	{
		throw new IOException("device error");
	}
    void n()throws IOException
    {
    	m();
    }
    void p()
    {
    try
    {
    	n();
    }
    catch(Exception e) {
    	System.out.println("exception handled");
    }
    }
	public static void main(String[] args) 
	{
		ExceptionHandlingDemo5 obj=new ExceptionHandlingDemo5();
		obj.p();
		System.out.println("normal flow....");
		

	}

}

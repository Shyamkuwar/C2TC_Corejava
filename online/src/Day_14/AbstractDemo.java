package Day_14;

import Day_13.Bank;
import Day_13.SBI;

abstract class Bank1
{
	 abstract float getRateOfInterest();
	 void display()
	 {
       System.out.println("Abstract class");
	  }
	}
	class SBI1 extends Bank1
	{

		@Override
		float getRateOfInterest() {
			
			return 7.0f;
		}
	}
	class HDFC1 extends Bank1
	{
	 float getRateOfInterest()
	 {
	  return 6.8f;
	 }
	}

	class ICICI1 extends Bank1
	{
	 float getRateOfInterest()
	 {
	  return 6.9f;
	 }
	}


	
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		  System.out.println(obj.getRateOfInterest());
		  
		  Bank obj1=new SBI();
		  System.out.println(obj1.getRateOfInterest());

	}

}

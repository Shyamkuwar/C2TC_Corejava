package online;

class Box
{
	float width;
	float height;
	float depth;
	float calcVol() {
		return width*height*depth;
	}
	}


public class BoxDemo {

	public static void main(String[] args) {
		
	
		Box b1=new Box();
		b1.width=3.4f;
		b1.height=2.2f;
		b1.depth=1.4f;
		float vol=b1.calcVol();
		System.out.println("Volume of b1 is "+vol);
		
		Box b2=new Box();
		b1.width=4.4f;
		b1.height=3.3f;
		b1.depth=2.4f;
		vol=b2.calcVol();
		System.out.println("Volume of b2 is "+vol);
	}
		

	}

package online;
abstract class GraphicObject
{
	int x,y;
	void moveTo(int newX, int newY)
	{
		this.x=newX;
		this.y=newY;
		}
	abstract void draw();
	abstract void resize();
}

class Rectangular extends GraphicObject
{
 void show()
 {
	
 }

@Override
void draw() {
	
}

@Override
void resize() {
		
}
}

class Circle extends GraphicObject
{

	@Override
	void draw() {
	
		
	}

	@Override
	void resize() {
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		Rectangular obj1=new Rectangular();
		obj1.show();
		
		
		

	}

}

/**
 * Simple Java program for Abstract class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
abstract class Drawing
{
	abstract void draw();
}
class Circle extends Drawing
{
	public void draw()
	{
		System.out.println("Circle.....");
	}
	
}
class Rectangle extends Drawing
{
	public void draw()
	{
		System.out.println("Rectangle....");
	}
}


public class TestAbstraction 
{

	public static void main(String[] args) 
	{
		Drawing d;
		d=new Circle();
		d.draw();
		d=new Rectangle();
		d.draw();

	}

}

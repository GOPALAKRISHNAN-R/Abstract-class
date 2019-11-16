/**
 * Simple Java program for Abstract class(abstract method and concrete method)
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is created....");
	}
	int a=4,b=5,c=6;
	abstract void gearType();
	void run()
	{
		System.out.println("Running....");
	}
}
class TVSXL extends Bike
{
	public void gearType()
	{
		System.out.println("Bike has Without gear....");
	}
}
class HeroHonda extends Bike
{
	public void gearType()
	{
		System.out.println("Bike has 4 gears..."+a);
	}
}
class Apache extends Bike
{
	public void gearType()
	{
		System.out.println("Bike has 5 gears..."+b);
	}
}
class R3 extends Bike
{
	public void gearType() 
	{
		System.out.println("Bike has 6 gear"+c);
		
	}
	
}
public class TestApplication3 
{
	public static void main(String[] args) 
	{
		Bike b;
		b=new TVSXL();
		b.gearType();
		b.run();
		b=new HeroHonda();
		b.gearType();
		b.run();
		b=new Apache();
		b.gearType();
		b.run();
		b=new R3();
		b.gearType();
		b.run();
	}

}

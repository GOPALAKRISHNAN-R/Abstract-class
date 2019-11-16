/**
 * Simple Java program for Interface,Abstract class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
interface A
{
	void a();
	void b();
	void c();
}
abstract class Abs implements A
{
	public void a()
	{
		System.out.println("Hi...");
	}
}
class B extends Abs
{
	public void b()
	{
		System.out.println("Hello...");
	}
	public void c()
	{
		System.out.println("Welcome..");
	}
	
	
}

public class TestApplication4 
{
	public static void main(String args[])
	{
		Abs a;
		a=new B();
		a.a();
		a.b();
		a.c();
		
	}

}

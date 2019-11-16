/**
 * Simple Java program for Abstract class
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
abstract class Bank
{
	abstract int interestRate(); 
}

class SBI extends Bank
{
	public int interestRate()
	{
		return 7;	
	}
}

class CNR extends Bank
{
	public int interestRate()
	{
		return 9;
	}
}


public class TestApplication2 
{
	public static void main(String[] args) 
	{
		Bank b;
		b=new SBI();
		System.out.println(b.interestRate());
		b=new CNR();
		System.out.println(b.interestRate());
	}

}

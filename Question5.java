package Assignment3;

import java.util.Date;
import java.util.Random;

abstract class Medicine
{
	double price;
	Date expirydate;
	
	public Medicine()
	{
		super();
	}
	
	
	
	public Medicine(double price, Date expirydate) {
		super();
		this.price = price;
		this.expirydate = expirydate;
	}
	void getDetails()
	{
		System.out.println("price:"+price);
		System.out.println("expirydate:"+expirydate);
	}
	public abstract void displayLable();
}

 class Tablet extends Medicine
{
	 public Tablet()
		{
			super();
			price=350;
			expirydate=new Date();
		}


	public Tablet(double price, Date expirydate) {
		super(price, expirydate);
	}

	@Override
	public void displayLable() {
		System.out.println("Tablet"+"\n"+"Store in a cool dry place");
	}

	
}
class Syrup extends Medicine 
{
	public Syrup()
	{
		super();
		price=150;
		expirydate=new Date();
	}


	public Syrup(double price, Date expirydate) {
		super(price, expirydate);
		
		
	}

	@Override
	public void displayLable() {
		System.out.println("Syrup"+"\n"+"Keep away from children");
		
	}
	
}

class Ointment extends Medicine
{
	public Ointment()
	{
		super();
		price=400;
		expirydate=new Date();
	}

	public Ointment(double price, Date expirydate) {
		super(price, expirydate);
	}

	@Override
	public void displayLable() {
		System.out.println("Ointment"+"\n"+"For external use only");
		
	}
	
	
}

public class Question5{
	public static void main(String[] args) {
		Random rand = new Random();
		Medicine arr[]=new Medicine[5];
		arr[0]=new Tablet();
		arr[1]=new Syrup();
		arr[2]=new Ointment();
		
		int rand_arr=rand.nextInt(3);
		Medicine m = arr[rand_arr];
		m.displayLable();
		m.getDetails();
		
	}
	
}


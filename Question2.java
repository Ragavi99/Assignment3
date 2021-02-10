package Assignment3;

import java.util.Scanner;

abstract class PrepaidCard
{
	int cardno;
	double availableBalance;
	double swipeLimit;
	
	
	public PrepaidCard(int cardno, double availableBalance, double swipeLimit) {
		super();
		this.cardno = cardno;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}
	
	public PrepaidCard()
	{
		
	}
	
	public abstract boolean swipeCard(double amount);
	
	public void rechargeCard(double amount)
	{
		availableBalance=amount+availableBalance;
		System.out.println("After recharge card available balance ="+availableBalance);
	}

	@Override
	public String toString() {
		return "PrepaidCard [cardno=" + cardno + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
}

class TravelCard extends PrepaidCard implements Rewardable
{
	int rewardPoints=0;

	public TravelCard(int cardno, double availableBalance, double swipeLimit, int rewardOints) {
		super(cardno, availableBalance, swipeLimit);
		this.rewardPoints = rewardOints;
	}
	
	public TravelCard()
	{
		super();
	}

	@Override
	public boolean swipeCard(double amount) {
		amount = amount*60;
		if(amount<=swipeLimit && amount<=availableBalance)
		{
			double remainBalance=availableBalance-amount;
			remainBalance=remainBalance-0.05*remainBalance;
			System.out.println("after swipe card balance="+remainBalance);
			System.out.println("transaction successfull");
			return true;
		}
		else
		{
			System.out.println("transaction can't done");
			return false;
		}
		
	}
	
	@Override
	public int rewards(double amount) {
		while( amount>=100)
		{
			rewardPoints+=5;
			amount = amount - 100;
			}
		return rewardPoints;
		
		}
	
}

public class Question2 {

	public static void main(String[] args) {
		
		PrepaidCard p = new TravelCard(2345, 6000, 7000, 5);
		Rewardable r = new TravelCard();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(p);
		System.out.println("amount in dollers ="+p.availableBalance/60);
		System.out.println("enter the swipe amount in dollers =");
		double amount=sc.nextDouble();
		p.swipeCard(amount);
		System.out.println("earn reward points ="+r.rewards(amount*60));

	}

}

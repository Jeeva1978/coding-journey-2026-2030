package day11.pratices_question1;
import java.util.Scanner;
class ExecptionType extends Exception
{
	ExecptionType(String n)
	{
		super(n);
	}
}
class bankaccount {
	private String accountholder;
	public double balance ;
	void printline()
	{
		for(int u = 0;u<=156;u++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	public bankaccount(String ah,double b)
	{
		accountholder = ah;
		if(b<=0)
		{
			balance=0;
		}
		else {
			balance= b;
		}
	}
	public void printAccount() {
	    printline();
	    System.out.println("this the name of the account holder :- " + accountholder);
	    System.out.println("this the balance :- " + balance);
	    printline();
	}
	public void deposit(double Dmoney)
	{
		try {
			if(Dmoney<=0)
			{
				throw new ExecptionType("invaild money entery please try again");
			}
			else {
				balance = balance + Dmoney;
			}
		}
		catch(ExecptionType e)
		{
			System.out.println(e);
		}
	}
	public void withdraw(double Wmoney)
	{
		try {
			if(Wmoney<0)
			{
				throw new ExecptionType("invaild funds entery");
			}
			else if(Wmoney > this.balance)
			{
				throw new ExecptionType("insufficient funds");
			}
			else {
				this.balance = this.balance - Wmoney;
			}
		}
		catch(ExecptionType e)
		{
			System.out.println(e);
		}
	}
}
public class q1{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter how many detail bank account to fill (one day (5 entey is allowed)):-");
		int k = scan.nextInt();
		System.out.print("\r");
		if(k>0 && k<=5)
		{
			String[] ahs = new String[k];
			double[] bals = new double[k];
			for(int i =0; i<k;i++)
			{
				System.out.print("enter the name :-");
				scan.nextLine();
				String ah = scan.nextLine();
				System.out.print("\r");
				ahs[i] = ah;
				System.out.print("enter the balance:-");
				double bal = scan.nextDouble();
				System.out.print("\r");
				bals[i] = bal;
			}
			bankaccount[] acc = new bankaccount[k];
			for(int i = 0; i < k; i++) {
			    acc[i] = new bankaccount(ahs[i], bals[i]);
			}
			for(int i = 0;i<k;i++)
			{
				acc[i].printAccount();
			}
			System.out.print("if you want to (deposite/withdraw) :-");
			String dw = scan.nextLine();
			int accenter=0;
			try {
				System.out.println("which account to (deposite or withdraw) in which you enter the detail in the program by that way you want to pick(1,2,3,4,5):- ");
				accenter = scan.nextInt();
				if(accenter>5 || accenter<0)
				{
					throw new ExecptionType("invalid entery (accountID >5) please try again it should between 1 to 5");
				}
			}
			catch(ExecptionType e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e+"this a invalid data type enetery it should 1 to 5 ");
			}
			if(dw.equals("deposite"))
			{
				acc[accenter].deposit(1000);
			}
			else if (dw.equals("withdraw"))
			{
				acc[accenter-1].withdraw(10000);
			}
			System.out.println("please take a print one time process :- thank you");
		}
		else {
			System.out.println("please check the entey input ");
			System.out.println("please try again:= thank you");
		}
	}
}
	
	


package day3.constructor.con1;
import java.util.Scanner;
public class bankaccount {
	String accountholder;
	double balance ;
	void printline()
	{
		for(int u = 0;u<=156;u++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	bankaccount(String ah,double b)
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
	void printAccount() {
	    printline();
	    System.out.println("this the name of the account holder :- " + accountholder);
	    System.out.println("this the balance :- " + balance);
	    printline();
	}
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
			for(int i = 0; i < k; i++) {
			    bankaccount account = new bankaccount(ahs[i], bals[i]);
			    account.printAccount();
			}
			System.out.println("please take a print one time process :- thank you");
		}
		else {
			System.out.println("please check the entey input ");
			System.out.println("please try again:= thank you");
		}
	}
	

}

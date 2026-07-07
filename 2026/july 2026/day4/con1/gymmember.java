package day3.constructor.con1;
import java.util.Scanner;
public class gymmember {
	String name = "not entered";
	double age = 0;
	String membershiptype ="not entered";
	void printline()
	{
		for(int u = 0;u<=156;u++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	gymmember(String n,double a, String m)
	{
		name = n;
		age = a;
		membershiptype=m;
	}
	gymmember()
	{
		name = "not entered";
		age = 0;
		membershiptype ="not entered";
	}
	void get_detail()
	{
		printline();
		System.out.println("name :- "+name);
		System.out.println("age :- "+age);
		System.out.println("member ship type :-"+membershiptype);
		printline();
	}
	void change_detail(String name,double age , String membershiptype)
	{
		this.name=name;
		this.age = age;
		this.membershiptype = membershiptype;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter how many detail of gym member to fill :- ");
		int k = scan.nextInt();
		scan.nextLine();
		String[] name = new String[k];
		double[] age = new double[k];
		String[] memebership = new String[k];
		gymmember ob1 = new gymmember();
		for(int i =0; i<k;i++)
		{
			ob1.printline();
			System.out.print("enter the name :- ");
			String ah = scan.nextLine();
			name[i] = ah;
			ob1.printline();
			ob1.printline();
			System.out.print("enter the age:- ");
			double bal = scan.nextDouble();
			scan.nextLine();
			age[i] = bal;
			ob1.printline();
			ob1.printline();
			System.out.print("enter the member ship type :- ");
			String mem = scan.nextLine();
			ob1.printline();
			memebership[i] = mem;
		}
		gymmember[] member = new gymmember[k];
		for(int i =0;i<k;i++)
		{
			member[i] = new gymmember(name[i],age[i],memebership[i]);
		}
		for(int i = 0;i<k;i++)
		{
			member[i].get_detail();
		}
		member[0].change_detail("koonesh",12,"permine");
		member[0].get_detail();
		
	}
}

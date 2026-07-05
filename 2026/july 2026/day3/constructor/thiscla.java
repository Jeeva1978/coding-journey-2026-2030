package day3.constructor;
import java.util.Scanner;
public class thiscla {
	String name ;
	thiscla(String a)
	{
		name = a;
	}
	void get_name(String s)
	{
		this.name = s;
		System.out.println("name :-"+s);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" 1. name :-");
		String n = scan.nextLine();
		System.out.println();
		thiscla ob1 = new thiscla(n);
		System.out.println(" 2. name :-");
		String k = scan.nextLine();
		System.out.println();
		thiscla ob2 = new thiscla(k);
		ob1.get_name(n);
		ob2.get_name(k);
		
	}

}

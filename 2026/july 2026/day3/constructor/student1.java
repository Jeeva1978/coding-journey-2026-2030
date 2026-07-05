package day3.constructor;
import java.util.Scanner;
public class student1 {
	String name = " not provider";
	String Class = "not provider";
	int roll_no = 0;
	int mark = 0;
	public student1(String n,String c,int r,int m)
	{
		name = n;
		roll_no =r;
		mark = m;
		Class = c;
		System.out.println("name :-"+n);
		System.out.println("roll number:-"+r);
		System.out.println("marks total out of 500 :-"+m);
		System.out.println("class :-"+c);	
	}
	public student1(String n,String c,int r)
	{
		name=n;
		Class = c;
		roll_no=r;
		System.out.println("name :-"+n);
		System.out.println("roll number:-"+r);
		System.out.println("marks total out of 500 :-"+mark);
		System.out.println("class :-"+c);
		System.out.println("please try again");
	}
	public student1(String n,String c)
	{
		name = n;
		Class = c;
		System.out.println("name :-"+n);
		System.out.println("roll number:-"+roll_no);
		System.out.println("marks total out of 500 :-"+mark);
		System.out.println("class :-"+c);
		System.out.println("please try again");
	}
	public student1(String n)
	{
		name = n;
		System.out.println("name :-"+n);
		System.out.println("roll number:-"+roll_no);
		System.out.println("marks total out of 500 :-"+mark);
		System.out.println("class :-"+Class);
		System.out.println("please try again");
	}
	public student1()
	{
		System.out.println("enter the detail");
	}
	public static void main(String[] args) {
		System.out.println("if the 0 and not provider is appearning , please try again to fill the detail");
		student1 ob1 = new student1();
	}

}

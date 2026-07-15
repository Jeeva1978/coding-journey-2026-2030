package day8.code_challenge6.q1;

public class Personq1 {
	public String name ;
	protected int age ;
	private int socialsecuritynumber ;// this Access only in the same class , we cannot access where other than this
	String address;// this defalt for different package it act has private variable
	public void display()
	{
		this.socialsecuritynumber = 20;
		System.out.println("this is the social security number :- "+socialsecuritynumber);
	}
}
class verify
{
	public static void main(String[] args)
	{
		Personq1 ob1 = new Personq1();
		ob1.address ="chennai";// this defalt but it is access in same package but different class , but we cannot access from different package
	}
}
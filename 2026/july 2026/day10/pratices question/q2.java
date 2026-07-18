package day10.pratices_questions;
abstract class Employee
{
	private String name;
	public Employee(String n)
	{
		name = n;
	}
	void clockIn()
	{
		System.out.println(name+" clocked in");
	}
	abstract void calculatepay();
}
class FullTimeEmployee extends Employee
{
	FullTimeEmployee(String n)
	{
		super(n);
		super.clockIn();
	}
	void calculatepay()
	{
		System.out.println("the salary for the full time empolyee is "+(60000+2500));
	}
}
class PartTimeEmpolyee extends Employee
{
	int hour ;
	PartTimeEmpolyee(String n,int h)
	{
		super(n);
		super.clockIn();
		hour = h;
	}
	void calculatepay()
	{
		System.out.println("this salary for the Part Time Employee is "+(hour*69));
	}
}
public class q2 {

	public static void main(String[] args) {
		FullTimeEmployee FE1 = new FullTimeEmployee("Jeeva");
		PartTimeEmpolyee PE1 = new PartTimeEmpolyee("vishal",6);
		FE1.calculatepay();
		PE1.calculatepay();
	}

}

package q3;
class Employee
{
	protected int calculatesalary()
	{
		return 50000;
	}
}
class manager extends Employee
{
	protected int calculatesalary()
	{
		int salary = super.calculatesalary();
		int bonus = 20000;
		salary = salary+bonus;
		return salary;
	}
}
public class mainclass {
	public static void main(String[] args)
	{
		manager m1 = new manager();
		Employee E1 = new Employee();
		int salary = E1.calculatesalary();
		int sabo = m1.calculatesalary();
		System.out.println(salary);
		System.out.println(sabo);
	}
}

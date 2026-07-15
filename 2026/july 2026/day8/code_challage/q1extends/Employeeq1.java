package day8.code_challenge6.q1extends;
import day8.code_challenge6.q1.Personq1;
public class Employeeq1 extends Personq1{
	public static void mian(String [] args)
	{
		Employeeq1 obj1 = new Employeeq1();
		obj1.name = "Jeevanesh"; // public variable (where ever we can accessible this variable)
		System.out.println("the name :- "+obj1.name);
		obj1.age = 12; // protected variable (we can access in same class, same package( class) , different package (class) access by the inhertance and calling the object)
		System.out.println("the age :- "+obj1.age);
		obj1.display();
	}
}

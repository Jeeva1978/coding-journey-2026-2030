package q1;
import java.util.Scanner;
public class Animal {
	protected String name = "";
	public void eat()
	{
		System.out.println(this.name+" is eating");
	}
	public static void main(String[] args)
	{
		dog dog1 = new dog();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Dog name:-");
		String n = scan.nextLine();
		dog1.name = n;
		dog1.eat();
		dog1.bark();
	}
}
class dog extends Animal
{
	public void bark()
	{
		System.out.println(this.name+" bark");
	}
}

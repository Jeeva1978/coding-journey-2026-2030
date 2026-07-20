
package day12.coding_challage7.execption_handling;
import java.util.Scanner;
class InvaildAgeException extends Exception
{
	InvaildAgeException(String n)
	{
		super(n);
	}
}
class Agevaildator 
{
	void checkAge(int age)
	{
		try
		{
			if(age>150 || age<0)
			{
				throw new InvaildAgeException("this not vaild it should more than 0 and less than 150");
			}
			else
			{
				System.out.println("you age is vaild , thank you");
			}
		}
		catch(InvaildAgeException e)
		{
			System.out.println(e);
		}
	}
}
public class q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age :-");
		int age = scan.nextInt();
		Agevaildator ob = new Agevaildator();
		ob.checkAge(age);
	}

}

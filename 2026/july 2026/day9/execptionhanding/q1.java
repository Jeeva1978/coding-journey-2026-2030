package day9.exceptionhanding;
import java.util.InputMismatchException;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		try {
			System.out.print("enter the number a = ");
			a = scan.nextInt();
			System.out.print("enter the number b = ");
			b = scan.nextInt();
			c = a/b;
			System.out.println("division of and b (a/b) = "+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("bfjdj");
		}
		
		
	}

}

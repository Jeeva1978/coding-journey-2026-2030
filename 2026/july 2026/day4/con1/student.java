package day3.constructor.con1;
import java.util.Scanner;
public class student {
	String name ;
	int marks;
	student(String n , int m )
	{
		name = n;
		marks = m;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name");
		String n = scan.nextLine();
		System.out.print("\r");
		System.out.println("enter the marks");
		int m = scan.nextInt();
		System.out.print("\r");
		String M = "jeeca";
		int j = 89;
		student student1 = new student(n,m);
		student student2 = new student(M,j);
		System.out.println(student1.name);
		System.out.println(student1.marks);
		System.out.println(student2.name);
		System.out.println(student2.marks);
	}

}

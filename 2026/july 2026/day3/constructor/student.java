package day3.constructor;


public class student {
	String name = "not printed";
	String class_op = "not printed";
	int marks = 0;
	int roll_no = 0;
	student(String n , int m, int r, String c)
	{
		name = n;
		class_op = c;
		marks = m;
		roll_no = r;
		System.out.println("the student regested");
	}
	public static void main(String[] args)
	{
		student ob1 = new student("jeeva", 50 , 101 , "IX");
		System.out.println("if not regiesed it shows the 0 and not print");
		System.out.println(ob1.name);
		System.out.println(ob1.class_op);
		System.out.println(ob1.marks);
		System.out.println();
	}

}

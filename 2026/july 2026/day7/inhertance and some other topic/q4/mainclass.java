package q4;
class person
{
	private String name ="";
	person(String name)
	{
		this.name = name;
	}
	void displayname()
	{
		System.out.println("the name :- "+name);
	}
}
class Student extends person
{
	private String course ="";
	Student(String name,String course)
	{
		super(name);
		this.course= course;
	}
	void displayname()
	{
		System.out.println("the course :- "+course);
	}
}
class Graduatestudent extends Student
{
	private String thisistitle ="";
	Graduatestudent(String name,String course,String thisistitle)
	{
		super(name,course);
		this.thisistitle = thisistitle;
	}
	void displayname()
	{
		System.out.println("this is the title :- "+thisistitle);
	}
	
}
public class mainclass {
	public static void main(String[] args)
	{
		Graduatestudent entery1 = new Graduatestudent("jeeva","computer science","java hello world");
		entery1.displayname();
		Student enter1 = new Student("jestin","computer science");
		enter1.displayname();
		person ent1 = new person("vishal");
		ent1.displayname();
	}
}

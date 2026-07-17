package day9.q1;
class School
{
	String name ;
	String ID;
}
class student extends School
{
	String grade;
	student(String g)
	{
		grade = g;
	}
	void grade_level()
	{
		System.out.println(name+" has this grade in class "+grade);
	}
}
class teacher extends School
{
	String subject;
	teacher(String s)
	{
		subject = s;
	}
	void Subject()
	{
		System.out.println("the teacher "+name+" is teaching this subject "+subject);
	}
}
class princpal extends School
{
	void list_policies()
	{
		System.out.println("uniform policy");
		System.out.println("attance policy");
		System.out.println("no phone allowed");
	}
}
public class q1 {

	public static void main(String[] args) {
		student s1 = new student("A+");
		s1.name = "jeeva";
		s1.ID = "A1201";
		teacher t1 = new teacher("english");
		t1.name = "vishal";
		t1.ID = "A1202";
		princpal p1 = new princpal();
		p1.name = "valli";
		p1.ID = "100";
		System.out.println("Student name :- "+s1.name);
		System.out.println("Student ID := "+s1.ID);
		s1.grade_level();
		System.out.println("teacher name :- "+t1.name);
		System.out.println("teacher ID :- "+t1.ID);
		t1.Subject();
		System.out.println("principal name :- "+p1.name);
		System.out.println("principal ID :- "+p1.ID);
		p1.list_policies();
	}

}

package day5.super_key;
class person
{
	String name;
	person(String n)
	{
		name = n;
	}
}
class employee extends person
{
	int employeeld;
	employee(String name,int e)
	{
		super(name);
		employeeld = e;
	}
	void display()
	{
		System.out.println("employee ID :- "+employeeld);
		System.out.println("name :- "+name);
	}
}
public class company {

	public static void main(String[] args) {
		employee emp1 = new employee("jeevanesh",1);
		emp1.display();
	}

}

package day6.inhertance.all_type_question;
class animal
{
	String name;
	void eat()
	{
		System.out.println("animal eat the meat");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("dog braks");
	}
}
class puppy extends dog
{
	void weep()
	{
		System.out.println("puppy weep");
	}
}
public class mainclass01 {
	public static void main(String args[])
	{
		puppy p1 = new puppy();
		p1.eat();
		p1.bark();
		p1.weep();
	}
}

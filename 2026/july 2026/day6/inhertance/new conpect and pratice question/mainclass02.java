package day6.inhertance.all_type_question;
class shape
{
	void area()
	{
		System.out.println("Area not defined");
	}
}
class circle extends shape
{
	void area()
	{
		System.out.println("circle are is pay(radius)whole sqaure");
	}
}
class square extends shape
{
	void area()
	{
		System.out.println("square area is sides whole square");
	}
}
public class mainclass02 {
	public static void main(String[] args)
	{
		circle c1 = new circle();
		c1.area();
		square s1 = new square();
		s1.area();
	}
	
}

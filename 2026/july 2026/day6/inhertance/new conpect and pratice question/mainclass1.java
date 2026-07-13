package day6.inhertance.all_type_question;
class v
{
	String brand;
	int speed;
	void sound()
	{
		System.out.println("Vehicle makes a sound");
	}
}
class car2 extends v
{
	int numsdoors;
	void sound()
	{
		super.sound();
		System.out.println("car honks");
	}
}
public class mainclass1 {
	public static void main(String[] args)
	{
		car2 car3 = new car2();
		car3.sound();
	}
}

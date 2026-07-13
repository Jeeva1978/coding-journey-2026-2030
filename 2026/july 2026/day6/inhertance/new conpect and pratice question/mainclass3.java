package day6.inhertance.all_type_question;
class e
{
	String brand;
	protected String speed;
}
class c extends e
{
	int numsdoors;
	c(String b,String s)
	{
		e v = new e();
		brand = b;
		this.speed =s ;
	}
	void display()
	{
		System.out.println("vehicle :- "+brand);
		System.out.println("speed :-"+speed);
	}
}
public class mainclass3 {
	public static void main(String[] args)
	{
		c car1 = new c("benz","100km/h");
		car1.display();
	}
}

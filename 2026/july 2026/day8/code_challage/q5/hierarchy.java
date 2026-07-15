package day8.code_challenge6.q5;

public class hierarchy {
	public static void main(String[] args) {
		car c1 = new car();
		c1.startEngine();
		String typec = c1.getvehicletype("destel");
		System.out.println("the car type :- "+typec);
		c1.drive();
		motorcycle m1 = new motorcycle();
		m1.startEngine();
		String typem = c1.getvehicletype("petrol");
		System.out.println("the motorcycle :- "+typem);
		m1.drive();
	}

}
abstract class vehicle
{
	final void startEngine()
	{
		System.out.println("Engine started");
	}
	static String getvehicletype(String n)
	{
		return n;
	}
}
class car extends vehicle
{
	void drive()
	{
		System.out.println("car drive in the four wheeler");
	}
}
class motorcycle extends vehicle
{
	void drive()
	{
		System.out.println("motorcycle drive in two wheeler");
	}
}

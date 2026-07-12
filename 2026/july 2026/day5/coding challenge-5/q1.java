package day5.code_challage;
class vehicle1
{
	String brand;
	int speed;
	void display()
	{
		System.out.println("vehicle brand :- "+brand);
		System.out.println("vehicle speed :- "+speed);
	}
}
class car1 extends vehicle1
{
	int numDoors;
}
public class q1 {
	public static void main(String[] args)
	{
		car1 obj1 = new car1();
		obj1.brand = "benz";
		obj1.speed = 120;
		obj1.display();
	}
	
}

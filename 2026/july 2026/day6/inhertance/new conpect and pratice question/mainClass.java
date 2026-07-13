package day6.inhertance.all_type_question;
class vehicle
{
	String brand;
	int speed;
	vehicle(String brand,int speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
}
class car extends vehicle
{
	int numdoors;
	car(String brand,int speed,int numdoors)
	{
		super(brand,speed);
		this.numdoors =numdoors;
	}
}
public class mainClass {

	public static void main(String[] args) {
		car car1 = new car("benz",160,4);
		System.out.println("car brand :- "+car1.brand);
		System.out.println("car speed :- "+car1.speed);
		System.out.println("car doors :- "+car1.numdoors);

	}

}

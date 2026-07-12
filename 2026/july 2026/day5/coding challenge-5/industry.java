package day5.code_challage;
class vehicle
{
	String brand ;
	int year;
	void startEngine()
	{
		
	}
}
class car extends vehicle
{
	String fuelType;
	void startEngine()
	{
		System.out.println("Car engine starts");
	}
	void drive()
	{
		System.out.println(" Car is driving");
	}
}
class truck extends vehicle
{
	int loadcapacity;
	void startEngine()
	{
		System.out.println("truck engine starts");
	}
	void haul()
	{
		System.out.println("Truck is hauling");
	}
}
public class industry {

	public static void main(String[] args) {
		car car1 = new car();
		car1.brand ="vishal";
		car1.year = 1900;
		car1.fuelType = "petrol";
		car1.startEngine();
		car1.drive();
		truck truck1 = new truck();
		truck1.brand = "jeeva";
		truck1.year = 2000;
		truck1.loadcapacity =40;
		truck1.startEngine();
		truck1.haul();
	}

}

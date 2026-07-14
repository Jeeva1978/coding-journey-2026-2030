package q2;

public class vehicle {
	private String brand ="";
	String brandname(String b)
	{
		this.brand = b;
		return this.brand;
	}
	vehicle(String brand)
	{
		String br =brandname(brand);
		System.out.println("vehicle created :- "+br);
	}
	public static void main(String[] args)
	{
		car car1 = new car("benz","m2");
	}
}
class car extends vehicle
{
	String model = "";
	car(String brand,String model)
	{
		super(brand);
		System.out.println("vehicle model :- "+model);
	}
}

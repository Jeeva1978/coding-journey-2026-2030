package day10.pratices_questions;
abstract class Vehicle 
{
	String name;
	Vehicle(String n)
	{
		name = n;
	}
	void startEngine()
	{
		System.out.println(name+" Engine Start !");
	}
	abstract void maxSpeed(String ms);
}
interface Insurable
{
	double getInsuranceCost();
}
class car extends Vehicle implements Insurable
{
	car(String n)
	{
		super(n);
		startEngine();
	}
	void maxSpeed(String ms)
	{
		System.out.println("this "+name+" max speed :- "+ms);
	}
	public double getInsuranceCost()
	{
		return 20000.50;
	}
}
public class q4 {

	public static void main(String[] args) {
		car c1 = new car("benz");
		c1.maxSpeed("130 km/h");
		System.out.println("this is the "+c1.name+" car insurance payment"+c1.getInsuranceCost());
	}

}

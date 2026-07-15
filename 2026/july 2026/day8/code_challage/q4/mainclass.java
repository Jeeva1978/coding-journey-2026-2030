package day8.code_challenge6.q4;
abstract class Animal
{
	String name;
	Animal(String n)
	{
		this.name = n;
	}
	abstract void makeSound();
}
class Dog extends Animal
{
	Dog(String n)
	{
		super(n);
		System.out.println("Dog name :- "+n);
	}
	void makeSound()
	{
		System.out.println(this.name+" is barks !!");
	}
}
class cat extends Animal
{
	cat(String n)
	{
		super(n);
		System.out.println("Cat name :- "+n);
	}
	void makeSound()
	{
		System.out.println(this.name+" is meow..");
	}
}
public class mainclass {
	public static void main(String[] args)
	{
		Dog d1 = new Dog("Tommy");
		d1.makeSound();
		cat c1 = new cat("melon");
		c1.makeSound();
	}
}

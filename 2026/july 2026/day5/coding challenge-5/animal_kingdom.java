package day5.code_challage;
class Animal
{
	String name;
	int age;
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}
class dog extends Animal
{
	String breed;
	void makeSound()
	{
		System.out.println("Dog barks");
	}
	void fetch()
	{
		System.out.println("Dog is fetching");
	}
}
class cat extends Animal
{
	String color;
	void makeSound()
	{
		System.out.println("cat meows");
	}
	void climb()
	{
		System.out.println("Cat is climbing");
	}
}
public class animal_kingdom {
	public static void main(String[] args)
	{
		dog dog1 = new dog();
		dog1.name = "vishal";
		dog1.age = 19;
		dog1.breed ="human";
		dog1.makeSound();
		dog1.fetch();
		cat cat1 = new cat();
		cat1.name = "pussy cat";
		cat1.age = 5;
		cat1.color = "pink";
		cat1.climb();
		cat1.makeSound();
	}
}

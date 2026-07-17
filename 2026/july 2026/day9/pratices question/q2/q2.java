package day9.q2;
abstract class shop
{
	String name ;
	double price;
	abstract void detail();
}
class  book extends shop
{
	void detail()
	{
		System.out.println("name of the book :- "+name);
		System.out.println("price of the book :- "+price);
	}
}
class pen extends shop
{
	void detail()
	{
		System.out.println("name of the pen :- "+name);
		System.out.println("price of the pen :- "+price);
	}
}
class notebook extends shop
{
	void detail()
	{
		System.out.println("name of the notebook :- "+name);
		System.out.println("price of the notebook :- "+price);
	}
}
public class q2 {

	public static void main(String[] args) {
		book b1 = new book();
		b1.name = "tale of drogan";
		b1.price = 699.89;
		pen p1 = new pen();
		p1.name = "lol";
		p1.price = 999.99;
		notebook n1 = new notebook();
		n1.name = "holes page 154";
		n1.price = 347.84;
		b1.detail();
		p1.detail();
		n1.detail();

	}

}

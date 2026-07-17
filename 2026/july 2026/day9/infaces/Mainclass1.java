package day9.multiple_inhertance;
interface printable
{
	void display();
}
interface showable
{
	void display();
}
class document implements printable,showable
{
	public void display()
	{
		System.out.println("this all the document");
	}
}
public class Mainclass1 {
	public static void main(String[] args)
	{
		document d1 = new document();
		d1.display();
	}
}

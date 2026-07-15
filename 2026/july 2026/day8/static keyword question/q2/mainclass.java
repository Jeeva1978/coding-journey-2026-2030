package day8.static_keyword.q2;
final class a
{
	final void disp()
	{
		System.out.println("class a");
	}// with the final keyword we cannot override disp() method ;
}
class b // with the final keyword we cannot unherte the class a;
{
	void disp() // this disp() method is in another class;
	{
		System.out.println("class b");
	}
}
public class mainclass {
	public static void main(String[] args)
	{
		final int a = 10; // we cannot overwrite the a becasue of final keyword;
		a a1 = new a();
		b b1 = new b();
		a1.disp();
		b1.disp();
		System.out.println("num "+a);
		
	}
}

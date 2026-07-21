package day13.file_handling;
class A extends Thread
{
	public void run()
	{
		for(int i =0 ; i<=20;i++)
		{
			System.out.println("jeeva");
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i = 0; i<=20;i++)
		{
			System.out.println("janavika");
		}
	}
}
public class q5 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}

}

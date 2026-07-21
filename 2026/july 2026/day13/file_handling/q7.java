package day13.file_handling;
class A2 extends Thread
{
	int j =0;
	public void run()
	{
		for(int i =0;i<10;i++)
		{
				j=i;
		}
	}
}
public class q7 {
	public static void main(String[] args)
	{
		A2 a = new A2();
		a.start();
		try
		{
			a.join();
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		System.out.println(a.j);
	}
}

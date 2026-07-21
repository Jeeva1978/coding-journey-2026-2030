package day13.file_handling;
class A1 extends Thread
{
	public void run()
	{
		for(int i =0 ; i<=20;i++)
		{
			System.out.println("jeeva");
			try {
				Thread.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B1 extends Thread
{
	public void run()
	{
		for(int i = 0; i<=20;i++)
		{
			System.out.println("janavika");
			try {
				Thread.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class q6 {

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		a.start();
		b.start();
	}

}

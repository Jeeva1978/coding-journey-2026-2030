package day13.file_handling;
class A3 implements Runnable
{
	public void run()
	{
		System.out.println("janani cum ");
	}
}
public class q8 {

	public static void main(String[] args) {
		Runnable obj = new A3();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}

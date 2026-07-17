package day9.multiple_inhertance;
interface playable
{
	void play();
}
class Guitar implements playable
{
	public void play()
	{
		System.out.println("play guitar");
	}
}
class piano implements playable
{
	public void play()
	{
		System.out.println("play piano");
	}
}
public class mainclass {
	public static void main(String[] args)
	{
		Guitar g1 = new Guitar();
		piano p1 = new piano();
		g1.play();
		p1.play();
	}
}

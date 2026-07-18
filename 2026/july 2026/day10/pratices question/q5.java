package day10.pratices_questions;
interface Trainable
{
	void train();
}
interface intake
{
	void food();
}
class Boxer implements Trainable,intake
{
	public void train()
	{
		System.out.println("take a good training");
	}
	public void food()
	{
		System.out.println("take a good food and maintain the caloris");
	}
}
public class q5 {

	public static void main(String[] args) {
		Boxer b1 = new Boxer();
		b1.train();
		b1.food();
	}

}

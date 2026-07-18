package day10.pratices_questions;
interface Payable
{
	double getPaymentAmount();
}
class Freelancer implements Payable
{
	public double getPaymentAmount()
	{
		return 69000.69;
	}
}
public class q3 {

	public static void main(String[] args) {
		Freelancer F1 = new Freelancer();
		System.out.println("the Payment Amount :- "+F1.getPaymentAmount());
	}

}

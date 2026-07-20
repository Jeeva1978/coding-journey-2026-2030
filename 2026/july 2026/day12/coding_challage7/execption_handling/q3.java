package day12.coding_challage7.execption_handling;
class divde
{
	void cal(int num1,int num2) throws Exception
	{
		System.out.println("this is result :- "+num1/num2);
	}
}
public class q3 {
	public static void main(String[] args)
	{
		divde o = new divde();
		try{
			o.cal(1, 0);
		}
		catch(Exception e)
		{
			System.out.println(e+" (you cannot divide zero 0/0)");
		}
	}
}

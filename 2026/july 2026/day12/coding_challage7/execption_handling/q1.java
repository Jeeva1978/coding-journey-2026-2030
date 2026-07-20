package day12.coding_challage7.execption_handling;

public class q1 {
	int divdieNumbers(int num1,int num2)
	{
		int result =0;
		try {
			result = num1/num2;
		}
		catch(ArithmeticException e){
			System.out.println(e+" (this not valid zero cannot will be the divide)");
		}
		return result;
	}
	public static void main(String[] args) {
		q1 obj1 = new q1();
		System.out.println("this the divdision of this "+obj1.divdieNumbers(0, 0));
		System.out.println("this the divdision of this "+obj1.divdieNumbers(1,2));
		System.out.println("this the divdision of this "+obj1.divdieNumbers(1,3));
		System.out.println("this the divdision of this "+obj1.divdieNumbers(0,2));
	}

}

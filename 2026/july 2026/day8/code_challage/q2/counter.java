package day8.code_challenge6.q2;

public class counter {
	static int count;
	int instancenumber;
	counter()
	{
		count = count +1;// this static variable shared across all the instances of object is create
		instancenumber =instancenumber+1;// this change all of a object is created
	}
	void disp()
	{
		System.out.println(" the count :- "+count);
		System.out.println(" the instance number :- "+instancenumber);
	}

	public static void main(String[] args) {
		counter c1 = new counter();
		counter c2 = new counter();
		c1.disp();
		c2.disp();
		counter c3 = new counter();
		c3.disp();
		counter c4 = new counter();
		c4.disp(); 
	}

}

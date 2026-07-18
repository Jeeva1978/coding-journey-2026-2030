package day10.pratices_questions;
import java.util.Scanner;
abstract class shape
{
	String name;
	abstract void calculatearea();
}
class rectangle extends shape 
{
	double lenght;
	double beather;
	rectangle(double l , double b)
	{
		name = "rectangle";
		lenght = l;
		beather = b;
	}
	void calculatearea()
	{
		System.out.println("this is the area of "+name+" "+(lenght*beather));
	}
}
class triangle extends shape
{
	double base ;
	double height;
	triangle(double b,double h)
	{
		name = "triangle";
		this.base = b;
		this.height = h;
	}
	void calculatearea()
	{
		System.out.println("this is the area of "+name+" "+((1.0/2.0)*(this.base*this.height)));
	}
}
public class q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		shape[] shape1 = new shape[4];
		rectangle r = new rectangle(2,2);
		shape1[0] =r;
		rectangle r1 = new rectangle(4,4);
		shape1[1] = r1;
		triangle t = new triangle(2,20);
		shape1[2] = t;
		triangle t1 = new triangle(4,40);
		shape1[3] = t1;
		for(shape i : shape1)
		{
			i.calculatearea();
		}
		System.out.println("this aLL THE RESULT ");
		
	}

}

import java.util.Scanner;
public class addition
{
    int a= 10;
    int b=20;
    void sum()
    {
        System.out.print("this is the addition of num1 and num2 "+(a+b));
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        addition obj = new addition();
        System.out.print("enter num1 to add with num2 :- ");
        obj.a=scan.nextInt();
        System.out.print("\r");
        System.out.print("enter num2 to add with num1 :- ");
        obj.b=scan.nextInt();
        System.out.print("\r");
        obj.sum();

    }
}
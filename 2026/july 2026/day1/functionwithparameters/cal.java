import java.util.Scanner;
public class cal{
    static void printLine()
    {
        for (int i = 0; i <= 156; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    void sum(int num1,int num2)
    {
        System.out.println("this the addition of "+num1+" and "+num2);
        System.out.println(num1+num2);
    }
    void sub(int num1,int num2)
    {
        System.out.println("this is the subration of "+num1+" and "+num2);
        System.out.println(num1-num2);
    }
    void mul(int num1,int num2)
    {
        System.out.println("this is the mutluipal of "+num1+" and "+num2);
        System.out.println(num1*num2);
    }
    void div(double num1,double num2)
    {
        System.out.println("this is the divisible of "+num1+" and "+num2);
        System.out.println(num1/num2);
    }
    public static void main(String args[])
    {
        cal l = new cal();
        printLine();
        System.out.println("  CALCULATER  ");
        printLine();
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the num1:- ");
        int a = scan.nextInt();
        System.out.print("\r");
        System.out.print("enter the num2:- ");
        int b = scan.nextInt();
        scan.nextLine();
        System.out.print("\r");
        boolean k=true;
        while(k)
        {
            System.out.print("enter the operater (+,-,*,/):-");
            String c = scan.nextLine();
            System.out.print("\r");
            if(c.equals("+"))
            {
                k=false;
                l.sum(a,b);
            }
            else if(c.equals("-"))
            {
                k=false;
                l.sub(a,b);
            }
            else if(c.equals("*"))
            {
                k=false;
                l.mul(a,b);
            }
            else if(c.equals("/"))
            {
                double e = a;
                double d = b;
                k=false;
                l.div(e,d);
            }
            else
            {
                System.out.println("try");
            }
        }
        

    }
}
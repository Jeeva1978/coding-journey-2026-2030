
import java.util.Scanner;
public class find_q1{
    void evenorodd(int num)
    {
       if(num%2==0)
        {
            System.out.print("this number "+num+" is even , thank you");
        }
        else{
            System.out.print("this number "+num+" is odd , thank you ");
        } 
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        find_q1 obj1 = new find_q1();
        System.out.print("enter the number to check weather it is ever or odd :-");
        int num = scan.nextInt();
        System.out.print("\r");
        obj1.evenorodd(num);
    }
}

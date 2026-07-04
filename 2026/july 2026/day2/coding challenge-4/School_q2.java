import java.util.Scanner;
public class School_q2 {
    String passorfail(double num)
    {
        if(num<35)
        {
           return "fail";   
        }
        else if(num>35)
        {
            return "pass";
        }
        else{
            return "just pass";
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter marks for checking fail or pass :-");
        double num = scan.nextDouble();
        System.out.print("\r");
        School_q2 obj = new School_q2();
        System.out.print("you are "+obj.passorfail(num)+" in this subjuct ");

    }
}

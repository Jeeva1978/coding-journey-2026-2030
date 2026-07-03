import java.util.Scanner;
class q4{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.println("enter the salary and age for backgound verification :-");
        System.out.print("Salary :-");
        int salary = j.nextInt();
        System.out.print("\r");
        System.out.print("Age :-");
        int age = j.nextInt();
        System.out.print("\r");
        if(salary>=20000 || age<=25)
        {
            System.out.print("tell the required loan amount :-");
            int loan = j.nextInt();
            if(loan<=50000)
            {
                System.out.print("eligible for the loan");
            }
            else{
                System.out.print("maximum loan amount");
            }
        }
        else{
            System.out.print("you are not eligible for the loan");
        }
    }
}
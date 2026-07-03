import java.util.Scanner;
class q2{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("Tell the income of you :-");
        int Income = j.nextInt();
        System.out.print("\r");
        if(Income>7000)
        {
            System.out.print("Scholarship is available for your Income");

        }
        else{
            System.out.print("Not eligible for the scholarship for this Income");

        }
    }
}
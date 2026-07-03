import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("give the number to check whether the number is divisible by the 3 and 5 :- ");
        int num = j.nextInt();
        System.out.print("\r");
        
        if(num%3==0 && num%5==0)
        {
            System.out.print("the number is divisible by the 3 and 5");

        }
        else{
            System.out.print("the number is not divisible by 3 and 5");
        }

    }
}
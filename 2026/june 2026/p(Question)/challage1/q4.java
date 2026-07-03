import java.util.Scanner;
class q4{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("give the number to check whether it is even or odd :-");
        int num = j.nextInt();
        System.out.print("\r");
        if(num%2==0)
        {
            System.out.print("it is even");
        }
        else{
            System.out.print("it is odd");
        }
    }
}
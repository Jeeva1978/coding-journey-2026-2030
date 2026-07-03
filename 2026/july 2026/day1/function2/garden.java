import java.util.Scanner;
public class garden{
    int apple_price=0;
    int apple_count=0;
    void total_money()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("how much price for single apple:- ");
        apple_price= scan.nextInt();
        System.out.print("\r");
        System.out.print("how many apple you buyed :- ");
        apple_count=scan.nextInt();
        System.out.print("\r");
        System.out.print("this is the total money for the apple you buyed :- ");
        System.out.println(apple_price*apple_count);
        total_money();
    }
    public static void main(String args[])
    {
        garden gar = new garden();
        gar.total_money();
    }
}
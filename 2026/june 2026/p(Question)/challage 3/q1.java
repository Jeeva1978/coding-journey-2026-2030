import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.println("enter the a :-");
        int a = j.nextInt();
        System.out.println("enter the b :-");
        int b = j.nextInt();
        for(int i=a;i<b+1;i=i+1)
        {
            System.out.println(i);
        }
    }
}
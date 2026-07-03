import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
        System.out.print(" table where to stop tell a number:-");
        Scanner j = new Scanner(System.in);
        int a = j.nextInt();
        System.out.print("\r");
        System.out.print("which table you want :-");
        int b = j.nextInt();
        System.out.print("\r");
        for(int i=1;i<=a;i=i+1)
        {
            System.out.println(b+" X "+i+" = "+i*b);
        }
        System.out.print("this the "+b+" table ");
        
    }
    
}
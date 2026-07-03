import java.util.Scanner;

class demo1{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER1 :-");
        int num1 = j.nextInt();
        System.out.println("");
        System.out.print("ENTER THE NUMBER2 :-");
        int num2 = j.nextInt();
        if(num1==num2)
        {
            System.out.println("Both the numbera are equal");
        }
        else{
             System.out.print(" numbers are not equal");
        }
    }
}
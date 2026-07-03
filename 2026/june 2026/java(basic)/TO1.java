import java.util.Scanner;
class TO1{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("num1:-");
        int num1 = j.nextInt();
        System.out.print("\r");
        System.out.print("num2 :-");
        int num2 = j.nextInt();
        System.out.print("\r");
        String a = num1>num2?"num1 this greater than num2":"num2 this greater than num1 or in rare case it may equal";
        System.out.print(a);

    }

}
import java.util.Scanner;
class dowhilr{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("enter the number <10");
            count=j.nextInt();
        }while(count<10);
    }
}
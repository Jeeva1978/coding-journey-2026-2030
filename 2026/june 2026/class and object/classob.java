import java.util.Scanner;
public class classob{
    int mem_no =0;
    String name = "";
    int age =0;
    

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        classob gym1 = new classob();
        System.out.print("enter the memberid");
        gym1.mem_no = scan.nextInt();
        System.out.print("\r");
        System.out.print("enter the name");
        scan.nextLine();
        gym1.name=scan.nextLine();
        System.out.print("\r");
        System.out.print("enter the age ");
        gym1.age=scan.nextInt();
        System.out.print("\r");


    }
}
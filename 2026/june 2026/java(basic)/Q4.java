import java.util.Scanner;
class Q4{
    public static void main(String args[])
    {
        Scanner j=new Scanner(System.in);
        String Name=j.nextLine();
        double Score=j.nextInt();
        j.nextLine();
        String Department=j.nextLine();
        System.out.println("this is the first letter of the name "+Name.charAt(0));
        System.out.print("My name is "+Name+"\r\n");
        System.out.println("My score is "+ Score/10);
        System.out.print("My department is "+Department+"\r\n");

    }
}
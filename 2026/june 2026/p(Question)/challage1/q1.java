import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);
        System.out.print("tell the mark:-");
        int Mark = n.nextInt();
        System.out.print("\r");
        if(Mark >= 35)
        {
            System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
    }
}
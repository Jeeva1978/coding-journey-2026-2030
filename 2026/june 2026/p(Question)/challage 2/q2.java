import java.util.Scanner;
class q2{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.println("give the 5 subject marks :-");
        System.out.print("Subject 1 :-");
        int sub1 = j.nextInt();
        System.out.print("\r");
        System.out.print("Subject 2 :-");
        int sub2 = j.nextInt();
        System.out.print("\r");
        System.out.print("Subject 3 :-");
        int sub3 = j.nextInt();
        System.out.print("\r");
        System.out.print("Subject 4 :-");
        int sub4 = j.nextInt();
        System.out.print("\r");
        System.out.print("Subject 5 :-");
        int sub5 = j.nextInt();
        System.out.print("\r");
        int n = sub1+sub2+sub3+sub4+sub5;
        int avg = n/5;
        if(avg<35)
        {
            System.out.print("Additional class is required ");

        }
        else{
            System.out.print("You are good to go");
        }
    }
}
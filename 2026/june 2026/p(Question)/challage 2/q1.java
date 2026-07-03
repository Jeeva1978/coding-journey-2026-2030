import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("What is the score in a game :-");
        int score = j.nextInt();
        System.out.print("\r");
        if(score < 50)
        {
            System.out.print("You need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.print("good Job !");
        }
        else{
            System.out.print("Excellent performance !");
        }
    }
}
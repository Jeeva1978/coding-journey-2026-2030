import java.util.Scanner;
class q5{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("Score :-");
        int score = j.nextInt();
        System.out.print("\r");
        if(score>=35 && score<60)
        {
            System.out.print("i will buy video game");
        }
        else{
            if(score>=60 && score<90)
            {
                System.out.print("i will buy iphone");
            }
            else{
                if(score>=90)
                {
                   System.out.print("i will buy Macbook pro "); 
                }
            }
        }

    }
}
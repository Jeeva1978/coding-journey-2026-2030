import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("today raining or not, tell(True/false):-");
        boolean R = j.nextBoolean();
        if(R)
        {
            System.out.println("take the umbrella");
        }
        else{
            System.out.println("enjoy the sunlight");
        }
        System.out.print('f');
    }
}
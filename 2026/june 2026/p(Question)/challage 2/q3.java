import java.util.Scanner;
class q3{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.println("What is the colour of the traffic light ?");
        String light = j.nextLine();
        System.out.print("\r");
        if(light.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(light.equals("yellow"))
        {
            System.out.print("Get Ready");
        }
        else if(light.equals("green"))
        {
            System.out.print("Go");
        }
        else{
            System.out.print("ERROR(only small letter and only red/yellow/green) ");

        }
    }
}
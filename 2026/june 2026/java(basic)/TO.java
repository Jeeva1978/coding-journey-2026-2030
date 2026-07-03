import java.util.Scanner;
class TO{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.println("today rain are not(yes/no) ");
        String a = j.nextLine();
        System.out.print(a.equals("yes")?"do the home work 25*63 :-"+25*63:"go to school ");


    }
}
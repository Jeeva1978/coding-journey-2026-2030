import java.util.Scanner;

public class method_overloading {
    static void pan_card(String name, int age, String sign)
    {
        System.out.println("addard card of this name:- "+name);
        System.out.println("in addard card age should match:- "+age);
        System.out.println("your sign of form 93:- "+sign);
        System.out.println(" you will get your pan card pancard");
    }
    static void pan_card(String name, int age ,String sign, String fsign, int fage , String fname)
    {
         System.out.println("addard card of this name:- "+name);
         System.out.println("in addard card age should match:- "+age);
         System.out.println("your under age so minor");
         System.out.println("addard card of this name (father name):- "+fname);
         System.out.println("your father sign of form 93:- "+fsign);
         System.out.println("your sign of form 93:- "+sign);
         System.out.println("your father age should match with aadure card:- "+fage);
         System.out.println("you will get your minor pan card ");
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("PAN CARD  detail site ");
        System.out.println("enter the detail :-");
        System.out.println("enter your name :-");
        String name = scan.nextLine();
        System.out.println();
        System.out.println("enter your age :-");
        int age = scan.nextInt();
        System.out.println();
        System.out.println("enter your sign form :-");
        scan.nextLine();
        String sign = scan.nextLine();
        System.out.println();
        System.out.println("enter the father name :-");
        String fname = scan.nextLine();
        System.out.println();
        System.out.println("enter your father age :-");
        int fage = scan.nextInt();
        System.out.println();
        System.out.println("enter your father sign form :-");
        scan.nextLine();
        String fsign = scan.nextLine();
        System.out.println();
        if(age>=18)
        {
            pan_card(name,age,sign);
        }
        else{
            pan_card(name,age,sign,fsign,fage,fname);
        }

    }
    
}

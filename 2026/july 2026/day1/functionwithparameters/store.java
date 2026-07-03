import java.util.Scanner;
public class store{
    void choco(int money)
    {
        Scanner scan = new Scanner(System.in);
        if(money==30)
        {
            System.out.println(money);
            System.out.println("choco purchased");
        }
        else if (money<30){
            int a=30-money;
            System.out.println("you want to give the balance of "+a);
            System.out.print("give the balance "+a+" please :- ");
            int bal = scan.nextInt();
            System.out.print("\r");
            while (bal < a) {
                System.out.print("give the balance "+(a-bal)+" please :- ");
                int e = scan.nextInt();
                bal += e;
            }
            if (bal > a) {
                System.out.println("choco purchased");
                System.out.println("take the change := "+(bal-a));
            }
            else{
                System.out.println("choco purchased");
            }
        }
        else{
            System.out.println(30);
            System.out.println("choco purchased");
            System.out.print("take the change := "+(money-30));
        }
    }
    void power(int money)
    {
        Scanner scan = new Scanner(System.in);
        if(money==50)
        {
            System.out.println(money);
            System.out.println("power purchased");
        }
        else if(money<50){
            int a=50-money;
            System.out.println("you want to give the balance of "+a);
            System.out.print("give the balance "+a+" please :- ");
            int bal = scan.nextInt();
            System.out.print("\r");
            while (bal < a) {
                System.out.print("give the balance "+(a-bal)+" please :- ");
                int e = scan.nextInt();
                bal += e;
            }
            if (bal > a) {
                System.out.println("power purchased");
                System.out.println("take the change := "+(bal-a));
            }
            else{
                System.out.println("power purchased");
            }
        }
        else{
            System.out.println(50);
            System.out.println("power purchased");
            System.out.print("take the change := "+(money-50));
        }

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        store st = new store();
        System.out.print("what you want to buy:- ");
        String b= scan.nextLine();
        if (b.equals("choco"))
        {
            System.out.print("give the money (30) :- ");
            int money=scan.nextInt();
            st.choco(money);
        }
        else if(b.equals("power"))
        {
            System.out.print("give the money (50) :- ");
            int money=scan.nextInt();
            st.power(money);
        }
        else{
            System.out.print("try again");
        }
    }
}
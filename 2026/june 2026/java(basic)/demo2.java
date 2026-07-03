import java.util.Scanner;
class demo2{
    public static void main(String args[])
    {
        Scanner j=new Scanner(System.in);
        System.out.print("RCB win or loose:-");
        String RCB=j.nextLine();
        System.out.println();
        if(RCB.equals("win"))
        {
            System.out.println("Ee sala cup Namdhey");

        }
        else{
            if(RCB.equals("loose"))
            {
                System.out.print("cup illa");
            }  
        }

        
    }
}
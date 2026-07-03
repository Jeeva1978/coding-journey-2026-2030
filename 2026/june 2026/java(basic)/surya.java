import java.util.Scanner;
class surya{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        System.out.print("meghana dead or not in the movie:-");
        String meghana = j.nextLine();
        System.out.print("\r");
        if(meghana.equals("dead"))
        {
            System.out.print("Surya meets Ramya");

        }
        else{
            System.out.print("surya weds meghana");
        }
    } 
}
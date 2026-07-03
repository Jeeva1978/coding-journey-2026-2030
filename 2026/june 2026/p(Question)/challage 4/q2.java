import java.util.Scanner;
class q2{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);
        int[] list = new int[10];
        for(int i=0;i<10;i=i+1)
        {
            System.out.print("enter the value for "+(i+1)+" :-");
            list[i]=j.nextInt();
            System.out.print("\r");
        }
        System.out.println("the array is done");
        System.out.print("this the array :- ");
        System.out.print("[");
        for(int i=0;i<10;i=i+1)
        {
            if(i!=9){
                 System.out.print(list[i]);
                 System.out.print(",");
            }
            else{
                System.out.print(list[i]);
            }
        }
        System.out.print("]");
    }
}
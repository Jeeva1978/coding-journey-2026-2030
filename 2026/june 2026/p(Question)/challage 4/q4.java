import java.util.Scanner;
class q4{
    public static void main(String args[] )
    {
        Scanner j = new Scanner(System.in);
        System.out.print("tell the size of the array:-");
        int a = j.nextInt();
        System.out.print("\r");
        int[] list = new int[a];
        for(int i =0;i<a;i=i+1)
        {
            System.out.print("enter the "+(i+1)+" position of the array:- ");
            list[i]=j.nextInt();
            System.out.print("\r");
        }
        System.out.println("array is done !");
        if(a%2==0)
        {
            System.out.println("it is even overall size :-");
            System.out.println("this the middle element in array:-");
            int c = a/2;
            int d = (a/2)+1;
            int[] l1={list[c-1],list[d-1]};
            for(int i = 0 ;i<2;i=i+1)
            {
                System.out.println(l1[i]);
            }
        }
        else{
            System.out.println("it is odd overall size :-");
            System.out.println("this the middle element in array:-");
            int e =(a+1)/2;
            int[] l1={list[e-1]};
            for(int i = 0 ;i<1;i=i+1)
            {
                System.out.println(l1[i]);
            }

        }    
        
    }
}
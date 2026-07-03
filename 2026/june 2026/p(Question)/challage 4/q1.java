import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        int[] nums = new int[5];
        Scanner j = new Scanner(System.in);
        for(int i=1;i<6;i=i+1)
        {
            System.out.print("enter the position "+ i +" value for array :-");
            nums[i-1] = j.nextInt();
            System.out.print("\r");
        }
        System.out.println("this the Array:-");
        System.out.print("[");
        for(int i=0;i<5;i=i+1)
        {
            if(i!=5-1)
            {
              System.out.print(nums[i]);
              System.out.print(",");  
            }
            else{
                System.out.print(nums[i]);
            }
            
        }
        System.out.print("]");
    }
}
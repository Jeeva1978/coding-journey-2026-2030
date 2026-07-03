class q3{
    public static void main(String args[])
    {
        int count=0;
        for(int i = 1;i<=10;i=i+1)
        {
            if(i%2==0)
            {
               count= count+1;
            }
        }
        System.out.print("the count of number of even number from 1 to 10 :- "+count);

    }
}
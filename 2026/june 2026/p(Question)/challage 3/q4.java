class q4{
    public static void main(String args[])
    {
        System.out.println("this all the number which divisible by the 3 and 5 :-");
        for(int i = 1;i<=100;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}
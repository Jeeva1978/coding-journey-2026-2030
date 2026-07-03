class nestloop{
    public static void main(String args[])
    {
        for(int i=1;i<=3;i=i+1)
        {
            for(int j=1;j<=3;j=j+1)
            {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }
}
class string1{
    public static void main(String args[])
    {
        String f1="Apple";
        String f2="Apple";
        String f3=new String("Apple");
        String f4=new String("Apple");
        if(f3.equals(f4))
        {
            System.out.println('t');
        }
        else{
            System.out.println(";;");
        }
    }
}
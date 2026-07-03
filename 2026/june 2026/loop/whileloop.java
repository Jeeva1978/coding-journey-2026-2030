import java.util.Random;
class whileloop{
    public static void main(String args[])
    {
        Random k = new Random(); 
        int newnum = 0;
        while(newnum!=5)
        {
            newnum=k.nextInt(11);
            System.out.println(newnum);
        }
    }
}
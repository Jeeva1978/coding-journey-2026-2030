public class detail{
    String getname()
    {
        String name = "jeevaneshwaran";
        return name;
    }
    long getphone()
    {
        long phone = 9677246382L;
        return phone;
    }
    public static void main(String args[])
    {
        detail obj1 = new detail();
        System.out.println(obj1.getname());
        System.out.println(obj1.getphone());

    }

}
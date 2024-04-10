public class statictest {
    private static int  x;


    /*
     * static code run only once throughout the lifecycle of the class;
     * when first object is initialzied , then it runs only once.
     * Any number of objects can be made after that that it will not run ;
     *
     */

    static
    {
        System.out.println("static code is working :"+ x);
        x=5;
    }

    public statictest()
    {
        System.out.println("constructor code is working :");

    }
    public static void  getstatic()
    {
        System.out.println (x);
    }

    public static void main (String args[])
    {
        statictest s1=new statictest();
        s1.getstatic();
    }
}

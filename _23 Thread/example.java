public class example {


    public static void main (String args[])
    {
        Thread t1=new Thread(new classB());
        Thread t2=new Thread(new A());
        t1.start();
        t2.start();
    }
   
}

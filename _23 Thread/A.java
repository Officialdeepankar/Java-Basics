class A implements Runnable{
    public void run ()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("A"+i);
        }
    }
}
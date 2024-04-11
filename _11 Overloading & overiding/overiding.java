class A{
   

    /*
     * Class " B " overides the function present in "A";
     */
    public void f1(int x)
    {
        System.out.println("Class A: "+x);
    }
}

class B extends A{
    public void f1(int x)
    {
        System.out.println("Class B: "+ x);
    }

}




public class overiding {
    public static void main (String args[])
    {
       B b1=new B();
       b1.f1(19);
    } 
}

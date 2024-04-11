class A{
    /*
     * both the function f1 have same name but different signatures;
     */
    
    public void f1(int x)
    {
        System.out.println(x);
    }
}

class B extends A{
    public void f1(int x,int y )
    {
        System.out.println(x+"and"+y);
    }
}


public class overlaoding{


    public static void main (String args[])
    {
            B b1= new B();
            b1.f1(5);
            b1.f1(7,8);
    }
}
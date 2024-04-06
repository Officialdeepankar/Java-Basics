class Example
{
    private int x;// instance member variable 
    static int y=5;

    static void fun1()
    {
        y=7;// Note static function can only access static member variable
    }

    static class InnerClass
    {
        public static String str="INDIA";
    }
}
/*
  *static can be of 3 type ->1) static member variable
  *                        ->2) static member function 
  *                        -> 3) static member InnerClass 
  * All example are given one by one...
 */




public class MainClass
{
    public static void main (String[]args)
    {
        System.out.println(Example.y);// static  variable accessed
        Example.fun1();// static function accessed
        System.out.println(Example.y);//update value of y by fun1() is accessed;
        System.out.println(Example.InnerClass.str);// static inner class accessed;

    }
}
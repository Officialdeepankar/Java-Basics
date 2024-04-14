public class A {
    static int p;
    static{
          p=5; // we cannnot access this static variable in child class;
    }
    public static  void f1() // i have made a  static function 
    {
     System.out.println("This is static void f1 function ");;
    }
}

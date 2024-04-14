// this is used to refer the object created using new keyword

public class A{
   private  int l, b, h;

    void  boxdimension (int l, int b , int h)
   {
    // l=l, b=b, h=h ----> in this notation the compiler will get confused between local variable and instance variable 
    this.l=l;
    this.b=b;
    this.h=h;
   }

    void getdimension ()
   {
    System.out.println("L="+l+"B="+b+"H="+h);
   }


   public static void main (String args[])
   {
    A obj=new A();
    obj.boxdimension(2, 3, 5);
    obj.getdimension();

   }
}


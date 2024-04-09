public class box
{
    private int l; 
    private int b;
    private int h;
    
    // non parametarized constructor

     public box ()
     {
        l=10; b=12; h= 13;
     }

     // parmeterized constructor

     public box (int len, int bd, int hieght)
     {
        l=len;
        b=bd;
        h=hieght;
     }
    public static void main (String args[])
{
    box b1=new box();
    System.out.println(b1.l);
    box b2=new box(13,24,34);
    System.out.println(b2.b);
     
}
}
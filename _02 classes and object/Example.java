// create a class named as Box , make 3 instance member variable  length , breadth , height, and 2 function .showData() and .setData();



class Box{
    private int length,breadth,height;

    public void showDimension()
    {
        System.out.println("L="+length);
        System.out.println("b="+breadth);
        System.out.println("h="+height);
    }
    public void setDimension(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    static void message()
    {
        System.out.println("This is static!Example ");
    }
}


/**
 * Example
 */
public class Example {

    public static void main (String[]args)
    {
         Box b1=new Box();
         b1.setDimension(5, 6, 7);
         b1.showDimension();

        // static ka use 
        Box.message();
    }
}
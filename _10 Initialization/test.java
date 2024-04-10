public class test
{
    private int x;

    /*
     * Initialization block is a block with no name and when the object formed this block will also run .
     * There can be more than "1" intialization block which are treated as a single block by compiler . 
     * All the code inside intialization block ,will be written at the starting of the consturctor and will run first, after that at last constructor code will run.
     *
     */

{
    System.out.println("Intialization code is running: "+ x);
    x=5;
}

  public test()
  {
    System.out.println("consturctor code is running : "+x);
  }

  public static void main (String args[])
  {
    test t1=new test();
  }
}
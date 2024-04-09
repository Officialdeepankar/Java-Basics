package pack1;
import pack2.student;

/*
 * to make .class file we use command   javac  filename;
 * to make package we use  java -d . filename;
 * to run a .java file we java filename;
 * In this ,we are learning about how to use classes from other packages (pack2) in our class (pack1)
 */
public class example{
    public static void main (String args[])
    {
        pack2.student ritik=new pack2.student();
      ritik.setname("Ritik sir");
      ritik.setRoll(112);
      System.out.println(ritik.getRoll());
      System.out.println(ritik.getname());

    }
}
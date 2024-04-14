public class OTDC {// Our throw default catch 
public static void main(String[] args) {
    // Integer x = Integer.valueOf(5);
    // //int v=x.intValue();
    // System.out.println(x.intValue());


    int balance=3000;
    int withdrawl=5000;
    if (balance<withdrawl)
    {
        throw new  ArithmeticException("Insufficient Balance");// program ends
        //like Arithmetic Exception, the thing written after throw must be a valid throwable class
    }
    System.out.println("This line will not execute , as java default throw is used");
}
}

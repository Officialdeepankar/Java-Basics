public class OTOC {// Our throw our catch 
    public static void main(String[] args) {
        // Integer x = Integer.valueOf(5);
        // //int v=x.intValue();
        // System.out.println(x.intValue());
        int balance=3000;
        int withdrawl=5000;
    try{
        if (balance<withdrawl)
        {
            throw new  ArithmeticException("Insufficient Balance");// program ends
            //like Arithmetic Exception, the thing written after throw must be a valid throwable class
        }
        balance=balance-withdrawl;
        System.out.println("payment succesfull");
    
    
    }catch(ArithmeticException e)
    {
        System.out.println("exception is"+e.getMessage());
    }
        
    System.out.println("program continue");
        
    }
    }

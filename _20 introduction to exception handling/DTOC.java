public class DTOC {// default throw out catch
    

    public static void main(String[] args) {
        
        try{
            System.out.println("Result"+3/0);
            System.out.println("In try");// this line will not exceture , because as soon the error occur the "control" will jump to "catch block"
        }catch(ArithmeticException e)//     ("parameter 1","parameter 2") parmeter 1="type of exception" parmeter-2 "object of that exception"
        {
            System.out.println("Excetpion :"+e.getMessage());// divide by zero keke exception degi 
            
        }

        // this line is putted below, to show that program exection do not end 
        System.out.println("This line is here to show that program exection do not end due to exception");
    }

}

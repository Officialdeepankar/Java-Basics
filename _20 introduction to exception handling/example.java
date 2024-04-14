public class example{
    public static void main(String[] args) {
       System.out.println("first line");
       System.out.println("Result="+ 3/0);// it will give arithmetic exception and "last line " will not excecute. we will come out of the program, 
       // because it is default throw and default catch 
       System.out.println("last line ");
    }
}
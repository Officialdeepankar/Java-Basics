import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=sc.nextInt();//jo value ayi usses int mein conver karke reuturn karns;
        int b=sc.nextInt();

        sc.nextLine();

        
        System.out.println("write something you want to say !");
        String st=sc.nextLine();
        System.out.println("you were saying: "+st);
        System.out.println("The addtion of two number: "+ (a+b));
    }
}
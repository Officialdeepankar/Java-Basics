import java.util.*;
public  class pers {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
         Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();// it can take multiple string as input;
         System.out.println("Name is: "+ name);
        System.out.println("What is the age: ");
         int  age=sc.nextInt();
         System.out.println("Age is :"+age);
         sc.close();
    }
}

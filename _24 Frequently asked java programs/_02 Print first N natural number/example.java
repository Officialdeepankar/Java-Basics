import java.util.Scanner;

public class example 
{
    public static void  main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Write the value of N: ");
          int N=sc.nextInt();

          System.out.println("The first N Natural number are: ");

          for (int i=1 ;i<=N ;i++)
          {
            System.out.println(i);
          }
    }
}
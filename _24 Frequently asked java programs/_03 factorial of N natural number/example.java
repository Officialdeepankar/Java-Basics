import java.util.Scanner;

public class example{


    public int  factorial(int N)
    {
        if (N==0)return 1;
        return N*factorial(N-1);

    }
public static void main(String[] args) {
    System.out.println("write the value of N: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    example ex=new example();
    int ans=ex.factorial(n);
    System.out.println(ans);
}
}
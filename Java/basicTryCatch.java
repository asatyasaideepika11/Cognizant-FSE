import java.io.IOException;
import java.util.Scanner;

public class basicTryCatch {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide them");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res=0;
        try{
            res = n/m;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not possible");
        }
        System.out.println("The result is "+res);
    }
}

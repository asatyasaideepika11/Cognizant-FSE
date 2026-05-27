import java.io.IOException;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial of it");
        int n = sc.nextInt();
        long fact = 1;
        while(n>0)
        {
            fact *= n;
            n--;
        }
        sc.close();
        System.out.println("The factorial is "+fact);
    }
}

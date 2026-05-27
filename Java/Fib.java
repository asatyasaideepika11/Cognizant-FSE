import java.util.Scanner;
import java.io.*;
public class Fib {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the fibonnaci number");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        for(int i =0;i<n;i++)
        {
            int t = f2;
            f2 = f1+f2;
            f1 = t;
        }
        System.out.println(f1);
        sc.close();
    }
}

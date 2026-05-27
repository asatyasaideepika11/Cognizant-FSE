import java.io.IOException;
import java.util.Scanner;

public class Array {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[n];
        int sum = 0;
        for(int i =0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum +=a[i];
        }
        System.out.println("The sum of the array is "+sum+" and the average is "+(sum/(double)n));
    }
}

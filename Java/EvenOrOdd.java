import java.io.IOException;
import java.util.*;
public class EvenOrOdd 
{
    public static void main (String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's odd or even");
        int n = sc.nextInt();
        System.out.println(((n&1)==0)?"Even":"Odd");
        sc.close();
    }    
}

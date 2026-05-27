import java.io.*;
import java.util.*;
public class Palindrome {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's palindrome");
        String s = sc.next();
        int n = s.length();
        int flag =0;
        for(int i =0;i<n/2;i++)
        {
            char f = s.charAt(i);
            char l = s.charAt(n-i-1);
            if(l!=f)
            {
                flag = 1;
                break;
            }
        }
        if(flag ==0)
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

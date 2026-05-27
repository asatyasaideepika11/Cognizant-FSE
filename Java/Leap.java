import java.io.*;
import java.util.*;
public class Leap 
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year to check if it's a leap year");
        int y = sc.nextInt();
        int flag = 0;
        if((y%4==0 && y%100 !=0) || (y%400==0))
            {
                flag = 1;
            }
        if(flag==1)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }

}

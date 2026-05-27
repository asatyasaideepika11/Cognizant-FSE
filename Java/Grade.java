import java.io.IOException;
import java.util.*;
public class Grade {
    public static void main(String args[])throws IOException

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int n = sc.nextInt();
        char gr = 'N';
        if(n>=90)
        {
            gr = 'A';
        }
        else if(n<=89 && n>=80)
        {
            gr = 'B';
        }
        else if(n<=79 && n>=70)
        {
            gr = 'C';
        }
        else if(n<=69 && n>=60)
        {
            gr = 'D';
        }
        else 
        {
            gr = 'F';
        }
        System.out.println("The assigned grade for the given marks is "+gr);
        sc.close();
    }
}

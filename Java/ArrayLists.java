import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayLists {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("How many no.of students?");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter student name");
            String s1 = sc.next();
            a.add(s1);
        }
        System.out.println("The entered student names are:");
        for(String s:a)
        {
            System.out.println(s);
        }
    }
}

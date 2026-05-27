import java.io.IOException;
import java.util.*;
public class Strings {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}

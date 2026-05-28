import java.util.ArrayList;
import java.util.Collections;

public class lambdaSort
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sheela");
        al.add("Leela");
        al.add("Kamala");
        al.add("Laila");
        al.add("Amala");

        System.out.println("Elements before sorting: " + al);
        Collections.sort(al, (o1, o2) -> o1.compareTo(o2));
        System.out.println("Elements after sorting: " + al);
    }
}
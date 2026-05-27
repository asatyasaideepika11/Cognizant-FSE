import java .io.*;
import java.util.*;
public class TypeCast 
{
    public static void main(String args[])throws IOException
    {
        int n = 10;
        double d = 10.67;
        System.out.println("Before Casting");
        System.out.println("Integer: "+n);
        System.out.println("Double: "+d);
        System.out.println("After Casting");
        System.out.println("Double to Integer: "+(int)d);
        System.out.println("Integer to Double: "+(double)n);
    }    
}

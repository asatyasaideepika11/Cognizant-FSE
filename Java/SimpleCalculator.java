import java.io.*;
import java .util.*;

public class SimpleCalculator 
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select an operation: \n1)Add(+)\n2)Subtract(-)\n3)Multiply(*)\n4)Divide(/)\nSelect a number from the above options");
        int op = sc.nextInt();
        int res;
        switch(op){
        case 1:res = a+b;
        break;
        case 2:res = a-b;
        break;
        case 3:res = a*b;
        break;
        case 4:res = a/b;
        break;
        default: res =0;
        break;
        }
        System.out.println("The result is "+res);
        sc.close();
    }
}

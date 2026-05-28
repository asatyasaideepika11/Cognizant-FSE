import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String m)
    {
        super(m);
    }
}
public class customException {
    public static void check(int n)throws InvalidAgeException
    {
        if(n<18)
        {
            throw new InvalidAgeException("Age below 18 is not allowed");
        }
        System.out.println("The age: "+n);
    }    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int n = sc.nextInt();
        try
        {
            check(n);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }

    }
}

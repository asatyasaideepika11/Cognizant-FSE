import java.io.IOException;
public class OperatorPrecedence
{
    public static void main(String args[])throws IOException
    {
        System.out.println("3+5*8-10/2+(2*3)");
        System.out.println("Result of above expression: "+(3+5*8-10/2+(2*3)));
        System.out.println("Java follows BODMAS rule and always evaluates the operators from left to right if they have the same precedence");

    }
}
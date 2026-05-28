import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWrite {
    public static void  main(String args[])throws IOException
    {
        try
    {
        FileWriter fw = new FileWriter("output.txt");
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Successfully Written");
        fw.write(s);
        sc.close();
        fw.close();
    }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

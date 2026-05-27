
import java.io.*;
import java.util.*;
public class Game {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        int n = sc.nextInt();
        Random r = new Random();
        int ans = r.nextInt(100);
        while(n!=ans)       
        {       
            if(n>ans)
                {
                    System.out.println("You are close. The number is lower than you guessed");
                }
                else 
                {
                    System.out.println("You are close. The number is higher than you guessed ");
                }
                n = sc.nextInt();
        }
        if(n==ans)
                    {
                        System.out.println("Wohoooo! You guessed it right");
                    }
    }
}

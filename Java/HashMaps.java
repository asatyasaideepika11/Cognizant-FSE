import java.util.HashMap;
import java.util.Scanner;

public class HashMaps
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println("How many students?");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter Student ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name:");
            String name = sc.nextLine();
            hm.put(id, name);
        }
        System.out.println("Enter ID to search:");
        int sId = sc.nextInt();
        if(hm.containsKey(sId))
        {
            System.out.println("Student Name: " + hm.get(sId));
        }
        else
        {
            System.out.println("ID not found");
        }
        sc.close();
    }
}
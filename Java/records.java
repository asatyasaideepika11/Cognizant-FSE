import java.io.IOException;
import java.util.ArrayList;

record Person(String name,int age){}
public class records {
	public static void main(String args[])throws IOException
    {
            ArrayList<Person> p = new ArrayList<>();
            p.add(new Person("Joseph",38));
            p.add(new Person("Armaan",32));
            p.add(new Person("Kalyan",28));
            p.add(new Person("Kashyap",18));
            p.add(new Person("Nithish",24));
            p.add(new Person("Justin",36));
            System.out.println("Before filtering");
            p.forEach(n -> System.out.println(n));
            System.out.println("After filtering");
            p.stream()
                        .filter(n -> n.age()>30)
                        .forEach(n ->System.out.println(n));
        }
}

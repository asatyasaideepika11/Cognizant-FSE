import java.util.Arrays;
import java.util.List;

public class streamAPI {
    public static void main(String args[])
    {
        List<Integer> a = Arrays.asList(8,9,10,2,3,4,6,32);
        a.stream()
                    .filter(n -> n%2==0)
                    .sorted()
                    .forEach(n ->System.out.println(n));      
    }
}

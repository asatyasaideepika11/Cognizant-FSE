import java.io.IOException;

interface Playable {
    void play();   
}
class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Guitar");
    }
}
class Piano implements Playable
{
    public void play()
    {
        System.out.println("Piano");
    }
}
public class INTERFACE {
    public static void main(String args[])throws IOException
    {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play();
        p.play();
    }
}

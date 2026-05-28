class threadCreate extends Thread
{
    public void run()
    {
        System.out.println("Hello , I am first thread");
        System.out.println("Hello , I am first thread");
        System.out.println("Hello , I am first thread");
        System.out.println("Hello , I am first thread");
        System.out.println("Hello , I am first thread");
    }
}
class Thread2 implements Runnable
{
    public void run()
    {
        System.out.println("Hello I am thread 2");
        System.out.println("Hello I am thread 2");
        System.out.println("Hello I am thread 2");
        System.out.println("Hello I am thread 2");
        System.out.println("Hello I am thread 2");
    }
}
public class threads {
    public static void main(String args[])
    {
        threadCreate t1 = new threadCreate();
        t1.start();
        Thread2 g2 = new Thread2();
        Thread t2 = new Thread(g2);
        t2.start();
    }
    
}

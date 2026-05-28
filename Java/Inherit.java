import java.io.IOException;
class Animal
{
    void makeSound()
    {
        System.out.println("Various sounds");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Bark");
    }
}
public class Inherit {
    public static void main(String args[])throws IOException
    {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}

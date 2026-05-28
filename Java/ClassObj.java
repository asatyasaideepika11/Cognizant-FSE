import java.io.IOException;
class Car{
    String make ;
    String model;
    int year;


    void displayDetails()
    {
        System.out.println("Make: "+make+"\nModel: "+model+"\nYear: "+year);        
    }
}
public class ClassObj {
    public static void main (String args[])throws IOException  
    {
        Car c = new Car();
        c.make = "Toyota";
        c.model = "Fortuner";
        c.year = 2000;
        c.displayDetails();
    }  

}

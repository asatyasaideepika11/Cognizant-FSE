import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample
{
    public static void main(String args[])
    {
        try
        {
            // Load JDBC Driver
            Class.forName("org.sqlite.JDBC");

            // Create Connection
            Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Print Results
            while(rs.next())
            {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            // Close connection
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
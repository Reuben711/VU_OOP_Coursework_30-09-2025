// Database connection logic

package vu.exhibitionsystem;

// Importing required java sql classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// THis class connects to MS Access Database
public class DBConnection {
    public static final String URL = "jdbc:ucanaccess://C:/Java/VUE_Exhibition.accdb"; // The path points to the .accdb file location
    public static Connection getConnection() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Load UCanAccess driver into memory
            Connection conn = DriverManager.getConnection(URL); // Connect to the database
            System.out.println("Database connected sucessfully!"); //Print on console for dubegging purpose
            return conn; // Return database connection to use by other classes
            
        } catch (ClassNotFoundException e) {
            System.out.println("UCannAccess Driver not found");
        } catch (SQLException e) {
            System.out.println("Database connection failed");
        }
        return null; // FIf connection has failed, return null
    }
}

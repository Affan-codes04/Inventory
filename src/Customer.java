import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Customer extends JFrame {
    String Driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "affan";
    String Password = "Smriti";
    public Customer() throws ClassNotFoundException, SQLException {
    }
}

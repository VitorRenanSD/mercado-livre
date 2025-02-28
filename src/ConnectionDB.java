import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    
    public Connection getConnection() {
        Connection  connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MercadoFake",
                    "postgres", "password");
        } catch (SQLException e) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }
}



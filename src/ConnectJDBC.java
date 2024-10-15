import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "product";
    private String username = "root";
    private String password = "13122005";

    private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("kết nối thành công");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        connectJDBC.connect();
    }
}
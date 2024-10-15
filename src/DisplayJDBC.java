import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayJDBC {

    public void display (ConnectJDBC connectJDBC){

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from laptop";
        try {
            con = connectJDBC.connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String ram = rs.getString("ram");
                String ssd = rs.getString("ssd");
                String chip = rs.getString("chip");
                int price = rs.getInt("price");
                boolean status = rs.getBoolean("status");
                System.out.println("id: " + id + " " + "name: " + name + " " + "ram: " + ram + " "+ "ssd: " + ssd + " " + "chip: " + chip + " " + "price: " + price + " " + "status: " + status);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

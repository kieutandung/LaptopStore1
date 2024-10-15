import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddJDBC {
    public void add (ConnectJDBC connectJDBC){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "insert into laptop (name,ram,ssd,chip,price,status) values(?,?,?,?,?,?)";
        try{
            con = connectJDBC.connect();
            ps = con.prepareStatement(sql);
            ps.setString(1,"macbook");
            ps.setString(2,"32g");
            ps.setString(3,"1024g");
            ps.setString(4,"m2 512gm");
            ps.setInt(5,200000000);
            ps.setBoolean(6,true);
            ps.executeUpdate();
            System.out.println("thêm thành công");
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

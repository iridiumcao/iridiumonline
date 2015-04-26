package info.iridiumcao.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBinaryFileTest {

    public static void main(String[] args) {
        try {
            insertBinaryFile();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void insertBinaryFile() throws SQLException, IOException {

        File file = new File("D:\\temp\\Assignment_2.pdf");
        FileInputStream fis = new FileInputStream(file);
        Connection conn = DbTools.getConn();
        PreparedStatement ps = conn
                .prepareStatement("insert into chatroom.images values (?,?)");

        ps.setBinaryStream(1, fis, (int) file.length());
        ps.setString(2, file.getName());
        ps.executeUpdate();
        ps.close();
        fis.close();

    }

}

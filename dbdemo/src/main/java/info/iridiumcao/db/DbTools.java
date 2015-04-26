package info.iridiumcao.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbTools {
    private static final Logger logger = LoggerFactory.getLogger(DbTools.class);

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1:3306/chatroom?"
                            + "user=chatroom&password=chatroom");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/chatroom", "chatroom",
                    "chatroom");
        } catch (ClassNotFoundException e) {
            logger.debug(e.toString());
        } catch (SQLException e) {
            logger.debug(e.toString());
        }
        return conn;
    }

    public static Connection getConnByPool() {
        Connection conn = null;
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/cyMysql");
            conn = ds.getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
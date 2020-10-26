package DbTest;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginModel {
    Connection connection;

    public LoginModel() {
        connection = SqliteConnection.connector();
        if (connection == null) {
            System.out.println("Unable to connect");
            System.exit(1);
        }
    }
    public boolean isDbConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
}

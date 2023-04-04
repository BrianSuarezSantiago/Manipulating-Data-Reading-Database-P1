package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;
/**
 * Class responsible for inserting data into the
 * specified database table of a local database.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html">Package java.sql</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java JDBC API</a>
 */
public class InsertDataTable {

    /**
     * Establishes a connection to a local database from
     * a specified URL. If the connection establishment
     * fails, it is reported through an error, otherwise,
     * it displays a message informing about it.
     *
     * @return Connection to the database.
     */
    private Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            System.out.println("A connection has been created!");
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }

    /**
     * Inserts the e-mail addresses into the specified
     * table. In case the insertion of the data cannot
     * be performed, an informative error message is
     * displayed if not, it inserts the data and closes
     * the connection to the database.
     *
     * @param emailList E-mail address to be counted.
     */
    public void insert(List<String> emailList) {
        String sql = "INSERT INTO Emails(Address) VALUES(?)";

        try {
            Connection connection = this.connect();
            PreparedStatement pstmt = connection.prepareStatement(sql);

            for(String email: emailList) {
                pstmt.setString(1, email);
                pstmt.executeUpdate();
            }
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
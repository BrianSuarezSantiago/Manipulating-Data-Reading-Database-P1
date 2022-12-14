package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Class responsible for establishing a connection to
 * the database named Kata5 through the file Kata5.db
 * as well as performing a query to the database table.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html">Package java.sql</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java JDBC API</a>
 */
public class Query {

    /**
     * Establishes a connection to a local database from
     * a specified URL. If the connection establishment
     * fails, it is reported through an error, otherwise,
     * it displays a message informing about it.
     *
     * @return Connection established with the database.
     */
    private Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }

    /**
     * Returns all rows and all columns from the Emails
     * table obtaining thus, all the data contains in it.
     */
    public void selectAll() {
        Connection connection = this.connect();

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM Emails;");

            while(result.next()) {
                System.out.println(result.getInt("Id") + "\t" +
                                  result.getString("Address") + "\t");
            }
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
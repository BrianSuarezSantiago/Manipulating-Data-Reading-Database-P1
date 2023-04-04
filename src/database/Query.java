package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 * Class responsible for establishing a connection to
 * the database named Kata5 through the file Kata5.db
 * as well as performing a query to the database table.
 *
 * @author Brian Suárez Santiago
 * @version 1.0.0
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
            System.out.println("A connection has been created!");
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }

    /**
     * Returns all rows and all columns from the People
     * table obtaining thus, all the data contains in it.
     */
    public void selectAll() {
        Connection connection = this.connect();

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM People;");

            while(result.next()) {
                System.out.println(result.getInt("Id") + "\t" +
                                  result.getString("Name") + "\t" +
                                  result.getString("Surname") + "\t" +
                                  result.getString("Role"));
            }
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
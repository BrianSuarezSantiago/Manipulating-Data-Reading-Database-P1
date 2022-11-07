package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
/**
 * Class representing a database table. The class has the
 * necessary public method to create all new local table
 * in a local database specified by an URL using the JDBC
 * driver provided by SQLite.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html">Package java.sql</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java JDBC API</a>
 */
public class CreateTable {

    /**
     * Creates a new table into which the data will
     * be inserted, in the database specified by URL.
     *
     * Rename "Emails" to "People" if you want to create
     * the People table and the "Address" column name to
     * "Name" to create the specific column of the People
     * table.
     */
    public void createNewTable() {
        String url = "jdbc:sqlite:Kata5.db";

        String sql = "CREATE TABLE IF NOT EXISTS Emails (\n"
                   + " Id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                   + " Address TEXT NOT NULL);";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Table created successfully!");
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
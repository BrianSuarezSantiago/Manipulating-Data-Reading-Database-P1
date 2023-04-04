package database;

/**
 * Class that initializes an object of type Query
 * and performs a query of the information stored
 * in the database.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 */
public class Main {

    public static void main(String[] args) {
        CreateTable table = new CreateTable();
        table.createNewTable();

        Query app = new Query();
        app.selectAll();
    }
}
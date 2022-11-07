package database;

import java.util.List;
import java.io.IOException;
/**
 * Class responsible for reading from a plain text
 * file different email domains, inserting them in
 * the corresponding database table and performing
 * a query of all those email domains that are valid
 * according to a previously established pattern.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html">Class IOException</a>
 */
public class Main {

    public static void main(String[] args) throws IOException {
        List<String> mailList;
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);

        InsertDataTable insertData = new InsertDataTable();
        insertData.insert(mailList);

        System.out.println("Loading data, please wait...");
        System.out.println("List of valid email addresses:");

        Query query = new Query();
        query.selectAll();
    }
}
package database;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Class responsible for reading the data from a local
 * database by using a specified URL and creating and
 * displaying a simple table with an ID and the Address
 * of valid e-mail domains.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Interface List</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html">Class BufferedReader</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html">Class FileReader</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html">Class File</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html">Class IOException</a>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html">Package java.io</a>
 */
public class MailListReader {

    /**
     * Checks if a certain string of text passed as argument
     * corresponds with a valid e-mail address or not.
     *
     * @param line String text line.
     * @return True if the line of text passed as
     * argument corresponds to an e-mail address
     * or false otherwise.
     */
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }

    /**
     * Reads a text file where the domains of e-mail
     * and returns the list of those valid domains.
     *
     * @param fileName Data file name.
     * @return List of valid e-mail domains.
     * @throws IOException
     */
    public static List<String> read(String fileName) throws IOException {
        List<String> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

            while(true) {
                String line = reader.readLine();

                if(line == null) break;

                if(MailListReader.isMail(line)) {
                    list.add(line);
                }
            }
        } catch(FileNotFoundException exception) {
            System.out.println("Error MailListReader::read (FileNotFoundException)" + exception.getMessage());
        } catch(IOException exception) {
            System.out.println("Error MailListReader::read (IOException)" + exception.getMessage());
        }
        return list;
    }
}
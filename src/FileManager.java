import java.util.*;
import java.io.*;
public class FileManager {
private  static  final String FILE_NAME ="transactions.txt";

    public void saveTransactions(ArrayList<Transaction> transactions) {

        try {

            FileWriter writer = new FileWriter(FILE_NAME);

            for (Transaction t : transactions) {

                writer.write("ID: " + t.getId() + "\n");
                writer.write("Amount: " + t.getAmount() + "\n");
                writer.write("Date: " + t.getDate() + "\n");
                writer.write("Description: " + t.getDescription() + "\n");
                writer.write("----------------------\n");

            }

            writer.close();
            System.out.println("Transactions saved successfully.");

        } catch (Exception e) {

            System.out.println("Error saving file.");
        }
    }
}

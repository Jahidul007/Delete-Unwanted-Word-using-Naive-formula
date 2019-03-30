// Efficient Java program to perform file
// operation output = input-delete

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FileOperation {
    public static void main(String[] args) throws IOException {

        try {
            // file input
            File file = new File("book.txt");
            String charset = "UTF-8";
            String[] delete = {"boost ", "PREPAID ", "AT&T "};

            // ArrayList for storing lines of delete.txt
            ArrayList<String> ar = new ArrayList<String>();

            // BufferedReader object for delete.txt
            BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));

            String line2 = br2.readLine();

            // loop for each line of delete.txt and add to arrayList
            while (line2 != null) {
                System.out.println(line2);
                ar.add(line2);
                line2 = br2.readLine();
                System.out.println(ar);
            }
            System.out.println(ar.get(0) + ar.get(1));
            // BufferedReader object for input.txt
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));

            PrintWriter writer = new PrintWriter("output.txt");

            for (String line; (line = reader.readLine()) != null; ) {
                for (int i = 0; i < ar.size(); i++)
                    line = line.replaceAll("(?i)" + Pattern.quote(ar.get(i)), "");

                writer.println(line);
            }
            br2.close();
            reader.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
    }
}
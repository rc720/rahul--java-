package q25;

import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        try {
  
            File file = new File("demo.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, Java File Handling!\n");
            writer.write("This is line 2.");
            writer.close();
            System.out.println("Data written to file.");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("--- File Contents ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            // Step 4: Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File not deleted.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
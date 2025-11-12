import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Creating a file 

        File f1 = new File("C:\\Users\\junaid\\Desktop\\f1.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            // How to write in a file 

            FileWriter writer = new FileWriter(f1);
            writer.write("This is the file created through java\n");
            writer.close();

            Scanner reader = new Scanner(f1);
            // System.out.println(reader.hasNextLine()); // it return boolean value to tell that a file is having a nextline or not.

            String data = reader.nextLine(); // reaturn a single line from a file.
            System.out.println(data);

            reader.close();
        } catch (IOException err){
            System.out.println(err);
        }
    }
}

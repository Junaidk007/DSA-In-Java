import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\junaid\\Desktop\\file.txt");

        try {
            if(f1.createNewFile()){
                System.out.println("File created successfully");
            } else {
                System.out.println("file already exits");
            }

            FileWriter w = new FileWriter(f1);

            w.write("Hello this is my first file created using java.");
            w.close();

            Scanner sc = new Scanner(f1);

            String line = sc.nextLine();

            System.out.println(line);
            sc.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(f1);
    }
}


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("C:\\Users\\junaid\\Desktop\\file.txt");
        FileOutputStream f2 = new FileOutputStream("C:\\Users\\junaid\\Desktop\\file.txt");

        f2.write("hello bipendara".getBytes());

        int i;

        while((i = f1.read()) != -1) {
            // f2.write("hello bipendra".getBytes());
            System.out.print((char) i);
        }

        f1.close();
        f2.close();
    }
}
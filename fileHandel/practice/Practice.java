
import java.io.*;


public class Practice {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\junaid\\Desktop\\newFile.txt");
        FileInputStream fin = new FileInputStream("C:\\Users\\junaid\\Desktop\\newFile.txt");
        String data = "Hello, this file is created by me.";
        byte[] b = data.getBytes();
        
        fout.write(b);
        fout.close();

        int data1;

        while((data1 = fin.read()) != -1) {
            System.out.print((char) data1);
        }
    }
}

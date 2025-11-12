import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int sum = a/b;
            System.out.println("Result: "+sum);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
            System.out.println("Scanner class closed");
        }
    }
} 
import java.util.Scanner;

class LoginFaildException extends Exception {
    LoginFaildException(String msg) {
        super(msg);
    } 
}

public class UserDefineHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username");
        String name = sc.nextLine();
        System.out.println("Password");
        String pass = sc.nextLine();
        try {
            if((!name.equals("admin")) && (!pass.equals("admin@123"))) {
                throw new LoginFaildException("Invalid credentials");
            } else {
                System.out.println("Welcome, "+name);
            }
        } catch(LoginFaildException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner class closed");
        }
    }
}

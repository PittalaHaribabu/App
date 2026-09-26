import java.util.Scanner;
class login {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        String vu = "haribabu";
        String vp = "hari137";
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if (vu.equals(username)) {
            if (vp.equals(password)) {
                System.out.println("Login successful. Welcome, " + username + "!");
            } else {
                System.out.println("Invalid password.");
            }
        } else {
            System.out.println("Invalid username.");
            System.out.println("Please enter a valid username and password.");
        }

        sc.close();
    }
}

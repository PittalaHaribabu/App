import java.util.Scanner;

public class Resume {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = sc.nextLine();
        System.out.println("Enter your education: ");
        String education = sc.nextLine();
        System.out.println("Enter your work experience: ");
        String workExperience = sc.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("*****************Resume:*************");
        System.out.println("Name: " + name);    
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Education: " + education);
        System.out.println("Work Experience: " + workExperience);
        sc.close();
    }
}

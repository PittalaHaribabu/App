


/*
System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
*/
import java.util.Scanner;
class Input {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("enter num3: ");
        int num3 = sc.nextInt();
        float avg=(num1+num2+num3)/3.0f;
        System.out.println("average is: " + avg);
        sc.close();
    }
}
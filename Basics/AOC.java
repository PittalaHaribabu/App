import java.util.Scanner;
public class AOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        int radius = sc.nextInt();
        float area = (float) (3.14 * radius * radius);
        System.out.println("area of circle is: " + area);
        sc.close();

    }
}

import java.util.Scanner;
class even1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 2 * n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}

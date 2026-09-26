public class odd_2 {
    public static void main(String[] args) {
        int n = 10; // You can change this value to generate more or fewer odd numbers
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 2*n);
    }
}

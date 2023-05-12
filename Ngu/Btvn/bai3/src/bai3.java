import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập n");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i < n; i++) {
           sum += i/(i + 1);
        }
        System.out.println("Tổng của dãy là :" + sum);
    }
}

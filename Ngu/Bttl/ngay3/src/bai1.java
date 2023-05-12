import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phuong trinh vsn");
        }
        else if (a == 0) {
                double d = -b / a;
                System.out.println("Phuong trinh co nghiem la: " + d);
        }
    }
}

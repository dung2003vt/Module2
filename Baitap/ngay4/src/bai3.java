public class bai3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int a = i;
            for (int j = 2; j <= a; j++) {
                if (a == j) {
                    System.out.println(a);
                    break;
                }
                if (a % j == 0) {
                    break;
                }

            }
        }
    }
}

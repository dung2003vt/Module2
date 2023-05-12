public class bai2 {
    public static void main(String[] args) {
                int count = 0;
                for (int i = 0; i < 100; i++) {
                    int a = i;
                    for (int j = 2; j <= a; j++) {
                        if (a == j) {
                            System.out.println(a);
                            count++;
                            break;
                        }
                        if (a % j == 0) {
                            break;
                        }

                    }
                    if (count == 20) {
                        break;
                    }
                }
            }
        }


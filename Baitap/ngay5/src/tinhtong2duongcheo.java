import java.util.Arrays;
import java.util.Scanner;

public class tinhtong2duongcheo {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài ma trận");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] arr = new int[length][length];
        for (int a = 0; a < length; a++) {
            for (int b = 0; b < length; b++) {
                System.out.println("Nhập phần tử thứ " + b + " của vị trí " + a);
                int value = scanner.nextInt();
                arr[a][b] = value;
            }
        }
        for (int i= 0; i< length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < length; j++) {
                sum += arr[j][j];
                sum1 += arr[j][arr.length-(j+1)];
            }
        System.out.println(sum);
        System.out.println(sum1);
        }

    }

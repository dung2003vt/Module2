import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int a = 0; a < length; a++) {
            System.out.println("Nhập giá trị phần tử");
            int value = scanner.nextInt();
            arr[a] = value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn xoá");
        int x = scanner.nextInt();
        int[] arr1 = new int[length - 1];
        for (int j = 0; j<arr.length;j++){
            if ( x == arr[j]){
                for (int i = 0; i < j; i++){
                    arr1[i]=arr[i];
                }
                for (int a =j; a <arr1.length;a++){
                    arr1[a]=arr[a + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}

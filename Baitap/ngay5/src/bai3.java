import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài mảng thứ nhất");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int a = 0; a < length; a++) {
            System.out.println("Nhập giá trị phần tử");
            int value = scanner.nextInt();
            arr[a] = value;
        }
        System.out.println("Nhập độ dài mảng thứ hai");
        int length2 = scanner.nextInt();
        int[] arr1 = new int[length2];
        for (int b = 0; b < length; b++) {
            System.out.println("Nhập giá trị phần tử");
            int value1 = scanner.nextInt();
            arr1[b] = value1;
        }
        int c = 0;
        int [] arr2=new int[arr.length+ arr1.length];
        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        for (int j=arr.length; j<arr2.length;j++){
            arr2[j]=arr1[c];
            c++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

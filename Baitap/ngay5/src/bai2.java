import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
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
        int[] arr1 = new int[length+1];
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn thêm");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm");
        int index = scanner.nextInt();
        if (index <= -1 || index>= arr.length-1){
            System.out.println("Không thể chèn phần tử vào mảng");
        } else {
            for (int i=0;i < index; i++){
                arr1[i]=arr[i];
            }
            arr1[index]=x;
            for (int j= index+1;j< arr1.length;j++){
                arr1[j]=arr[j-1];
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}
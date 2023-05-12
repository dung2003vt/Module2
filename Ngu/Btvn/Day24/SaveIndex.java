import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SaveIndex {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số lượng phần tử của mảng");
            int length = Integer.parseInt(scanner.nextLine());
            List<Integer> list = new ArrayList<>(length);
            System.out.println(Arrays.toString(checkIndex(list, scanner,length)));
        } catch (NumberFormatException e){
            System.out.println("Hãy nhập số");
        }
    }
    public static int[] checkIndex(List list, Scanner scanner, int length){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng");
            int a = Integer.parseInt(scanner.nextLine());
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.indexOf(list.get(i));
        }
        return arr;
    }
}

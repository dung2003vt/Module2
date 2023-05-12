import java.util.Scanner;

public class timkitu {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự cần tìm");
        String a = scanner.nextLine();
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (a.equalsIgnoreCase(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        System.out.println("Kí tự " + a + " xuất hiện trong chuỗi " + str + " " + count + " lần");
    }
}

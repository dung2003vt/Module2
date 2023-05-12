import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Stack<String> brackets = new Stack<>();
        System.out.println(checkBrackets(brackets));

    }

    public static Boolean checkBrackets(Stack<String> brackets) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập chuỗi ngoặc muốn kiểm tra");
                String input = scanner.nextLine();
                int count = 0;
                String[] arr = input.split("");
                if (arr[0].equals(")")) {
                    return false;
                }
                for (String s : arr) {
                    brackets.push(s);
                }
                for (int i = 0; i < arr.length; i++) {
                    if (brackets.pop().equals("(")) {
                        count++;
                    }
                    if (brackets.pop().equals(")")) {
                        count--;
                    }
                    if (!arr[i].equals("(") && !arr[i].equals(")")){
                        throw new NumberFormatException("Hãy nhập ngoặc");
                    }
                }

                if (count == 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

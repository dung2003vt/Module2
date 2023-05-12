import java.util.Scanner;
import java.util.Stack;

public class Pinary {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển đổi");
        int num = scanner.nextInt();
           while (num > 0){
                   stack.push(num % 2);
                   num =num/2;
           }
           while (!stack.isEmpty()){
               System.out.print(stack.pop());
           }
    }
}

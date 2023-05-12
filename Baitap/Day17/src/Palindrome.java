import sun.net.www.content.text.Generic;

import java.sql.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ muốn kiểm tra");
        String word = scanner.nextLine();
        String[] strings = word.split("");
        for (String s: strings){
            stack.push(s);
            queue.offer(s);
        }
        boolean flag = true;
        int size = stack.size();/p;o
        for (int i = 0; i < size; i++) {
            if (!stack.pop().equals(queue.poll())){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Đây là chuỗi palindrome");
        } else {
            System.out.println("Đây không phải chuỗi palindrome");
        }
    }
}

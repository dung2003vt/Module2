import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    static Map<String,String> dictionary = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dictionary.put("Hello","Lô cc");
        dictionary.put("Goodbye","Cút");
        dictionary.put("Banana","Chuối");
        dictionary.put("Batman","Mất cha");
        System.out.println("Menu");
        System.out.println("1.Thêm từ điển");
        System.out.println("2.Tìm từ");
        System.out.println("3.Sửa từ điển");
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:addDictionary();
            break;
            case 2:searchDictionary();
            break;
            case 3:editDictionary();
            break;
            case 0:System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn không phù hợp");
        }
    }
    public static void searchDictionary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ muốn tìm");
        String word = scanner.nextLine();
        Set<String> set = dictionary.keySet();
        boolean flag = true;
        for (String key : set){
            if (word.equals(dictionary.get(key))){
                System.out.println(dictionary.get(key));
                flag = false;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy");
        }
        }
        public static void addDictionary(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập từ tiếng Anh");
            String eng = scanner.nextLine();
            System.out.println("Nhập nghĩa");
            String vie = scanner.nextLine();
            dictionary.put(eng,vie);
            System.out.println("Thêm thành công");
        }
        public static void editDictionary(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập từ tiếng Anh muốn sửa");
            String word = scanner.nextLine();
            if (word.equals(dictionary.get())) {
                System.out.println("Nhập nghĩa mới");
                String edit = scanner.nextLine();
                dictionary.put("Hello", edit);
                System.out.println("Sửa thành công");
            }
            else{
                System.out.println("Không tìm thấy");
            }
        }
    }

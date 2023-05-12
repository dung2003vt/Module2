import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManager extends Phone{
    static Scanner scanner;
    Contact[] phoneList;
    public void savePhone(Contact contact){
        scanner = new Scanner(System.in);
        System.out.println("Nhập số người trong danh bạ");
        int num = scanner.nextInt();
         phoneList = new Contact[num];
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String numberPhone = scanner.nextLine();
        for (Contact contact2: phoneList) {
            contact2 =new Contact(name,numberPhone);
        }

    }
    public void displayPhone(Contact[] phoneList){
        for (Contact contact: phoneList) {
            System.out.println(contact);
        }
    }
    public static void insertPhonee(Contact[] phoneList){
        System.out.println("Nhập số người muốn thêm");
        int num = Integer.parseInt(scanner.nextLine());
        Contact[] contact1 = new Contact[phoneList.length + num];
        System.arraycopy(phoneList,0,)
    }
    public static void removePhonee(String name){

    }
    public static void updatePhonee(String name, String newPhone){

    }

    @Override
    void insertPhone(Contact contact) {

    }

    @Override
    void removePhone(String name) {

    }

    @Override
    void updatePhone(String name, String newPhone) {

    }
}

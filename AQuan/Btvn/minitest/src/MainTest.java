import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagePerson managePerson = new ManagePerson();
        System.out.println("Nhập danh sách ");
        managePerson.begin();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả mọi người");
            System.out.println("2. Tạo người mới");
            System.out.println("3. Sửa một người (theo id)");
            System.out.println("4. Xóa đi một người");
            System.out.println("5. Tổng điểm trung bình ");
            System.out.println("6. Tìm theo tên ");
            System.out.println("7. Sắp xếp thứ tự theo điểm trung bình ");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    managePerson.displayPerson();
                    break;
                case 2:
                    managePerson.addPerson();
                    break;
                case 3:
                    managePerson.editPerson();
                    break;
                case 4:
                    managePerson.deletePerson();
                    break;
                case 5:
                    managePerson.sumPerson();
                    break;
                case 6:
                    managePerson.searchPerson();
                    break;
                case 7:
                    managePerson.sortPerson();
                    break;
            }

        }while (true);
    }
}

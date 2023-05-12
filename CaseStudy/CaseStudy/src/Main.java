
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TypeManage typeManage = new TypeManage();
        ProductManager productManager = new ProductManager(typeManage);
        AccountLogin accountLogin = new AccountLogin();
        int choice = -1;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1 . Đăng nhập");
            System.out.println("2 . Đăng kí");
            System.out.println("Nhập lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    String result = accountLogin.login();
                    if (result == null) {
                        System.out.println("Sai tên đăng nhập hoặc mật khẩu");
                    } else if (result.equals("admin")) {
                        menuAdmin(scanner, productManager, typeManage);
                    } else {
                        menuClient(productManager, scanner);
                    }
                    break;
                case 2:
                   AccountLogin.register();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void menuType(Scanner scanner, TypeManage typeManage) {
        int choiceBrand = -1;
        do {
            System.out.println("-----Menu Type-----");
            System.out.println("1. Thêm loại sản phẩm");
            System.out.println("2. Sửa loại sản phẩm");
            System.out.println("3. Xoá loại sản phẩm");
            System.out.println("4.Hiển thị tất cả loại sản phẩm");
            System.out.println("0. Exit");
            try {
                choiceBrand = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choiceBrand) {
                case 1:
                    typeManage.add();
                    break;
                case 2:
                    typeManage.update();
                    break;
                case 3:
                    typeManage.delete();
                    break;
                case 4:
                    typeManage.display();
                    break;
            }
        } while (choiceBrand != 0);
    }

    public static void menuClient(ProductManager productManager, Scanner scanner) {
        int choice = -1;
        do {
            System.out.println(" ----- Menu ----- ");
            System.out.println("1 . Sắp xếp theo tên");
            System.out.println("2 . Sắp xếp theo giá");
            System.out.println("3 . Tìm kiếm");
            System.out.println("0. Đăng xuất");
            System.out.println("Hãy nhập lựa chọn của bạn");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    productManager.sortByName();
                    break;
                case 2:
                    productManager.sortByPrice();
                    break;
                case 3:
                    productManager.search();
                    break;
            }
        } while (choice != 0);

    }

    public static void menuAdmin(Scanner scanner, ProductManager productManager,TypeManage typeManage) {
        int choice = -1;
        do {
            System.out.println("-- Menu Admin --");
            System.out.println("1 . Thêm sản phẩm");
            System.out.println("2 . Sửa sản phẩm");
            System.out.println("3 . Xoá sản phẩm");
            System.out.println("4 . Menu Type");
            System.out.println("0. Logout");
            System.out.println("Nhập lựa chọn của bạn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.update();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    menuType(scanner, typeManage);
                    break;

            }
        } while (choice != 0);
    }
}
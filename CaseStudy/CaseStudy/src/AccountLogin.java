
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountLogin {
    static Scanner scanner = new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    IOFile fileManager;

    public static List<Account> inputAccount() {
        String user;
        System.out.println("Nhập tên đăng nhập");
        while (true) {
            user = scanner.nextLine();
            if (!user.equals("")) {
                boolean flag = true;
                for (Account a : accounts) {
                    if (a.getUsername().equals(user)) {
                        System.out.println("Tài khoản đã tồn tại");
                        flag = false;
                    }
                }
                if (flag) {
                    break;
                }
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        String pass;
        System.out.println("Nhập mật khẩu");
        System.out.println("Mật khẩu phải có tối thiểu 6 kí tự và tối đa 12 kí tự, 1 chữ hoa, 1 chữ thường, 1 kí tự đặc biệt");
        while (true) {
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,12}$";
            pass = scanner.nextLine();
            if (!pass.equals("")) {
                if (pass.matches(regex)) {
                    break;
                } else {
                    System.out.println("Sai định dạng");
                }
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
            String name;
            System.out.println("Nhập họ và tên");
            while (true) {
                name = scanner.nextLine();
                if (!name.equals("")) {
                    break;
                } else {
                    System.out.println("Hãy nhập lại");
                }
            }
            String phone;
            System.out.println("Nhập số điện thoại");
            while (true) {
                phone = scanner.nextLine();
                try {
                    String regex1 = "0\\d{9}";
                    if (phone.matches(regex1)) {
                        for (Account account : accounts) {
                            if (phone.equals(account.getPhoneNumber())) {
                                System.out.println("Phone number already exists");
                            }
                        }
                        break;
                    } else {
                        throw new IndexOutOfBoundsException(" Phone number already exists !!!");
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
            }
            String address;
            while (true) {
                System.out.println("Nhập địa chỉ");
                address = scanner.nextLine();
                if (!address.equals("")) {
                    break;
                } else {
                    System.out.println("Hãy nhập lại");
                }
            }
            accounts.add(new Account(user, pass, name, phone, address));
        return accounts;
    }

    public String login() {
        String user;
        while (true) {
            System.out.println("Nhập tên đăng nhập");
            user = scanner.nextLine();
            if (!user.equals("")) {
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        String pass;
        while (true) {
            System.out.println("Nhập mật khẩu");
            pass = scanner.nextLine();
            if (!pass.equals("")) {
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        IOFile.readAccount(accounts);
        if (user.equals("admin") && pass.equals("123")) {
            System.out.println("Đăng nhập vào tài khoản admin");
            return "admin";
        }
        for (Account a : accounts) {
             if (a.getUsername().equals(user) && a.getPassword().equals(pass)) {
                System.out.println("Đăng nhập vào tài khoản " + a.getFullname());
                return user;
            }
        }
        return null;
    }

    public static void register() {
        inputAccount();
        IOFile.writeAccount(accounts);
        System.out.println("Đăng ký thành công");
    }
}

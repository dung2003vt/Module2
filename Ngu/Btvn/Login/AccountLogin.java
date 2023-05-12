package Login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        do {
            System.out.println("Login");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng ký");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:login(scanner,accounts);
                break;
                case 2:register(scanner,accounts);
                break;
                case 0:
                    System.exit(0);
                    break;
            }

        }while (true);
    }

    public static List<Account> inputAccount(List<Account> accounts, Scanner scanner) {
        String user;
        System.out.println("Nhập tên đăng nhập");
        while (true) {
            user = scanner.nextLine();
            if (!user.equals("")){
                    boolean flag = true;
                for (Account a: accounts) {
                    if (a.getUsername().equals(user)) {
                        System.out.println("Tài khoản đã tồn tại");
                        flag = false;
                    }
                }
                if (flag){
                    break;
                }
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
        String name;
        while (true){
        System.out.println("Nhập họ và tên");
        name = scanner.nextLine();
            if (!name.equals("")) {
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        int phone = 0;
        while (true) {
            try {
                System.out.println("Nhập số điện thoại");
                phone = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
        }
        String address;
        while (true){
        System.out.println("Nổ địa chỉ nhà m ra");
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
    public static void writeAccount(List<Account> accounts){
        File file = new File("C:\\Modul2\\Ngu\\Btvn\\Login\\account");
        try {
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Account account : accounts){
                bufferedWriter.write(account.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("lỗi: " + e);
        }
    }
    public static void readAccount(List<Account> accounts){
        try {
            File file = new File("C:\\Modul2\\Ngu\\Btvn\\Login\\account");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String c;
            String[] str;
            while ((c = bufferedReader.readLine()) != null) {
                str = c.split(", ");
               accounts.add(new Account(str[1],str[2],str[3],Integer.parseInt(str[4]),str[5]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e){
            System.out.println("Lỗi: " + e);
        }
    }
    public static void login(Scanner scanner, List<Account> accounts){
        String user;
        while (true){
        System.out.println("Nhập tên đăng nhập");
        user = scanner.nextLine();
            if (!user.equals("")) {
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        String pass;
        while (true){
        System.out.println("Nhập mật khẩu");
        pass = scanner.nextLine();
            if (!pass.equals("")) {
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        readAccount(accounts);
        for (Account a: accounts) {
            if (a.getUsername().equals(user) && a.getPassword().equals(pass)){
                System.out.println("Đăng nhập thành công");
                break;
            } else {
                System.out.println("Sai tên đăng nhập hoặc mật khẩu ");
            }
        }
    }
    public static void register(Scanner scanner, List<Account> accounts){
        inputAccount(accounts,scanner);
        writeAccount(accounts);
        System.out.println("Đăng ký thành công");
    }
}

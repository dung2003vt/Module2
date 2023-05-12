package controller;

import model.Product;
import service.ProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        ProductManager productManager = new ProductManager(products);
        int choice = -1;
        do {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xoá");
            System.out.println("5.Sắp xếp");
            System.out.println("6.Tìm sản phẩm có giá đắt nhất");
            System.out.println("7.Đọc từ ghi file");
            System.out.println("8.Ghi vào ghi file");
            System.out.println("9.Thoát");
            System.out.println("Chọn chức năng");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.update();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                    menuSort(scanner,productManager);
                case 6:
                    productManager.searcExpensive();
                    break;
                case 7:
                    productManager.readProduct();
                    break;
                case 8:
                    productManager.writeProduct();
                    break;
                case 9:
                    System.exit(9);
                    break;
            }
        } while (true);
    }
    public static void menuSort(Scanner scanner, ProductManager productManager) {
        int choice = -1;
        do {

            System.out.println("---MENU SORT---");
            System.out.println("1.Sắp xếp tăng dần");
            System.out.println("2.Sắp xếp giảm dần");
            System.out.println("0.Thoát");
            System.out.println("Chọn chức năng");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
            }
            switch (choice) {
                case 1:
                    productManager.sortUp();
                case 2:
                    productManager.sortDown();
            }

        } while (choice != 0);
    }
}

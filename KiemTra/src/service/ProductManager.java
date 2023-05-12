package service;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Manager {
    private final Scanner scanner ;
    private final List<Product> products ;

    public ProductManager(List<Product> products) {
        this.scanner = new Scanner(System.in);
        this.products = new ArrayList<>();
    }

    @Override
    public List add() {
        String code;
        System.out.println("Nhập mã sản phẩm");
        while (true) {
            code = scanner.nextLine();
            if (!code.equals("")){
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        System.out.println("Nhập tên sản phẩm");
        String name ;
        while (true) {
            name = scanner.nextLine();
            if (!name.equals("")){
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        double price;
        System.out.println("Nhập giá sản phẩm");
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price == 0){
                    throw new NumberFormatException("Hãy nhập lại");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập số lượng");
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity == 0){
                    throw new NumberFormatException("Hãy nhập lại");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập mô tả");
        String mother ;
        while (true) {
            mother = scanner.nextLine();
            if (!mother.equals("")){
                break;
            } else {
                System.out.println("Hãy nhập lại");
            }
        }
        products.add(new Product(code, name, price, quantity, mother));
        display();
        return products;
    }

    @Override
    public List update() {
        Product product = getByCode();
        if (product != null) {
            System.out.println("Nhập mã");
            String code;
            while (true){
                code =scanner.nextLine();
                if (!code.equals("")){
                    product.setCode(code);
                    break;
                }else {
                    System.out.println("Hãy nhập lại");
                }
            }
            while (true){
                code = scanner.nextLine();
                if (!code.equals("")){
                    break;
                } else {
                    System.out.println("Hãy nhập lại");
                }
            }
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            while (true) {
                if (!name.equals("")) {
                    product.setName(name);
                    break;
                } else {
                    System.out.println("Hãy nhập lại");
                }
            }
            System.out.println("Nhập giá");
            double price;
            while (true) {
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    if (price > 0) {
                        product.setPrice(price);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập lại");
                }
            }
            int quantity;
            System.out.println("Nhập số lượng");
            while (true) {
                try {
                    quantity = Integer.parseInt(scanner.nextLine());
                    if (quantity > 0) {
                        product.setPrice(quantity);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập lại");
                }
            }
            System.out.println("Nhập mô tả");
            String mother ;
            while (true){
                mother = scanner.nextLine();
                if (mother.equals("")) {
                    product.setMother(mother);
                    break;
                } else {
                    System.out.println("Hãy nhập lại");
                }
            }

        }
        display();
        return products;
    }

    @Override
    public List delete() {
        Product product = getByCode();
        if (product != null) {
            products.remove(product);
        }
        for (Product p:
             products) {
            p.display();
        }
        return products;

    }

    @Override
    public void sortUp() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) return 1;
                else if (o1.getPrice() < o2.getPrice()) return -1;
                else return 0;
            }
        });
        display();
    }

    @Override
    public void sortDown() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o2, Product o1) {
                if (o2.getPrice() > o1.getPrice()) return 1;
                else if (o2.getPrice() < o1.getPrice()) return -1;
                else return 0;
            }
        });
        display();
    }

    @Override
    public void searcExpensive() {
        double max = 0;
        for (Product p : products) {
            if (p.getPrice() > max) {
                max = p.getPrice();
            }
        }
        for (Product p : products) {
            if (p.getPrice() == max) {
                System.out.println("Sản phẩm có giá lớn nhất :" + p);
            }
        }
    }

    public Product getByCode() {
        System.out.println("Nhập mã sản phẩm");
        String code = scanner.nextLine();
        for (Product p : products) {
            if (code.equals(p.getCode())) {
                return p;
            }
        }
        return null;
    }
    public void display() {
        System.out.printf("\n%-15s%-15s%-15s%-15s%s",
                "Id", "Name", "Price", "Quantity", "Mother\n");

        for (Product p : products) {
            p.display();
        }
    }

    @Override
    public void writeProduct() {
        File file = new File("C:\\Modul2\\KiemTra\\src\\data\\product");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrProduct = string.split(",");
                Product product = new Product(arrProduct[0],arrProduct[1],Double.parseDouble(arrProduct[2]),Integer.parseInt(arrProduct[3]),arrProduct[4]);
                products.add(product);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readProduct() {
        File file = new File("C:\\Modul2\\KiemTra\\src\\data\\product");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : products) {
                bufferedWriter.write(p.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    }

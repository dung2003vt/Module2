import java.util.Scanner;

public class ProductBegin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm");
        int num = scanner.nextInt();
        Product[] products = new Product[num];
        for (int i = 0; i < num; i++) {
            products[i] = Product.product();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(products[i]);
        }
        scanner.nextLine();
        System.out.println("Nhập tên sẩn phẩm muốn tìm");
        String searchProd = scanner.nextLine();
        boolean c = false;
        for (int j = 0; j < products.length; j++) {
            if (searchProd.equals(products[j].getName())) {
                c = true;
                System.out.println(products[j]);
            }
        }
        if (c == false) {
            System.out.println("Không có sản phẩm");
        }

        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Tổng giá " + num + " sản phẩm là " + sum + " USD");
        System.out.println("Nhập mã sản phẩm muốn xoá");
        Product[] products2 = new Product[num - 1];
        int deleteProd = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (deleteProd == products[i].getId()) {
                for (int j = 0; j < i; j++) {
                    products2[j] = products[j];
                }
                for (int a = i; a < products2.length; a++) {
                    products2[a] = products[a + 1];
                }
            }
        }
        for (int i = 0; i < products2.length; i++) {
            System.out.println(products2[i]);
        }
        System.out.println("Nhập mã sản phẩm muốn sửa");
        int editProd = scanner.nextInt();
        for (int i=0; i<products2.length; i++){
            if ( editProd == products2[i].getId()){
                scanner.nextLine();
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                products2[i].setName(name);
                System.out.println("Nhập giá");
                double price = scanner.nextDouble();
                products2[i].setPrice(price);
                scanner.nextLine();
                System.out.println("Nhập loại");
                String type = scanner.nextLine();
                products2[i].setType(type);
            }
        }
        for (int i=0; i<products2.length; i++) {
            System.out.println(products2[i]);
        }
    }
}

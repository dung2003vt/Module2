import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm");
        int num = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[num];
        Brand[] brands = new Brand[3];
        brands[0] = new Brand("Apple");
        brands[1] = new Brand("Samsung");
        brands[2] = new Brand("Nokia");
        for (int i = 0; i < products.length; i++){
            products[i] = productBegin(scanner,brands,i);
        }
        System.out.println(Arrays.toString(products));
        displayProducts(products);
    }

    public static Product productBegin( Scanner scanner, Brand[] brands, int i) {
        System.out.println("Nhập tên sản phẩm " + ++i);
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm " + i);
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập miêu tả sản phẩm " + i);
        String description = scanner.nextLine();
        System.out.println("Lựa chọn hãng sản phẩm " + i);
        for (int j = 0; j < brands.length; j++) {
            System.out.println(brands[j]);
        }
        Brand newBrand = new Brand();
        int choice = Integer.parseInt(scanner.nextLine());
        for (Brand brand: brands){
            if (choice == brand.getIdtemp()){
                 newBrand=brand;
            }
        }
        return new Product(name,price,description,newBrand);
    }
    public static void displayProducts(Product[] products) {
        for (Product e : products) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

}

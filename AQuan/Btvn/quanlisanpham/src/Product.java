import java.util.Scanner;

public class Product {
    private int id;
    private  String name;
    private double price;
    private String type;

    public Product( String name, double price, String type, int id) {

        this.name = name;
        this.price = price;
        this.type = type;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static Product product(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập loại sản phẩm");
        String type = scanner.nextLine();
        return new Product(name,price,type,id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + " USD" +
                ", type='" + type + '\'' +
                '}';
    }
}

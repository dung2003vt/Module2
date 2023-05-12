import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Manager,Feature {
    private final List<Product> products = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final TypeManage typeManage;
    IOFile ioFile;


    public ProductManager(TypeManage typeManage) {
        this.typeManage = typeManage;
        ioFile = new IOFile();
        ioFile.readProduct(products, typeManage);
    }
    @Override
    public List add() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập xuất xứ");
        String from = scanner.nextLine();
        System.out.println("Nhập khối lượng");
        double mass = Double.parseDouble(scanner.nextLine());
        Type type = getType();
        Product product = new Product(name, price, from, mass, type);
        products.add(product);
        ioFile.writeProduct(products);
        display();
        return products;
    }

    private Type getType() {
        typeManage.display();
        Type type;
        do {
            type = typeManage.getByIdType();
        } while (type == null);
        return type;
    }

    public Product getById() {
        int id;
        do {
            try {
                System.out.println("Nhập id");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập lại");
            }
        } while (true);
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    @Override
    public List update() {
        Product product = getById();
        if (product != null) {
            System.out.println("Nhập tên sản phẩm");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                product.setName(name);
            }
            double price;
            System.out.println("Nhập giá sản phẩm");
            while (true) {
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    if (price > 0) {
                        product.setPrice(price);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập số");
                }
            }
            System.out.println("Nhập xuất xứ");
            String from = scanner.nextLine();
            if (!from.equals("")) {
                product.setFrom(from);
            }
            System.out.println("Nhập khối lượng");
            double mass;
            while (true) {
                try {
                    mass = Double.parseDouble(scanner.nextLine());
                    if (mass > 0) {
                        product.setPrice(mass);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Hãy nhập số");
                }
            }
            typeManage.display();
            System.out.println("Nhập loại ");
            product.setType(getType());
            ioFile.writeProduct(products);

        }
        return products;
    }


    @Override
    public List delete() {
            Product product = getById();
            if (product != null) {
                products.remove(product);
            }
            ioFile.writeProduct(products);
            display();
            return products;

    }

    @Override
    public void display() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15%-15%s",
                "Id", "Name", "Price", "From", "Mass", "Type","\n");
        for (Product p : products) {
            p.display();
        }
    }

    @Override
    public void sortByName() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        display();
    }

    @Override
    public void sortByPrice() {
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
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm :");
        String name = scanner.nextLine();
        for (Product p : products) {
            if (p.getName().contains(name)) {
                System.out.println(p);
            }
        }
    }
}

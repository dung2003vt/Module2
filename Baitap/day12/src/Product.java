public class Product {
    static int idtemp = 1;
    private int id;
    String name;
    double price;
    String description;
    Brand brand;

    public Product() {
    }

    public Product(String name, double price, String description, Brand brand) {
        this.id = idtemp++;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }
    

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", brand=" + brand +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

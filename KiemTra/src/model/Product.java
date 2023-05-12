package model;

public class Product {
    private String code;
    private String name;
    private double price;
    private int quantity;
    private String mother;

    public Product() {
    }

    public Product(String code, String name, double price, int quantity, String mother) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mother = mother;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "model.Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", mother='" + mother + '\'' +
                '}';
    }
    public void display() {
        System.out.printf("\n%-15s%-15s%-15s%-15s%s",
                this.code, this.name, this.price, this.quantity, this.mother + "\n");
    }
}

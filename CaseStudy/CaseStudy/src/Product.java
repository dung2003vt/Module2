public class Product {
   private static int idUp= 1;
   private int id;
   private String name;
   private double price;
   private final String MONEY = "VND";
   private String from;
   private double mass;
   private Type type;

   public Product() {
   }

   public Product(String name, double price, String from,double mass, Type type) {
      this.id = idUp++;
      this.name = name;
      this.price = price;
      this.from = from;
      this.type = type;
      this.mass = mass;
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


   public Type getType() {
      return type;
   }

   public void setType(Type type) {
      this.type = type;
   }

   public double getMass() {
      return mass;
   }

   public void setMass(double mass) {
      this.mass = mass;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFrom() {
      return from;
   }

   public void setFrom(String from) {
      this.from = from;
   }

   @Override
   public String toString() {
      return  id +
              "," + name +
              "," + price +
              "," + mass +
              "," + from +
              "," + type;
   }
   public void display() {
      System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%s",
              this.id, this.name, this.price, this.from, this.mass, this.type + "\n");
   }
}

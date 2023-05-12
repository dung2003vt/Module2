public class Brand {
    static int idtemp = 1;
    private int id;
    String name;

    public Brand() {
    }

    public Brand(String name) {
        this.id = idtemp++;
        this.name = name;
    }

    public static int getIdtemp() {
        return idtemp;
    }

    public static void setIdtemp(int idtemp) {
        Brand.idtemp = idtemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                id + "." + name;

    }
}

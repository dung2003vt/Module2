public class Type {
    private static int idUp=1;
    private int id;
    private String name;

    public Type() {
    }

    public Type(String name) {
        this.id = idUp++;
        this.name = name;
    }



    public static int getIdUp() {
        return idUp;
    }

    public static void setIdUp(int idUp) {
        Type.idUp = idUp;
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

    public int getId() {
        return id;
    }

    public void display() {
        System.out.printf("%-10s%s", this.id, this.name + "\n");
    }

    @Override
    public String toString() {
        return   id +
                "," + name;
    }
}

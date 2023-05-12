public class Adress {
    static int idTemp = 1;
    private int id;
    private String name;

    public Adress() {
    }

    public Adress(String name) {
        this.id = idTemp++;
        this.name = name;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        Adress.idTemp = idTemp;
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

    @Override
    public String toString() {
        return
                id + "." + name
                ;
    }
}

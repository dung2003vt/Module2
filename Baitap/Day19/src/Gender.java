public class Gender {
    private int id;
    static int idUp=1;
    String name;

    public Gender() {
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

    public Gender(String name) {
        this.id = idUp++;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

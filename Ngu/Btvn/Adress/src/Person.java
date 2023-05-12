public class Person {
    static int idTemp = 1;
    private int id;
    private String name;
    private int age;
    Adress adress;

    public Person() {
    }

    public Person(String name, int age, Adress adress) {
        this.id = idTemp++;
        this.name = name;
        this.age = age;
        this.adress=adress;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        Person.idTemp = idTemp;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress.getName() +
                '}';
    }
}

public class Employee {
    static int idtemp = 1;
    private final int id;
    String name;
    int age;

    public Employee( String name, int age) {
        this.id=idtemp++;
        this.name = name;
        this.age = age;
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
}

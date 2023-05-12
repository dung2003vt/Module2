import java.util.Scanner;

public class Studen {
    private String name;
    private int age;
    private int math;
    private int physical;
    private int chemistry;
    public Studen(){

    }

    public Studen(String name, int age, int math, int physical, int chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public static Studen studen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm toán");
        int math = scanner.nextInt();
        System.out.println("Nhập điểm lý");
        int physic = scanner.nextInt();
        System.out.println("Nhập điểm hoá");
        int chemis = scanner.nextInt();
        return new Studen(name,age,math,physic,chemis);
    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physical=" + physical +
                ", chemistry=" + chemistry +
                '}';
    }
}

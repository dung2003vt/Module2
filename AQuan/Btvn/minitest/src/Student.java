public class Student extends Person{
    private double point;

    public Student() {
    }

    public Student(String name, int age, double point) {
        super(name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" +super.getAge() +
                "point=" + point +
                '}';
    }
}

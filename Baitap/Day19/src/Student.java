public class Student {
    private int id;
    static int idUp = 1;
    String name;
    int age;
    String gender;
        double avgPoint;
    Classroom classroom;

    public Student() {
    }



    public Student(int id, String name, int age, String gender, double avgPoint, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classroom = classroom;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public void display() {
        System.out.printf("%-5s%-15s%-7s%-7s%-7s%s",
                id, name, age, gender,avgPoint, classroom +"\n");
    }
}

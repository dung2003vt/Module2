import java.util.*;

public class StudentManage implements Manage {
    private final ArrayList<Student> students;
    private final Scanner scanner;
    Map<Integer,String> gender = new TreeMap<>();


    public StudentManage(Scanner scanner) {
        students= new ArrayList<>();
        this.scanner=scanner;
    }
    public void displayAll() {
        System.out.printf("%-5s%-15s%-7s%-7s%-7s%s",
                "Id", "Name", "Age","Gender", "Avg_Point", "Classroom\n");
        for (Student student : students) {
            student.display();
        }
    }


    @Override
    public void create() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm trung bình: ");
        double avg = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void update() {

    }

    @Override
    public Object delete() {
        return null;
    }

    @Override
    public void searchById() {

    }
}

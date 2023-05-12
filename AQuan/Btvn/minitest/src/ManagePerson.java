import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ManagePerson implements Manage {
    ArrayList<Person> persons = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public ManagePerson(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ManagePerson() {
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    public void begin() {
        System.out.println("Nhập sô lượng đối tượng");
        int num1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num1; i++) {
            addPerson();
        }
    }


    @Override
    public void displayPerson() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Mời bạn nhập thông tin học viên:");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("chọn kiểu đối tượng");
        System.out.println("1.kiểu đối tượng bình thường");
        System.out.println("2.kiểu đối tượng học viên:");
        int choiceType = Integer.parseInt(scanner.nextLine());
        if (choiceType == 1) {
            Person person = new Person(name, age);
            persons.add(person);
        }
        if (choiceType == 2) {
            System.out.println("Nhập điểm trung bình: ");
            double point = Double.parseDouble(scanner.nextLine());
            Student student = new Student(name, age, point);
            persons.add(student);

        }
    }

    @Override
    public void searchPerson() {
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(name)) {
                System.out.println(persons.get(i));
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void deletePerson() {
        System.out.println("Nhập id muốn xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < persons.size(); i++) {
            if (idDelete == persons.get(i).getId()) {
                persons.remove(i);
            }
        }
        System.out.println("xóa thành công");
    }

    @Override
    public void editPerson() {
        System.out.println("Nhập id mà bạn muốn sửa:");
        int idEdit = Integer.parseInt(scanner.nextLine());

        boolean check1 = false;

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId() == idEdit) {
                check1 = true;
                if (persons.get(i) instanceof Student) {
                    System.out.println("Nhập tên học viên");
                    persons.get(i).setName(scanner.nextLine());
                    System.out.println("Nhập tuổi học viên");
                    persons.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập điểm trung bình");
                    ((Student) persons.get(i)).setPoint(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Sửa thành công");
                } else {
                    System.out.println("Nhập tên học viên");
                    persons.get(i).setName(scanner.nextLine());
                    System.out.println("Nhập tuổi học viên");
                    persons.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Sửa thành công");
                }
            }
        }
        if (!check1) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void sortPerson() {
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                Student student1 = (Student) o1;
                Student student2 = (Student) o2;
                if (student1.getPoint() > student2.getPoint()) {
                    return 1;
                } else if (student1.getPoint() < student2.getPoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public void sumPerson() {
        int sum = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) instanceof Student) {
                Student studentSum = (Student) persons.get(i);
                sum += studentSum.getPoint();
            }
        }
        System.out.println("Tổng điểm trung bình là " + sum);
    }
}

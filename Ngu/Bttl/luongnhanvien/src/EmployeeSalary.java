import java.util.Arrays;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhân viên");
        int num = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[num];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhập lựa chọn");
            System.out.println("1.Nhân viên FullTime");
            System.out.println("2.Nhân viên PartTime");
            System.out.println("0.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employees[i] = employeeFull(scanner,i,employees);
                    break;
                case 2:
                    employees[i] = employeePart(scanner,i,employees);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }

        }
        System.out.println(Arrays.toString(employees));
        int choice1;
        do {
            System.out.println("Menu");
            System.out.println("1.Hiển thị nhân viên fullTime");
            System.out.println("2.Hiển thị nhân viên partTime");
            System.out.println("3.Thêm nhân viên mới");
            System.out.println("4.Xoá nhân viên");
            System.out.println("5.Sửa nhân viên");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    displayFullTime(employees);
                    break;
                case 2:
                    displayPartTime(employees);
                    break;
                case 3:
                    addEmpl(scanner, employees);
                    break;
                case 4:
                    deleteEmpl(scanner, employees);
                    break;
                case 5:
                    editEmpl(employees, scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (true);
    }
    public static void displayFullTime(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTime) {
                System.out.println(employees[i]);
            }
        }
    }
    public static void displayPartTime(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof PartTime) {
                System.out.println(employees[i]);
            }
        }
    }
    public static Employee[] deleteEmpl(Scanner scanner, Employee[] employees) {
        System.out.println("Nhập tên nhân viên muốn xoá");
        String delete = scanner.nextLine();
        Employee[] employeeDelete = new Employee[employees.length - 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(delete)) {
                for (int j = 0; j < i; j++) {
                    employeeDelete[j] = employees[j];
                }
                for (int a = 0; a < employeeDelete.length; a++) {
                    employeeDelete[a] = employeeDelete[a + 1];
                }
            }
        }
        employees = employeeDelete;
        return employees;
    }
    public static void addEmpl(Scanner scanner, Employee[] employees) {
        System.out.println("Nhập lựa chọn");
        System.out.println("1.Nhân viên parttime");
        System.out.println("2.Nhân viên fulltime");
        System.out.println("0.Quay lại");
        System.out.println("lựa chọn của bạn là");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addEmplPartTime(employees,scanner);
                break;
            case 2:
                addEmplFullTime(employees,scanner);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Lựa chọn không phù hợp");
        }
    }
    public static void addEmplFullTime (Employee[] employees, Scanner scanner){
        Employee[] addEmpl = new Employee[employees.length + 1];
        System.out.println("Nhập id nhân viên muốn thêm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên muốn thêm");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số năm kinh nghiệm");
        int year = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.length; i++) {
            addEmpl[i] = employees[i];
        }
        addEmpl[addEmpl.length - 1] = new FullTime(id, name, age, year);
        employees = addEmpl;
    }
    public static void addEmplPartTime(Employee[] employees,Scanner scanner){
        Employee[] addEmpl = new Employee[employees.length + 1];
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp số giờ làm");
        int work = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.length; i++) {
            addEmpl[i] = employees[i];
        }
        addEmpl[addEmpl.length - 1] = new FullTime(id, name, age, work);
        employees = addEmpl;
    }
    public static void editEmpl(Employee[] employees, Scanner scanner) {
        System.out.println("nhập id nhân viên muốn sửa:");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.length; i++) {
            if (edit == employees[i].getId()) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                employees[i].setName(name);
                System.out.println("Nhập tuổi");
                int age= Integer.parseInt(scanner.nextLine());
                employees[i].setAge(age);
                if (employees[i] instanceof FullTime){
                    System.out.println("Nhập kinh nghiệm làm việc");
                    int time = Integer.parseInt(scanner.nextLine());
                    ((FullTime) employees[i]).setYearsOfExperience(time);
                }else {
                    System.out.println("Nhập số giờ làm việc");
                    int time = Integer.parseInt(scanner.nextLine());
                    ((PartTime) employees[i]).setWorkTime(time);
                }
            }
        }

    }
    public static Employee employeePart(Scanner scanner, int i, Employee[] employees){
        int id = employees[i].getId()+1;
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp số giờ làm");
        int work = Integer.parseInt(scanner.nextLine());
        return new PartTime(id, name, age, work);
    }
    public static Employee employeeFull(Scanner scanner, int i, Employee[] employees) {
        int id = employees[i].getId()+1;
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp kinh nghiệm làm");
        int year = Integer.parseInt(scanner.nextLine());
        return new FullTime(id, name, age, year);
    }
}











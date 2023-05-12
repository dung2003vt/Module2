import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số người");
        int num = Integer.parseInt(scanner.nextLine());
        Person[] person = new Person[num];
        Adress[] adresses = new Adress[3];
        adresses[0] = new Adress("Hà Nội");
        adresses[1] = new Adress("Hồ Chí Minh");
        adresses[2] = new Adress("Huế");
        for (int i = 0; i < person.length; i++) {
            person[i] = personBegin(scanner, adresses, i);
        }
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Hiển thị người dùng");
            System.out.println("2.Thêm ngời dùng");
            System.out.println("3.Sửa người dùng");
            System.out.println("4.Xoá người dùng");
            System.out.println("5.Sắp xếp mảng từ a-z");
            System.out.println("6.Hiển thị người dùng theo thành phố");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayPerson(person);
                    break;
                case 2:
                    person = addPerson(person, scanner, adresses);
                    break;
                case 3:
                    editPerson(person, scanner, adresses);
                    break;
                case 4:
                    person = deletePer(scanner, person);
                    break;
                case 5:
                    arrangePerson(scanner, person);
                    break;
                case 6:
                    displayPersonAdress(scanner, person, adresses);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (true);

    }

    public static Person[] addPerson(Person[] person, Scanner scanner, Adress[] adresses) {
        System.out.println("Nhập số người muốn thêm");
        int num = Integer.parseInt(scanner.nextLine());
        Person[] person1 = new Person[person.length + num];
        for (int j =0; j<person.length;j++){
            person1[j]=person[j];
        }
        for (int i = 1; i <= num; i++) {
            System.out.println("Nhập tên người thứ " + (person.length + i));
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi người thứ " + (person.length + i));
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Lựa chọn thành phố");
            for (Adress adress : adresses) {
                System.out.println(adress);
            }
            System.out.println("Nhập lựa chọn");
            Adress newAdress = new Adress();
            int choice = Integer.parseInt(scanner.nextLine());
            for (Adress adress : adresses) {
                if (choice == adress.getId()) {
                    newAdress = adress;
                }
            }
            person1[person1.length-i] = new Person(name, age, newAdress);
        }
        return person1;
    }

    public static Person personBegin(Scanner scanner, Adress[] adresses, int i) {
        System.out.println("Nhập tên người thứ " + ++i);
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi người thứ " + i);
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Lựa chọn thành phố");
        for (Adress adress : adresses) {
            System.out.println(adress);
        }
        System.out.println("Nhập lựa chọn");
        Adress newAdress = new Adress();
        int choice = Integer.parseInt(scanner.nextLine());
        for (Adress adress : adresses) {
            if (choice == adress.getId()) {
                newAdress = adress;
            }
        }
        return new Person(name, age, newAdress);
    }

    public static void displayPerson(Person[] person) {
        for (Person e : person) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static Person[] editPerson(Person[] person, Scanner scanner, Adress[] adresses) {
        System.out.println("nhập id người dùng muốn sửa:");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < person.length; i++) {
            if (edit == person[i].getId()) {
                System.out.println("Nhập tên người dùng");
                String name = scanner.nextLine();
                person[i].setName(name);
                System.out.println("Nhập tuổi người dùng");
                int age = Integer.parseInt(scanner.nextLine());
                person[i].setAge(age);
                System.out.println("Lựa chọn thành phố");
                for (Adress adress : adresses) {
                    System.out.println(adress);
                }
                System.out.println("Nhập lựa chọn");
                Adress newAdress = new Adress();
                int choice = Integer.parseInt(scanner.nextLine());
                for (Adress adress : adresses) {
                    if (choice == adress.getId()) {
                        newAdress = adress;
                    }
                }
                person[i].setAdress(newAdress);
            }
        }
        return person;

    }

    public static Person[] deletePer(Scanner scanner, Person[] person) {
        System.out.println("Nhập id nhân viên muốn xoá");
        int delete = Integer.parseInt(scanner.nextLine());
        Person[] deletePerson = new Person[person.length - 1];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getId() == delete) {
                for (int j = 0; j < i; j++) {
                    deletePerson[j] = person[j];
                }
                for (int a = 0; a < deletePerson.length; a++) {
                    deletePerson[a] = person[a + 1];
                }
            }
        }
        return deletePerson;
    }

    public static Person[] arrangePerson(Scanner scanner, Person[] person) {
        Person temp = new Person();
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].getName().compareTo(person[j].getName()) > 0) {
                    temp = person[i];
                    person[i] = person[j];
                    person[j] = temp;

                }
            }
        }
        return person;
    }

    public static void displayPersonAdress(Scanner scanner, Person[] person, Adress[] adresses) {
        System.out.println("Nhập lựa chọn thành phố muốn hiển thị");
        for (Adress adress : adresses) {
            System.out.println(adress);
        }
        System.out.println("Nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < person.length; i++) {
            for (Adress adress : adresses) {
                if (choice == adress.getId()) {
                    displayPerson(person);
                }
            }
        }

    }
}

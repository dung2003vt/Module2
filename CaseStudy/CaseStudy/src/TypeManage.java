import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TypeManage implements Manager {
    private final Scanner scanner;
    private List<Type> types;
    IOFile ioFile = new IOFile();
    Type type;


    public List<Type> getType() {
        return types;
    }

    public void setType(List<Type> brandList) {
        this.types = types;
    }

    public TypeManage() {
        scanner = new Scanner(System.in);
        types = new ArrayList<>();
        try {
            ioFile.readType(types);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Type> add() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Type type = new Type(name);
        types.add(type);
        ioFile.writeType(types);
        return types;
    }

    @Override
    public List<Type> update() {
        int idUpdate = 0;
        int count = 0;
        display();
        do {
            count++;
            try {
                System.out.println("Nhập id loại bạn muốn sửa");
                idUpdate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (count < 3);

        for (Type e : types) {
            if (e.getId() == idUpdate) {
                System.out.println("Nhập tên loại mới");
                String nameUpdate = scanner.nextLine();
                e.setName(nameUpdate);
            }
        }
        ioFile.writeType(types);
        return types;
    }

    @Override
    public List<Type> delete() {
        display();
        int count = 0;
        int idDelete;
        System.out.println("Nhập id bạn muốn xoá ");
        idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < types.size(); i++) {
            if (types.get(i).getId() == idDelete) {
                types.remove(i);
            }
        }
        ioFile.writeType(types);
        return types;
    }


    @Override
    public void display() {
        for (Type b : types) {
            System.out.println(b);
        }
    }

    public Type getByIdType() {
        int idType;
        System.out.println("Nhập id bạn muốn ");
        do {
            try {
                idType = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập lại");
            }
        } while (true);
        for (Type b : types) {
            if (b.getId() == idType) {
                return b;
            }
        }
        return null;
    }


    public Type getByNameType(String name) {
        for (Type b : types) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }
}


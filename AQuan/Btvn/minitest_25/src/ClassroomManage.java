
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom> {

    private final Scanner scanner;
    private final ArrayList<Classroom> classrooms;

    public ClassroomManage(Scanner scanner) {
        this.scanner = scanner;
        classrooms = new ArrayList<>();
        classrooms.add(new Classroom("C0223I1"));
        classrooms.add(new Classroom("C1022I1"));
        writeClassroom();
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public Classroom create() {
        System.out.println("Input name classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        classrooms.add(classroom);
        writeClassroom();
        return classroom;
    }

    @Override
    public Classroom update() {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        return classroom;
    }

    @Override
    public Classroom delete() {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        String i = scanner.nextLine();
        if (!i.equals("")) {
            int id = Integer.parseInt(i);
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == id) {
                    return classroom;
                }
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%s", "ID", "NAME\n");
        for (Classroom classroom : classrooms) {
            classroom.display();
        }
    }

    public void displayOne(Classroom classroom) {
        if (classroom != null) {
            classroom.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }
    public void writeClassroom (){
        File f = new File("C:\\Modul2\\AQuan\\Btvn\\minitest_25\\src\\classroom.txt");
        try {
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for(Classroom c :classrooms){
                bufferedWriter.write(c.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Loi: " + e);
        }
    }
    public void readClassroom() throws IOException {
        File f=new File("C:\\Modul2\\AQuan\\Btvn\\minitest_25\\src\\classroom.txt");
        FileReader fileReader=new FileReader(f);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String c;
        String[] str;
        while ((c=bufferedReader.readLine())!=null){
            str= c.split(", ");
            classrooms.add(new Classroom(str[1]));
        }
        bufferedReader.close();
        fileReader.close();
    }
}


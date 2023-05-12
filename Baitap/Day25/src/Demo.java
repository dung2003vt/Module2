import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        Dm2 dm2 =new Dm2();
        students.add(0);
        students.add(1);
        students.add(4);
        writeDataToFile("C:\\Modul2\\Baitap\\Day25\\src\\student.txt", students);
        List<Integer> studentDataFromFile = readDataFromFile("C:\\Modul2\\Baitap\\Day25\\src\\student.txt");
        for (Integer student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static void writeDataToFile(String path, List<Integer> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Integer> readDataFromFile(String path){
        List<Integer> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Integer>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}

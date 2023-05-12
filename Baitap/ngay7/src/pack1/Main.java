package pack1;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("aaa");
        System.out.println(child.parent());
        System.out.println(child.parent1());
    }
}

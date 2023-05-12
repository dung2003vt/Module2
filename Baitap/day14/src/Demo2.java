import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> demo = new ArrayList<>();
            demo.add(1);
            demo.add(2);
            demo.add(3);
            demo.add(4);
            demo.add(5);
            demo.add(6);
            demo.add(3);
            demo.add(3);
            demo.add(3);
        System.out.println(MyUtils.count(demo,3));
    }
}

import java.util.ArrayList;
import java.util.Objects;

public class Willcard {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ngu");
        arrayList.add("vcl");
        ArrayList<Integer> arrayList1 =new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        ArrayList<? extends Objects> list2;
        list2 = arrayList1;
    }
}

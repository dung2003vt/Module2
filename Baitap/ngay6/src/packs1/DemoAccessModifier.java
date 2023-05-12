package packs1;
public class DemoAccessModifier {
    public int publicDemo = 10;
    //Có thể truy cập từ bất cứ đâu.
    protected int proDemo = 11;
    //Có thể truy cập cả trong và ngoài package nhưng chỉ thông qua kế thừa.
    int defDemo = 12;
    //Khi không có access modifier thì mức độ truy cập là default, có thể truy cập trong cùng package.
    private int priDemo = 13;

    //Chỉ có thể truy câp trrong lớp.
    public static void main(String[] args) {
        DemoAccessModifier priDemo = new DemoAccessModifier();
        System.out.println(priDemo.priDemo);
    }


}

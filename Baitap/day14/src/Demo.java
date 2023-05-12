public class Demo {
    public static void main(String[] args) {
        Generic<String,String> generic = new Generic<String,String>("Vcl","Đm");
        String name = generic.getKey();
        String name1= generic.getValue();
        System.out.println("M ngu " + name + " " + name1 + " m");
    }
}

package packs1;

public class DemoPro {
    public static void main(String[] args) {
        DemoAccessModifier proDemo = new DemoAccessModifier();
        System.out.println(proDemo.proDemo);
    }

    public static class DemoDefault {
        public static void main(String[] args) {
            DemoAccessModifier demoDef = new DemoAccessModifier();
        }
    }
}

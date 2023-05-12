package pack2;

class Parent {
    void m1(){
        System.out.println("Hello would");
    }
}
class Son extends Parent {
    void m1(){
        System.out.println("Codegym");
    }
    void m2(){
        System.out.println("Demo");
    }
}
class Demo{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Son();
        Son c1 = new Son();
        Parent p3 = (Parent) c1;
        Son c3 = (Son) p2;
        p1.m1();
        p2.m1();
            }
}
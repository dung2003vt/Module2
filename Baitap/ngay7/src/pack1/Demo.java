package pack1;

public class Demo {
    void helloWould() {
        System.out.println("Hello Would");
    }
}

class Demo2 extends Demo { // Dạng kế thừa Single (Kế thừa đơn cấp)
    void hi() {
        System.out.println("Hi");
    }
}

class Demo3 extends Demo2 {  // Dạng kế thừa Multilevel (Kế thừa nhiều cấp)
    void ask() {
        System.out.println("How are you");
    }
}

class Demo4 extends Demo {   //Dạng kế thùa Hiearchical (Kế thừa thứ bậc)
    void reply() {
        System.out.println("I'm fine, thank you, and you");
    }
}

class testDemoSingle {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.hi();
        demo2.helloWould();
    }
}

class testDemoMultilevel {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.ask();
        demo3.hi();
        demo3.helloWould();
    }
}

class testDemoHiearchical {
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.reply();
        demo4.helloWould();
    }
}
//class Demo5 extends Demo2, Demo4 { // Dạng kế thừa Multiple (Đa kế thừa)
//}
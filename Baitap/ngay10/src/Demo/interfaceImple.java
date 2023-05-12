package Demo;

import Demo.Demo3;

public class interfaceImple implements Demo3 { //Triển khai
    @Override
    public void demo() {
        System.out.println("Hello World");
    }

    @Override
    public void demo3() {
        System.out.println("Hello world world");
    }

    @Override
    public void demo2() {
        System.out.println("World hello");

    }
}

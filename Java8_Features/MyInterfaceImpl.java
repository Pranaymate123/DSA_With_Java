package Java8_Features;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("Saying Hello From Implementaion class");

    }

    public static void main(String[] args) {
        MyInterface inter=new MyInterfaceImpl();
        inter.sayHello();

        MyInterface.sayHi();
    }
}

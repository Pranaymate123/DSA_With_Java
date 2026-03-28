package Java_Interview_Topics.Java8_Features.Functional_Interfaces;

public class MyInterfaceImpl implements MyInterface {
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

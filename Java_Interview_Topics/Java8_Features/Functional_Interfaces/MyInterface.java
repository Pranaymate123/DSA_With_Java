package Java_Interview_Topics.Java8_Features.Functional_Interfaces;

@FunctionalInterface
public interface MyInterface {
     void sayHello();
    static void sayHi() {
        System.out.println("Hi How Are You --> Trying to do Better.....");
    }

}


package Java8_Features;

public class Main {
    public static void main(String[] args) {

        //Implementing the functional interface using the Anonymous class
//        MyInterface myInterface=new MyInterface() {
//            //Anonymous class
//            @Override
//            public void sayHello() {
//                System.out.println("Hi I am saying hello From Anonymous class 1 ");
//            }
//        };
//
//        MyInterface inter2=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Second Anonymous implementation for the interface ");
//            }
//        };
//        //So for each implementation no need to create the new impl class we can do the task directly
//        myInterface.sayHello();
//        inter2.sayHello();
        System.out.println("--------------------------------------------------");
        //Implementing the functional interface using the Lambda Expression
        MyInterface inter=()->{
            System.out.println("Hi from 1st Lambda IMplementation");
        };
        inter.sayHello();

        MyInterface inter2=()-> System.out.println("If the lambda funtion body has only one statement in it then we can write directly like this ");

        inter2.sayHello();
    }

}

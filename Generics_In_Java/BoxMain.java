package Generics_In_Java;

public class BoxMain {

    public static void main(String[] args) {
        Box<String> box1=new Box<>("Water");

        Box<Integer> box2=new Box<>(1234);

        Box<Boolean> box3=new Box<>(true);

        System.out.println(box1.getContainer().getClass().getName());
        System.out.println("The box1 has "+box1.getContainer());
        System.out.println();
        System.out.println(box2.getContainer().getClass().getName());
        System.out.println("The box2 has "+box2.getContainer());
        System.out.println();
        System.out.println(box3.getContainer().getClass().getName());
        System.out.println("The box3 has "+box3.getContainer());
    }
}

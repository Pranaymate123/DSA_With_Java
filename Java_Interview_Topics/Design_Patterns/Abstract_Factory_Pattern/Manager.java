package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 1000000;

    }

    @Override
    public String getRole() {
        System.out.println("I am Getting the Manager ");
        return "MANAGER";
    }
}

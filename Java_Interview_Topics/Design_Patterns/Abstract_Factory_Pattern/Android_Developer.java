package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Android_Developer implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String getRole() {
        System.out.println("I am Android Developer ");
        return "ANDROID DEVELOPER";
    }
}

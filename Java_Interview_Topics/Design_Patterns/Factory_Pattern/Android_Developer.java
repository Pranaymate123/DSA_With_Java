package Java_Interview_Topics.Design_Patterns.Factory_Pattern;

public class Android_Developer implements Employee {


    @Override
    public int salary() {
        System.out.println("Getting the Android Developer Salary");
        return 60000;
    }
}

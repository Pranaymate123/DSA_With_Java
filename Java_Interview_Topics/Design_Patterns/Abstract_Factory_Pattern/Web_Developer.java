package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Web_Developer implements Employee{
    @Override
    public int salary() {
        return 60000;
    }

    @Override
    public String getRole() {
        System.out.println("I am a Web Developer ");
        return "WEB DEVELOPER";
    }
}

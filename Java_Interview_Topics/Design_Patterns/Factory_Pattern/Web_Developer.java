package Java_Interview_Topics.Design_Patterns.Factory_Pattern;

public class Web_Developer implements Employee {
    @Override
    public int salary() {

        System.out.println("Getting the Web Developer Salary ");
        return 50000;
    }


}

package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Android_Develoepr_Factory implements Employee_Abstract_Factory{
    @Override
    public Employee createEmployee() {
        return new Android_Developer();
    }
}

package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Employee_Factory {

    public static Employee getEmployee(Employee_Abstract_Factory factory)
    {
        return factory.createEmployee();
    }
}

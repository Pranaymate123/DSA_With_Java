package Java_Interview_Topics.Design_Patterns.Abstract_Factory_Pattern;

public class Developer_Client {
    public static void main(String[] args) {
        // i want to get the android developer

        Employee employee=Employee_Factory.getEmployee(new Android_Develoepr_Factory());

        System.out.println("Employye Role "+ employee.getRole());

        Employee employee1=Employee_Factory.getEmployee(new Web_Developer_Factory());

        System.out.println("Employee Role "+employee1.getRole());

        Employee employee2=Employee_Factory.getEmployee(new ManagerFactory());

        System.out.println("Employee Role "+employee2.getRole());
    }
}

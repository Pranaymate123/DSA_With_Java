package Java_Interview_Topics.Design_Patterns.Factory_Pattern;

public class Developer_Client {

    public static void main(String[] args) {

        /// Factory Pattern provides an interface to create objects without exposing the creation logic.
        //It returns subclass instances based on input parameters using a common interface or superclass.
        //This promotes loose coupling and follows the Open/Closed Principle.
        //It's useful when the object creation is complex or dependent on dynamic input.


        //Instead of creating the objects like this
//        Employee emp=new Web_Developer();

        Employee emp=Employee_Factory.getEmployee("WEB");

        System.out.println("WEB salary : -- "+emp.salary());

        Employee emp1=Employee_Factory.getEmployee("ANDROID");

        System.out.println("ANDROID salary : -- "+emp1.salary());

    }
}

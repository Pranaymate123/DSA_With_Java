package Java_Interview_Topics.Design_Patterns.Factory_Pattern;

public class Employee_Factory {

    public static Employee getEmployee(String type)
    {

        if(type.trim().equals("WEB"))
        {
            return new Web_Developer();
        }
        else if(type.trim().equals("ANDROID"))
        {
            return  new Android_Developer();
        }
        else {
            return null;
        }
    }

}

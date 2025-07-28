package Java_Interview_Topics.Design_Patterns.Singleton_Pattern;

public class Jalebi {
    //Eager Way Of Creating The SingleTon  Objects
    private static Jalebi jalebi=new Jalebi();
    private Jalebi()
    {
        //Constructor
    }
    public static Jalebi getJalebi()
    {
        return jalebi;
    }
}

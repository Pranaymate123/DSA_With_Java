package Java_Interview_Topics.Design_Patterns.Singleton_Pattern;


//Lazy Instantiation : Means We only create the object when we required
public class Samosa {
    private static Samosa samosa;
    private Samosa()
    {
        //Constructor
    }

    public static Samosa getSamosa()
    {
        if(samosa==null)
        {
            synchronized (Samosa.class)
            {

                if(samosa==null)
                {
                    samosa=new Samosa();
                }
            }
        }
        return samosa;
    }
}

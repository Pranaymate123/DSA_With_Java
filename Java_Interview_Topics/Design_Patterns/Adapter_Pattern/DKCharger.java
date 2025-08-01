package Java_Interview_Topics.Design_Patterns.Adapter_Pattern;

public class DKCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android phone is charging ");
    }
}

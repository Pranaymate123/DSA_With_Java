package Java_Interview_Topics.Design_Patterns.Adapter_Pattern;

public class ChargerXyz implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your I phone is charging");
    }
}

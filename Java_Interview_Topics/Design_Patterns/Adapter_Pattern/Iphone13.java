package Java_Interview_Topics.Design_Patterns.Adapter_Pattern;

public class Iphone13 {

    private AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger)
    {
        this.appleCharger=appleCharger;
    }
    public void chargeIphone()
    {
        appleCharger.chargePhone();
    }
}

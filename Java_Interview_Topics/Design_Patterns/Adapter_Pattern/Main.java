package Java_Interview_Topics.Design_Patterns.Adapter_Pattern;

public class Main {

    public static void main(String[] args) {

        AndroidCharger androidCharger=new DKCharger();
        AppleCharger charger= new AdapterCharger(androidCharger);
        Iphone13 iphone13=new Iphone13(charger);

        iphone13.chargeIphone();
    }

    //AndroidCharger(DKcharger  C - type ) ----> ADAPTER CABLE ---> AppleCharger (lightning Type) --> Iphone

}

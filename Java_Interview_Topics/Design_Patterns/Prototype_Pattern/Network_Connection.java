package Java_Interview_Topics.Design_Patterns.Prototype_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Network_Connection implements Cloneable{

    private  String ip;
    private String importantData;

    private List<String> domains=new ArrayList<>();
    public Network_Connection()
    {

    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData()
    {
        //It will take 5 minutes
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        this.importantData="Very Imp Data";

        //Adding the domains to the List
        domains.add("www.insta.com");
        domains.add("www.fb.com");
        domains.add("www.twit.com");
        domains.add("www.abc.com");
        domains.add("www.google.com");

    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "Network_Connection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public Network_Connection clone() {

        //logic for deep copy
        Network_Connection clone=new Network_Connection();
        clone.setIp(this.getIp());
        clone.setImportantData(this.getImportantData());
        for(String domain:this.getDomains())
        {
            clone.getDomains().add(domain);
        }
        return clone;
    }
}

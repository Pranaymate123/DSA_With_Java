package Java_Interview_Topics.Design_Patterns.Prototype_Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating the Objects Using the Prototype Design");
       Network_Connection networkConnection= new Network_Connection();

       networkConnection.setIp("192.168.101.1");

       networkConnection.loadImportantData();



        //We want new object copy of networkConnection
       Network_Connection newNetworkConnection;
        newNetworkConnection=networkConnection.clone();


        System.out.println("Old Network Connection ");
        System.out.println(networkConnection);
        //removivg last domain
        networkConnection.getDomains().remove(networkConnection.getDomains().size()-1);
        networkConnection.getDomains().remove(networkConnection.getDomains().size()-1);

        System.out.println("Changed Network Connection ");
        System.out.println(networkConnection);
        System.out.println(newNetworkConnection);


    }
}

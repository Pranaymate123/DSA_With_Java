package Java_Interview_Topics.Design_Patterns.Obeserver_Pattern;

public class MainClient {
    public static void main(String[] args) {
        YoutubeChannel channel=new YoutubeChannel();

        Subscriber aman=new Subscriber("aman");
        Subscriber karan=new Subscriber("karan");

        channel.subscribe(aman);
        channel.subscribe(karan);
        channel.newVideoUploaded("Design Patterns by Learn Code With Durgesh");
        channel.newVideoUploaded("Java 8 Features by Learn Code With Durgesh");


    }
}

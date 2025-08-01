package Java_Interview_Topics.Design_Patterns.Obeserver_Pattern;

public interface Subject {

    void subscribe(Observer obj);

    void unSubscribe(Observer obj);

    void newVideoUploaded(String title);
}

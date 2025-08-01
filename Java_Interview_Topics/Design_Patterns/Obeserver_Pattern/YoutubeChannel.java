package Java_Interview_Topics.Design_Patterns.Obeserver_Pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers=new ArrayList<>();


    @Override
    public void subscribe(Observer obj) {
        this.subscribers.add(obj);
    }

    @Override
    public void unSubscribe(Observer obj) {
        this.subscribers.remove(obj);
    }

    @Override
    public void newVideoUploaded(String title) {


        for (Observer obj:this.subscribers)
        {
            obj.notified(title);
        }

    }
}

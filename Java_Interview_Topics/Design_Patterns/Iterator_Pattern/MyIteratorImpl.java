package Java_Interview_Topics.Design_Patterns.Iterator_Pattern;

import java.util.List;

public class MyIteratorImpl  implements MyIterator{

    private  List<User> lst;
    private int length;
    private int position=0;
    public MyIteratorImpl(List<User> userList)
    {
        this.lst=userList;
        this.length=userList.size();
    }

    @Override
    public boolean hasNext() {
        if(position>=length || lst.get(position)==null)
        {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        User user=lst.get(position);
        position++;
        return user;

    }
}

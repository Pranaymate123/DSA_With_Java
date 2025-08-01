package Java_Interview_Topics.Design_Patterns.Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    public List<User> userList=new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }

    public User getUser(int idx)
    {
        return userList.get(idx);
    }

    public MyIterator getIterator()
    {
        return new MyIteratorImpl(userList);
    }
}

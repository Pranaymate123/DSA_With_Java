package Java_Interview_Topics.Design_Patterns.Iterator_Pattern;

public class Main {

    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();

        userManagement.addUser(new User("karan","s12"));
        userManagement.addUser(new User("pranay","s13"));
        userManagement.addUser(new User("raj","s14"));
        userManagement.addUser(new User("ekrar","s15"));
        userManagement.addUser(new User("vaibhav","s16"));


        MyIterator iterator=userManagement.getIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

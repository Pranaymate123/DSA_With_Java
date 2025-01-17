package MultiThreading;

public class Main_Thread {
    public static void main(String[] args) {

        Company comp=new Company();
        Producer p=new Producer(comp);
        Consumer c=new Consumer(comp);

        p.start();
        c.start();
    }
}

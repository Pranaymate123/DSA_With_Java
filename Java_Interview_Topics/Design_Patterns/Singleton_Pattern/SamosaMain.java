package Java_Interview_Topics.Design_Patterns.Singleton_Pattern;

public class SamosaMain {


    public static void main(String[] args) {
        Samosa samosa1=Samosa.getSamosa();
        Samosa samosa2=Samosa.getSamosa();

        System.out.println("Samosa1 "+ samosa1);
        System.out.println("Samosa2 "+ samosa2);

        System.out.println(samosa1==samosa2);
    }
}

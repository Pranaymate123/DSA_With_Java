package Java_Interview_Topics.Design_Patterns.Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        User user=User.UserBuilder.builder()
                .setUserId("101")
                .setUserName("pranaymate0706")
                .setEmail("pranay@gmail.com")
                .build();


        System.out.println(user);

        User user1=User.UserBuilder
                .builder()
                .setUserId("102")
                .setUserName("pny0342")
                .build();

        System.out.println(user1);
    }
}

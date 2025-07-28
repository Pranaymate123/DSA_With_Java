package Java_Interview_Topics.Design_Patterns.Builder_Pattern;

public class User {

    private String userId;
    private String userName;
    private String email;

    private User(UserBuilder builder)
    {
        //Initialize
        this.userId=builder.userId;
        this.email=builder.email;
        this.userName=builder.userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class UserBuilder
    {
        private String userId;
        private String userName;
        private String email;

        public UserBuilder()
        {

        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public static UserBuilder builder()
        {
            return new UserBuilder();
        }

        public  User build()
        {
            User user=new User(this);
            return user;



        }
    }
}

package Java_Interview_Topics.Java8_Features.Functional_Interfaces.Function_Interface;

public class Student {
    private String name;
    private  String city;

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getStudent() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setStudent(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

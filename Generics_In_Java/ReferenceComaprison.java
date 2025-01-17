package Generics_In_Java;

import java.util.Objects;

class Student {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
public class ReferenceComaprison {
    public static void main(String[] args) {

//        Student stud1=new Student(5,"Raj");
//        Student stud2=new Student(5,"Raj");
//
//        System.out.println(stud1.equals(stud2));

//        System.out.println(stud1.hashCode());
//        System.out.println(stud2.hashCode());
        String str1=new String();
        String str2="Raj";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
    }
}

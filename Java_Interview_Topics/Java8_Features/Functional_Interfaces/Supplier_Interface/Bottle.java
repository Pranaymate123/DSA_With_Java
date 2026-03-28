package Java_Interview_Topics.Java8_Features.Functional_Interfaces.Supplier_Interface;

public class Bottle {

    private String name;
    private String size;

    public Bottle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

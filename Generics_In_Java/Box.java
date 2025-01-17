package Generics_In_Java;

public class Box <T>{
    T container;

    public Box(T container) {
        this.container = container;
    }

    public T getContainer() {
        return container;
    }

    public void setContainer(T container) {
        this.container = container;
    }
}

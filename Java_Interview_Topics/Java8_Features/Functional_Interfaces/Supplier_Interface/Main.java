package Java_Interview_Topics.Java8_Features.Functional_Interfaces.Supplier_Interface;


import java.util.function.Supplier;

/*
 What is Supplier<T>?
        Supplier<T> is a functional interface in java.util.function.

        It represents a supplier of results — a function that returns a value of type T, but takes no input.

        Think of it as:

        “I supply/give you a value when you ask for it.”

✅ Why Use Supplier<T>?
Use Supplier<T> when:

You want to generate or fetch a value without needing any input.

You want to delay the creation of an object or value until it’s actually needed.

You want to provide lazy initialization, default values, or random/dynamic generation.

🔸 Real-World Analogy
Imagine a vending machine. You press a button (no input), and it supplies you a bottle of water.
That’s exactly what a Supplier<T> does — it gives you something when you call get().




 */
public class Main {

    public static void main(String[] args) {

        Supplier<Bottle> getBottleFromMachine= WendingMachine::getBottle;


    }
}

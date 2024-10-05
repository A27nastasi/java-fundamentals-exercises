package com.bobocode.basics;

/**
 * This demo demonstrates why using Object is not safe. Using generics allows us to enforce type safety and
 * avoid runtime exceptions caused by incorrect casting. By parameterizing the {@link Box} class, we can
 * ensure that the correct type is used and invalid assignments will fail at compile time.
 */
public class BoxDemoApp {
    public static void main(String[] args) {
        // Use a Box parameterized with Integer to store only integers
        Box<Integer> intBox = new Box<>(123);
        Box<Integer> intBox2 = new Box<>(321);
        System.out.println((int) intBox.getValue() + intBox2.getValue());

        // Safe to set another integer value
        intBox.setValue(222);

        // Compile-time error: this line will not be allowed because the box expects an Integer, not a String
        // intBox.setValue("abc"); // this will now fail at compile time

        // The following code will not cause any runtime exceptions because the types are enforced at compile time
        System.out.println((int) intBox.getValue() + intBox2.getValue());
}

package com.bobocode.basics;

/**
 * {@link Box} is a container class that can store a value of any given type. Using generics (type "T") is
 * safer because it enforces type checking at compile-time, eliminating the need for runtime casting.
 * <p>
 * todo: Refactored to use generic type "T" and can be verified with {@link com.bobocode.basics.BoxTest}
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

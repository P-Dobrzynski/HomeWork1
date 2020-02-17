package com.sda.structures.stack;

/**
 * Generic stack interface.
 *
 * @param <T> is type of data to be keep on stack
 */
public interface Stack<T> {

    /**
     * Pushes data to the stack.
     *
     * @param data to be pushed
     */
    void push(T data);

    /**
     * Pops data from the stack.
     *
     * @return data
     */
    T pop();

    /**
     * Checks if stack is empty.
     *
     * @return true if empty
     */
    boolean isEmpty();

    /**
     * Peeks top item from the stack.
     *
     * @return top element
     */
    T peek();
}

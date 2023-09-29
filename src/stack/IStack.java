/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author PHT
 * @param <E>: type of stack's elements
 */
public interface IStack<E> {
    int size();
    boolean isEmpty();
    boolean isFull();
    boolean push(E item);
    E pop();
    E top();
}

package queue1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PHT
 */
public interface IQueue<E> {
    int size();
    boolean isEmpty();
    boolean isFull();
    boolean enqueue(E item);
    E dequeue();
    E first();
}

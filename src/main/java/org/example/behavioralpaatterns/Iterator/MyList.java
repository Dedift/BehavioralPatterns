package org.example.behavioralpaatterns.Iterator;

public interface MyList<E> {
    boolean add(E element);

    boolean remove(E element);

    E get(int index);

    E set(int index, E element);

    MyLinkedList<E> subList(int fromIndex, int toIndex);

    int size();
}
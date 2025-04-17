package org.example.behavioralpatterns.Iterator;

import java.util.NoSuchElementException;

public class MyLinkedListIterator<E> {
    private Node<E> current;
    private Node<E> next;
    private Node<E> previous;
    private int nextIndex;
    private int previousIndex;
    private final MyLinkedList<E> list;

    MyLinkedListIterator(MyLinkedList<E> list) {
        this.list = list;
        this.next = list.getFirst();
        this.nextIndex = 0;
        this.previousIndex = -1;
    }

    public boolean hasNext() {
        return this.nextIndex < list.size();
    }

    public boolean hasPrevious() {
        return this.previousIndex >= 0;
    }

    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.current = next;
        this.next = next.next;
        this.previous = current;
        this.nextIndex++;
        this.previousIndex++;
        return this.current.data;
    }

    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.current = previous;
        this.previous = previous.prev;
        this.next = current;
        this.nextIndex--;
        this.previousIndex--;
        return this.current.data;
    }
}
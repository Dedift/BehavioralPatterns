package org.example.behavioralpatterns.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            linkedList.add(i);
        }

        MyLinkedListIterator<Integer> iterator = linkedList.iterator();
        System.out.print("All added elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.print("\nAll added elements in reverse order: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}

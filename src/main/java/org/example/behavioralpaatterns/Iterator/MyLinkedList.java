package org.example.behavioralpatterns.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    @Override
    public boolean add(E element) {
        if (element == null) {
            return false;
        }
        linkLast(element);
        return true;
    }

    @Override
    public boolean remove(E element) {
        if (element == null) {
            return false;
        } else {
            for (Node<E> current = first; current != null; current = current.next) {
                if (element.equals(current.data)) {
                    unlink(current);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        return getNode(index).data;
    }

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> nodeByIndex = getNode(index);
        E oldVal = nodeByIndex.data;
        nodeByIndex.data = element;
        return oldVal;
    }

    @Override
    public MyLinkedList<E> subList(int fromIndex, int toIndex) {
        subListRangeCheck(fromIndex, toIndex, size);
        MyLinkedList<E> subList = new MyLinkedList<>();
        Node<E> currentNode = getNode(fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return subList;
    }

    @Override
    public int size() {
        return size;
    }

    public MyLinkedListIterator<E> iterator() {
        return new MyLinkedListIterator<E>(this);
    }

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }

    private void linkLast(E element) {
        final Node<E> oldLastNode = last;
        final Node<E> newNode = new Node<>(element, oldLastNode, null);
        this.last = newNode;
        if (oldLastNode == null) {
            this.first = newNode;
        } else {
            oldLastNode.next = newNode;
        }
        this.size++;
    }

    private E unlink(Node<E> current) {
        final E element = current.data;
        final Node<E> next = current.next;
        final Node<E> prev = current.prev;

        if (prev == null) {
            this.first = next;
        } else {
            prev.next = next;
            current.prev = null;
        }

        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            current.next = null;
        }

        current.data = null;
        this.size--;
        return element;
    }

    private Node<E> getNode(int index) {
        checkElementIndex(index);
        Node<E> nodeByIndex;
        if (index < (size >> 1)) {
            nodeByIndex = first;
            for (int i = 0; i < index; i++)
                nodeByIndex = nodeByIndex.next;
        } else {
            nodeByIndex = last;
            for (int i = size - 1; i > index; i--)
                nodeByIndex = nodeByIndex.prev;
        }
        return nodeByIndex;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void subListRangeCheck(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0)
            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
        if (toIndex > size)
            throw new IndexOutOfBoundsException("toIndex = " + toIndex);
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
    }
}
package _10_dsa_list.exercise.my_array_list;

import java.util.Arrays;

public class MyArrayList <E> implements Cloneable{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    private void ensureCapacity() {
        if (size>= elements.length) {
            elements = Arrays.copyOf(elements, size * 3 / 2);
        }
    }

    public void add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public int Size() {
        return size;
    }

    public void remove(int index) {
        E[] tmp = (E[]) new Object[size - 1];
        for (int i = 0,j = 0; i < size; i++) {
            if (i != index) {
                tmp[j++] =elements[i];
            }
        }
        size--;
        elements=tmp;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e))
                return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e))
                return i;
        }
        return -1;
    }

    E get(int i) {
        return elements[i];
    }

    void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int size() {
        return size;
    }
}

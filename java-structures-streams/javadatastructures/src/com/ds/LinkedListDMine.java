package com.ds;

public class LinkedListDMine<T> {
    NodeD header;

    public void add(Object value) {
        NodeD n = new NodeD(value, null, null);
        if (header == null) {
            header = n;
        } else {
            n.next = header;
            header = n;
        }

    }

    public void display() {
        NodeD n = header;
        while (n != null) {
            n = n.next;
        }
    }

}

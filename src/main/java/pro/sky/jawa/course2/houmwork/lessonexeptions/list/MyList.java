package pro.sky.jawa.course2.houmwork.lessonexeptions.list;

import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;

public class MyList {
    Node head;
    Node tail;
    int size;

    public boolean add(Employee item) {
        Node newNode = new Node();
        newNode.setItem(item);
        if (tail == null) {
            head = newNode;

        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        return true;
    }

}

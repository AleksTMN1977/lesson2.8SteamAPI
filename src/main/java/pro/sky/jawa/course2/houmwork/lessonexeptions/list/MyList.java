package pro.sky.jawa.course2.houmwork.lessonexeptions.list;

import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;
import pro.sky.jawa.course2.houmwork.lessonexeptions.exception.NotFoundEmployeeException;

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

    public Employee get(int index) {
        if (checkIndex(index)) {
            Node currentNode = getNode(index);
            return currentNode.getItem();
        } else {
            throw new NotFoundEmployeeException();
        }
    }

    private Node getNode(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();

        }
        return currentNode;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    public Employee remove(int index) {
        if (checkIndex(index)) {
            Node deleteNode;
            if (index == 0) {
                deleteNode = head;
                head = head.getNext();
                if (size == 1) {
                    tail = null;
                }
            } else {
                Node prevNode = getNode(index - 1);
                deleteNode = prevNode.getNext();
                Node nextNode = deleteNode.getNext();
                prevNode.setNext(nextNode);
                if (nextNode == null) {
                    tail = prevNode;
                }
            }
            size--;
            return deleteNode.getItem();
        } else {
            throw new NotFoundEmployeeException();
        }
    }

    public int size() {
        return size;
    }
}

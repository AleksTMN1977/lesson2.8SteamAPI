package pro.sky.jawa.course2.houmwork.lessonexeptions.list;

import pro.sky.jawa.course2.houmwork.lessonexeptions.data.Employee;

public class Node {
    Node next;
    Employee item;

    public void setNext(Node next) {
        this.next = next;
    }

    public void setItem(Employee item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public Employee getItem() {
        return item;
    }
}

/* The following program uses a doubly-linked list to print
 * the original contents of a string as well as the string in reverse.
 * A node class was created to handle the characteristics of nodes
 * in the doubly linked list class.
 */

class Node { //doubly linked list node
    char data;
    Node next;
    Node prev;

    public Node(char data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printForward() { //print original starting from head
        Node current = head;
        System.out.print("Original String: ");
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {//print reverse starting from tail
        Node current = tail;
        System.out.print("Reversed String: ");
        while (current != null) {
            System.out.print(current.data);
            current = current.prev;
        }
        System.out.println();
    }
}

public class Sager_Problem2 {
    public static void main(String[] args) {
        String input = "Go Pokes!";
        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 0; i < input.length(); i++) {
            list.insertAtEnd(input.charAt(i));
        }

        list.printForward();
        list.printReverse();
    }
}

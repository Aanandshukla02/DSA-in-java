import java.util.LinkedList;

public class linkedlist {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node  tail;

    public void addfirst(int data){
        Node  newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
    }
}
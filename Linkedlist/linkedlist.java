import java.util.LinkedList;

// Define a class named 'linkedlist'.
public class linkedlist {
    
    // Define a nested static class 'Node' to represent the nodes of the linked list.
    public static class Node {
        int data;
        Node next;
        
        // Constructor to initialize a node with given data.
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Declare variables to represent the head and tail of the linked list.
    public static Node head;
    public static Node tail;

    // Method to add a node with data 'data' at the beginning of the linked list.
    public void addfirst(int data){
        // Create a new node with the given data.
        Node newNode = new Node(data);
        
        // If the list is empty, set both head and tail to the new node.
        if (head == null) {
            head = tail = newNode;
            return;
        } else {
            // Otherwise, attach the new node to the beginning of the list and update the head.
            newNode.next = head;
            head = newNode;
        }
    }
    
    // Method to add a node with data 'data' at the end of the linked list.
    public void addlast(int data){
        // Create a new node with the given data.
        Node newNode = new Node(data);
        
        // If the list is empty, set both head and tail to the new node.
        if (head == null) {
            head = tail = newNode;
            return;
        }
        
        // Otherwise, attach the new node to the end of the list and update the tail.
        tail.next = newNode;
        tail = newNode;
    }
    
    // Method to display the elements of the linked list.
    public void display() {
        // Start from the head of the list.
        Node temp = head;
        
        // Traverse the list and print the data of each node.
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method to test the linked list implementation.
    public static void main(String[] args) {
        // Create an instance of the linked list.
        linkedlist ll = new linkedlist();
        
        // Display the empty list.
        ll.display();
        
        // Add elements to the beginning of the list and display after each addition.
        ll.addfirst(2);
        ll.display();
        ll.addfirst(1);
        ll.display();
        
        // Add elements to the end of the list and display after each addition.
        ll.addlast(3);
        ll.display();
        ll.addlast(4);
        ll.display();
    }
}

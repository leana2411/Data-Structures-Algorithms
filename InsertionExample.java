import java.util.*;
// Leana Kumari 22csu106

public class InsertionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            linkedList.insertAtEnd(element);
        }

System.out.println("Linked List:");
    linkedList.display();

     System.out.println("Enter position at which you want to enter : ");
    int a = scanner.nextInt();

        if(a==1){

 System.out.print("Enter the element to insert at the beginning: ");
     int elementAtBeginning = scanner.nextInt();

     linkedList.insertAtBeginning(elementAtBeginning);
 }

     else if (a==(n-1)){

   System.out.print("Enter the element to insert at the end: ");
    int elementAtEnd = scanner.nextInt();

        linkedList.insertAtEnd(elementAtEnd);
    }
    else{
 
 System.out.print("Enter the element to insert: ");
     int elementToInsert = scanner.nextInt();
      int positionToInsert=a;
        linkedList.insertAtLocation(elementToInsert, positionToInsert);
    }

        System.out.println("Updated Linked List:");
        linkedList.display();

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

 
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void insertAtLocation(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
     }
 Node newNode = new Node(data);
  Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
      System.out.println("Invalid position");
            
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void display() {
   Node current = head;
        while (current != null) {
    System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
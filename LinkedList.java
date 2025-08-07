// Program for singly linked list
package my_package;

import java.util.Scanner;

//Node class
class Node {
 int data;
 Node next;

 Node(int value) {
     data = value;
     next = null;
 }
}

//LinkedList class
public class LinkedList {
 Node head;

 // Insert at end
 public void insert(int value) {
     Node newNode = new Node(value);

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

 // Display the list
 public void display() {
     Node current = head;

     if (current == null) {
         System.out.println("List is empty.");
         return;
     }

     System.out.print("Linked List: ");
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }

     System.out.println("null");
 }

 // Delete by value
 public void delete(int value) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     if (head.data == value) {
         head = head.next;
         System.out.println("Deleted " + value);
         return;
     }

     Node current = head;
     while (current.next != null && current.next.data != value) {
         current = current.next;
     }

     if (current.next == null) {
         System.out.println("Value not found.");
     } else {
         current.next = current.next.next;
         System.out.println("Deleted " + value);
     }
 }

 // Main method
 public static void main(String[] args) {
     LinkedList list = new LinkedList();
     Scanner scanner = new Scanner(System.in);

     int choice;
     do {
         System.out.println("\n--- Linked List Menu ---");
         System.out.println("1. Insert");
         System.out.println("2. Delete");
         System.out.println("3. Display");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter value to insert: ");
                 int value = scanner.nextInt();
                 list.insert(value);
                 break;

             case 2:
                 System.out.print("Enter value to delete: ");
                 int del = scanner.nextInt();
                 list.delete(del);
                 break;

             case 3:
                 list.display();
                 break;

             case 4:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
         }
     } while (choice != 4);

     scanner.close();
 }
}


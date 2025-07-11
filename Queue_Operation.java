// Program for queue operations using array.

package my_package;
import java.util.Scanner;
public class Queue_Operation {

    int size;
    int front, rear;
    int[] queue;

    // Constructor
    public Queue_Operation(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue method
    public void enqueue(int data) 
    {
        if(rear==size-1) 
        {
            System.out.println("Queue is full.");
            return;
        }
        if(front==-1) 
        front = 0;
        queue[++rear] = data;
        System.out.println(data + " added to the queue.");
    }

    // Dequeue method
    public void dequeue() 
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println(queue[front++] + " removed from the queue.");
    }

    // Display method
    public void display() 
    {
        if(front== 1 || front>rear) 
        {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for(int i=front; i<=rear; i++) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        int n = sc.nextInt();

        Queue_Operation q = new Queue_Operation(n);
        int choice, value;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

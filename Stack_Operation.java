package my_package;

import java.util.Scanner;

public class Stack_Operation {

    int top;
    int size;
    int[] stack;

    // Constructor
    Stack_Operation(int size) 
    {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    void pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack Underflow");
        } 
        else 
        {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    // Peek operation
    void peek() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty");
        } 
        else 
        {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Display stack
    void display() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is empty");
        } 
        else 
        {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) 
            {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack_Operation s = new Stack_Operation(5); // Stack of size 5

        while (true) {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

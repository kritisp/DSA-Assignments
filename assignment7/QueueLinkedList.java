
import java.util.Scanner;

class Node {

    int info;
    Node next;
}

public class QueueLinkedList {

    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        Node cn = new Node();
        System.out.println("Enter info:");
        cn.info = sc.nextInt();
        cn.next = null;
        if (rear == null) {
            rear = cn;
            front = cn;
        } else {
            rear.next = cn;
            rear = cn;
        }
        return rear;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is Empty.");
            
        } else {
            System.out.println("Deleted info is: " + front.info);
            front = front.next;
        }
        return front;
    }

    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is Empty. ");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node front = null;
        Node rear = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("....Menu Driven Method....");
            System.out.println("0. Exit.");
            System.out.println("1.Insert.");
            System.out.println("2.Delete.");
            System.out.println("3.Display.");
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    System.exit(0);
                case 1:
                    rear = insert(rear, front);
                     if (front == null) {
                        front = rear;
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                     if (front == null) {
                        front = rear;
                     }
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

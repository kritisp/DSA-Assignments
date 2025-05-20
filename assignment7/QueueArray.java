import java.util.Scanner;
public class QueueArray {
	public static final int MAX=5;
	public static int front=-1;
	public static int rear=-1;
	static Scanner sc=new Scanner(System.in);
	public static boolean isEmpty() {
		return front==-1||front>rear||rear==-1;
		}
	public static boolean isFull() {
		return rear==MAX-1;
	}
	public static void insert(int[]Q) {
		if(isFull()) {
			System.out.println("Queue Overflow");
			return;
		}
		if(front==-1)
			front=0;
		System.out.println("Enter data to insert");
		Q[++rear]=sc.nextInt();
		System.out.println("Data inserted.");
	}
	public static void delete(int[]Q) {
		if(isEmpty()) {
			System.out.println("Queue underflow");
			return;
		}
		System.out.println("Deleted data:"+ Q[front]);
		if(front==rear) {
			front=rear=-1;
		}
		else {
			front++;
		}
			}
	public static void display(int[]Q) {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("Queue elements are:");
		for(int i=front;i<=rear;i++) {
			System.out.print(Q[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] queue=new int[MAX];
		while(true) {
			System.out.println("....Menu Driven Method....");
			System.out.println("0. Exit.");
			System.out.println("1.Insert.");
			System.out.println("2.Delete.");
			System.out.println("3.Display.");
			System.out.println("Enter Your Choice");
		 int ch=sc.nextInt();
		switch(ch) {
		case 0:
			System.exit(0);
		case 1:
			insert(queue);
			break;
		case 2:
			delete(queue);
			break;
		case 3:
			display(queue);
			break;
		default:
			System.out.println("Invalid Choice.");
		}
	}
	}
}

import java.util.Scanner;
class Node{
	int info;
	Node next;
}
public class StackLinkedList {
	static Scanner sc=new Scanner(System.in);
	public static Node push(Node top) {
		Node cn=new Node();
		System.out.println("Enter data to push:");
		cn.info=sc.nextInt();
		if(top==null) {
			top=cn;
		}
		else {
			cn.next=top;
			top=cn;
		}
		return top;
	}
	public static Node pop(Node top) {
		if(top==null) {
			System.out.println("Stack underflow");
		}
		else {
		System.out.println("The popped item is "+top.info);
		top=top.next;
	}
		return top;
		}
	public static void display(Node top) {
		if(top==null) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.print("Stack elements are:");
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.info);
			if(temp.next!=null) {
				System.out.print("-->");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node top=null;
		 while(true)
		 {
		 System.out.println("****MENU****");
		 System.out.println("0:Exit");
		 System.out.println("1:Push");
		 System.out.println("2:Pop");
		 System.out.println("3:Display");
		 System.out.println("Enter your choice");
		 int ch=sc.nextInt();
		 switch(ch)
		 {
		 case 0:
			 System.exit(0);
		 case 1:
			 top=push(top);
			 break;
		 case 2:
			 top=pop(top);
			 break;
		 case 3:
			 display(top);
			 break;
		default:
		 System.out.println("Wrong choice");
		 }
		 }
	}

}

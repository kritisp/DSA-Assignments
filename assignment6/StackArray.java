
import java.util.Scanner;
public class StackArray {
    static Scanner sc = new Scanner(System.in);
	public static final int MAX=10;
	public static boolean isEmpty(int top) {
		return top==-1;
	}
	public static boolean isFull(int top) {
		return top==MAX-1;
	}
	public static int push(int S[],int top) {
		if(isFull(top)) {
			System.out.println("Stack Overflow");
		}
		else {
			System.out.println("Enter data to insert:");
			int x=sc.nextInt();
			S[++top]=x;
		}
		return top;
	}
	public static int pop(int[]S,int top) {
		if(isEmpty(top)) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println("The popped item is "+S[top--]);
		}
		return top;
	}
	public static void display(int[]S,int top) {
		if(isEmpty(top)) {
			System.out.println("Stack is Empty.");
		    return;
		    }
		System.out.print("The Stack Elements are:");
		for (int i=top;i>=0;i--) {
			System.out.print(S[i]+" ");
		}
	}
    public static void main(String[] args) {
        int Stack[]=new int[MAX];
		int top=-1;
		while(true) {
			System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch) {
            case 0:
            	System.exit(0);
            case 1:
            	top=push(Stack,top);
                break;
            case 2:
            	top=pop(Stack,top);
            	break;
            case 3:
            	display(Stack,top);
            	break;
            default :
            	System.out.println("Invalid Choice."); 
            	
            	
            }
		}

}
}

import java.util.Scanner;
class Node{
protected int regd_no;
protected float mark;
protected Node  next;
protected Node prev;
}
public class DoublyLinkedList {
	static Scanner sc=new Scanner(System.in);
	 public static Node create(Node start, Node end) {
		System.out.println("Enter Regn no. and mark:");
		start.regd_no=sc.nextInt();
		start.mark=sc.nextFloat();
		Node temp=start;
		System.out.println("Do you want more nodes(y/n):");
		char ch=sc.next().charAt(0);
		while(ch!='n') {
			Node cn=new Node();
			System.out.println("Enter Regn no. and mark:");
			cn.regd_no=sc.nextInt();
			cn.mark=sc.nextFloat();
			temp.next=cn;	
			cn.prev=temp;
			end=cn;
			temp=temp.next;
			System.out.println("Do you want more nodes(y/n):");
			ch=sc.next().charAt(0);
		}
		return end;
	 }
	 public static Node insBeg(Node start, Node end) {
		    Node cn=new Node();
			System.out.println("Enter Regn no. and mark:");
			cn.regd_no=sc.nextInt();
			cn.mark=sc.nextFloat();
			if(start==null) {
				start=cn;
				end=start;
				return start;
			}
			cn.prev=null;
			cn.next=start;
			start.prev=cn;
			start=cn;
			return start;
	 }
	 public static Node insEnd(Node start, Node end) {
		    Node cn=new Node();
			System.out.println("Enter Regn no. and mark:");
			cn.regd_no=sc.nextInt();
			cn.mark=sc.nextFloat();
			if(start==null) {
				start=cn;
				end=start;
				return start;
			}
			cn.next=null;
			end.next=cn;
			cn.prev=end;
			end=cn;
			return end;
	 }
	 public static Node insAny(Node start, Node end,int pos) {
		    Node cn=new Node();
			System.out.println("Enter Regn no. and mark:");
			cn.regd_no=sc.nextInt();
			cn.mark=sc.nextFloat();
			
			if(pos==1) {
				cn.prev=null;
				cn.next=start;
				start.prev=cn;
				start=cn;
				return start;
			}
            else if(pos==count(start,end)+1) {
                cn.next=null;
                end.next=cn;
                cn.prev=end;
                end=cn;
                return end;
            }

            else{
			Node temp=start,pre=null;
			int i=1;
			while(temp!=null && i<pos) {
				pre=temp;
				temp=temp.next;
				i++;
			}
			 if (i!=pos) {
		            System.out.println("Invalid Position.");
		        } 
			 else {
			pre.next=cn;
			cn.prev=pre;
			cn.next=temp;
			if(temp!=null)
			temp.prev=cn;
			 }
			return start;
     }
	 }
	 public static Node delBeg(Node start, Node end) {
		 if (start==null) {
			 System.out.println("List is empty.");
		 }
		 else if(start.next==null) {
			 start=null;
		 }
		 else {
			 start=start.next;
			 start.prev=null;
		 }
		 return start;
	 }
	 public static Node delEnd(Node start, Node end) {
		 if (start==null) {
			 System.out.println("List is empty.");
		 }
		 else if(start.next==null) {
			 start=null;
			 end=start;
		 }
		 else {
			 end=end.prev;
			 end.next=null;
		 }
		 return end;
	 }
	 public static Node delAny(Node start, Node end) {
		 System.out.println("Enter position to delete:");
		 int pos=sc.nextInt();
		 if(pos==1) {
			start=start.next;
			start.prev=null;
			return start;
		}
		 Node temp=start,pre=null;
			int i=1;
			while(temp!=null && i<pos) {
				pre=temp;
				temp=temp.next;
				i++;
			} if (i!=pos) {
	            System.out.println("Invalid Position.");
	        }
			else {
			pre.next=temp.next;
			if(temp.next!=null) {
			temp.next.prev=pre;
			}
			}
		 return start;
	 }
	 public static void search(Node start,Node end) {
		 if(start==null) {
			 System.out.println("List is Empty.");
			 return;
		 }
		 System.out.println("Enter regd_no to search:");
		 int r=sc.nextInt();
		 Node temp=start;
		 int pos=1;
		 while(temp!=null) {
			 if(temp.regd_no==r) {
				 System.out.println("Student found at position "+pos);
				 System.out.println("Regd_No."+temp.regd_no+"current mark:"+temp.mark);
				 System.out.println("Enter marks to update:");
				 temp.regd_no=sc.nextInt();
				 return;
			 }
			 temp=temp.next;
			 pos++;
		 }
		 System.out.println("Student not found.");
	 }
	 public static void display(Node start, Node end) {
		 if(start==null) {
			 System.out.println("List is empty");
			 return;
			 }
		 System.out.println("List in forward direction-");
		 Node temp=start;
		 while(temp!=null) {
			 System.out.println("Regd_No.-"+temp.regd_no+" Mark-"+temp.mark);
			 temp=temp.next;
		 }
		 System.out.println("List in backward direction-");
		 temp=end;
		 while(temp!=null) {
			 System.out.println("Regd_No.-"+temp.regd_no+" Mark-"+temp.mark);
			 temp=temp.prev;
		 }
	 }
     public static int count(Node start, Node end) {
            if(start==null) {
                System.out.println("List is empty");
                return 0;
            }
            int c=0;
            Node temp=start;
            while(temp!=null) {
                c++;
                temp=temp.next;
            }
            return c;
     }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
 	   Node start=new Node();
 	   Node end=new Node();
 	    System.out.println("----- MENU DRIVEN PROGRAM -----");

 	    while (true) {
 	        System.out.println("\n----- MENU -----");
 	        System.out.println("0. Create List (Insert Multiple Nodes)");
 	        System.out.println("1. Insert at Beginning");
 	        System.out.println("2. Insert at End");
 	        System.out.println("3. Insert at Any Position");
 	        System.out.println("4. Delete from Beginning");
 	        System.out.println("5. Delete from End");
 	        System.out.println("6. Delete from Any Position");
 	        System.out.println("7. Search and Update");
 	        System.out.println("8. Display");  
 	        System.out.println("9. Exit");
 	        System.out.print("Enter your choice: ");
 	        int choice = sc.nextInt();

 	        switch (choice) {
 	            case 0:
 	                end = create(start,end); 
 	                break;
 	            case 1:
 	                start = insBeg(start,end);
 	                break;
 	            case 2:
 	                end = insEnd(start,end);
 	                break;
 	            case 3:
                System.out.println("Enter position to insert:");
                int pos = sc.nextInt();
                if (pos==count(start, end)+1) {
                    end = insAny(start, end,pos);
                }
                else{
 	                start = insAny(start,end,pos);
                }       
 	                break;
 	            case 4:
 	                start = delBeg(start,end);
 	                break;
 	            case 5:
 	                end = delEnd(start,end); 
 	                break;
 	            case 6:
 	                start = delAny(start,end);
 	                break;
                case 7:
                    search(start,end);
                    break;      
 	            case 8:
 	                display(start,end);
 	                break;

 	            case 9:
 	                System.out.println("Exiting...");
 	                System.exit(0);
 	            default:
 	                System.out.println("Invalid Choice. Please try again.");
 	        }
 	    }
	}

}

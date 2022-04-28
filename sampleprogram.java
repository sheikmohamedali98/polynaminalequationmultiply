package incupation;

import java.util.Scanner;

public class sampleprogram {
	 static class Node{
		Node next;
		int coeff,power;
		};//linked list creat
		static Node addnode(Node start,int coeff, int power){
			Node Newnode=new Node();
			Newnode.coeff=coeff;
			Newnode.power=power;
			Newnode.next=null;
			if(start==null)
				return Newnode;
			Node ptr=start;
			while(ptr.next!=null)
				ptr=ptr.next;
			
				ptr.next=Newnode;
				return start;
		}
		static void printList(Node ptr){
			while(ptr.next!=null){
				System.out.print(ptr.coeff+"x^"+ptr.power+"+");
				ptr=ptr.next;
				
			}
			System.out.print(ptr.coeff);
			System.out.println();
			
		}
		
		static void removeDublicate(Node start){
			
			Node ptr1,ptr2,dup;
			ptr1=start;//select one by one element
			while(ptr1!=null&&ptr1.next!=null){
				ptr2=ptr1;
			while(ptr2.next!=null){
				if(ptr1.power==ptr2.next.power){//power of two element same
					ptr1.coeff=ptr1.coeff*ptr2.next.coeff;
					dup=ptr2.next;
					ptr2.next=ptr2.next.next;
				}
				else
					ptr2=ptr2.next;
			}
			ptr1=ptr1.next;
			}
		}
		static Node multiply(Node poly1,Node poly2,Node poly3){
			Node ptr1,ptr2;
			ptr1=poly1;
			ptr2=poly2;
			while(ptr1!=null){
				while(ptr2!=null){
					int coeff,power;
					coeff=ptr1.coeff*ptr2.coeff;
					power=ptr1.power+ptr2.power;
					if(power==0){
						
					}
					poly3=addnode(poly3,coeff,power);
					ptr2=ptr2.next;
					}
				ptr2=poly2;
				ptr1=ptr1.next;
				}
			removeDublicate(poly3);
			return poly3;
			}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
Node poly1=null,poly2=null,poly3=null;
poly1=addnode(poly1,3,2);
poly1=addnode(poly1,5,1);
poly1=addnode(poly1,6,0);

poly2=addnode(poly2,6,1);
poly2=addnode(poly2,8,0);
System.out.println("1st polinaminal");

printList(poly1);
System.out.println("2st polinaminal");
printList(poly2);

poly3=multiply(poly1,poly2,poly3);
System.out.println("result");
printList(poly3);

	}

}

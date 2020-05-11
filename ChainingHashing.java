import java.util.*;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class ChainingHashing{
	public static void main(String[] args){
		Node a[]=new Node[10];
		for(int i=0;i<10;i++)
			a[i]=null;
		
		Insert(a,12);
		Insert(a,12);
		Insert(a,12);
		for(int i=0;i<10;i++)
			System.out.println(a[i]);
	}
	static void Insert(Node a[],int key){
		int index=hash(key);
		LinkedList l=new LinkedList();
		a[index]=l;
		l.insert(a[index],key);
	}
	static int hash(int key){
		return key%10;
	}
}
//Linked List
class LinkedList{
	//Insert Function
	public void insert(Node head,int key){
		Node n=head;
		Node node=new Node(key);
		Node q=null;
		while((n!=null) && (n.data<key)){
			q=n;
			n=n.next;
		}
		if(n==head){
			node.next=head;
			head=node;	
		}else{
			node.next=q.next;
			q.next=node;
		}
		Node root
	}
}

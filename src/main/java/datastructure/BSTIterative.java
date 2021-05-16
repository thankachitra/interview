package datastructure;

import java.util.Stack;

public class BSTIterative {

	Node root;
	public class Node
	{
		int key;
		Node left, right;
		Node(int key)
		{
			this.key=key;
			
		}
		
	}
	BSTIterative()
	{
		root=null;
	}
	BSTIterative(int key)
	{
		root =new Node(key);
	}
	
	public Node insert(Node root,int key)
	{
		if (root==null)
		{
		root=new Node(key); return root; 
		}
		
		else if (key<root.key)
		{
			root.left= insert(root.left,key);

		}
		else if (key>root.key)
		{
			root.right= insert(root.right,key);

		}
		return root;
	}
	
	public void insertRec(int key)
	{
		insert(root,key);
		
	}
	public void printInorder(Node root)
	{
		
		if (root!=null)
		{
			printInorder(root.left);
			System.out.println(root.key);
			printInorder(root.right);
		}
	}
	public void printIterative(Node root)
	{
		
		Stack<Node> s= new Stack<Node>();
		
		Node current =root;
		
		while (current!=null || !s.isEmpty())
		{
			
			while (current!=null)
			{
					s.push(current);
					current=current.left;
				
			}
			current=s.pop();
			System.out.println ("   "+current.key);
			current=current.right;
			}
		
		}
		
		
		
	
	public static void main(String a[])
	{
		BSTIterative bst =new BSTIterative(120);
		//bst.root=bst.new Node(124);
		bst.insertRec(60);
		bst.insertRec(40);
		
		bst.insertRec(001);
		bst.insertRec(420);
		bst.insertRec(567);
		bst.insertRec(23);
		bst.printInorder(bst.root);
		bst.printIterative(bst.root);
	}
}

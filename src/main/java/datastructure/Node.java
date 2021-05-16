package datastructure;

public class Node {
	
	int key;
	Node left;
	Node right;
	Node (int val)
	{
		key=val;
		left=null;
		right=null;
	}
	
	Node (Node n)
	{
		this.key=n.key;
		this.left=n.left;
		this.right=n.right;
	}
		
	Node(int val, Node left_node,Node right_node)
	{
		key=val;
		left=left_node;
		right=right_node;
	}
}

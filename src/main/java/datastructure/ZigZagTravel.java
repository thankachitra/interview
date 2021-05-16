package datastructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class ZigZagTravel {

	Node node;
	

	public static void main(String a[]) throws IOException
	{
		int nodes_count;
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("input your tree data");
		System.out.println("input no. of nodes >0 and <20000");
		//Scanner scanner = new Scanner(System.in);	
		
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		while (true)
		{
		//  nodes_count=scanner.nextInt();
			 nodes_count=Integer.parseInt(scanner.readLine());
			if (nodes_count<=0||nodes_count>=20000)
			{
				System.out.println("invalid count. please enter below 20000");
			}
			else
				break;
			
		}
		
		int inputnodes_count=0;
		Integer  node_key;
	
		while(inputnodes_count<nodes_count)
		{
			String a1=scanner.readLine();
			if (a1.isEmpty() )
				node_key=null;
			else
			 node_key=Integer.parseInt(a1);
		
				list.add(inputnodes_count, node_key);
				inputnodes_count++;
		}
		System.out.println("pre order tree");
		System.out.println(list);
		scanner.close();
		
		BinarySearchTree tree=new BinarySearchTree(3);
		
		tree.root.left=new Node(9);
		tree.root.right=new Node(20);
		tree.root.right.left=new Node(15);
		tree.root.right.right=new Node(7);
		
		ZigZagTravel travel=new ZigZagTravel();
		travel.zigzagTravel(tree.root);
				
		
	}	
	int level=1;
	public  void zigzagTravel(Node root)
	{
		Node leftNode=null,rightNode=null;
		if (root !=null)
			System.out.println(root.key);
		while(true)
		{
		
			if (root.right!=null) {
				rightNode=new Node(root.right);}
			if (root.left!=null) {
				leftNode=new  Node(root.left);}
		
		
		if (root !=null && level%2!=0) {
			if (rightNode!=null) {
			System.out.println(rightNode.key);}
			if (leftNode!=null) {
				
			System.out.println(leftNode.key);
			root=leftNode;}
			
			
		}	
		else if (root !=null && level%2==0) { 
			if (leftNode!=null) {
			System.out.println(leftNode);}
			if (rightNode!=null) {
			System.out.println(rightNode);
			root=rightNode;}
			
		
		}	
		level++;
			
	}
		
}
}

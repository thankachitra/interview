package datastructure;

public class BinarySearchTree {
	
	
	Node root;
	int key;
	BinarySearchTree(int val)
	{
		this.root=new Node(val);
	}
	
	BinarySearchTree()
	{
		root=null;
	}
	
	public  static void searchRec(Node root,int key)
	{
		
		if  (root==null)
		{
			root=new Node(key);
		}
		else if (root!=null && key<root.key)
		{
			root=root.left;
			search(root,key);
		}
	
		else if (root!=null && key>root.key)
		{
			root=root.right;
			search(root,key);
		}
		else {
				System.out.println("keynot  found");	
			}
		
	}
	public static void search(Node node,int key)
	{
		
		if (node.key==key) {
			System.out.println("key found");
		}
		
	}
	public static void main(String a[])
	{
	
		BinarySearchTree tree=new BinarySearchTree(10);
		tree.root =new Node(10);
		
		tree.root.left =new Node(8);

		tree.root.right =new Node(16);

		tree.root.left.left =new Node(4);
		tree.root.left.right =new Node(9);

		
		tree.root.right.left =new Node(14);
		tree.root.right.right =new Node(17);

		searchRec(tree.root,9);

	}

}

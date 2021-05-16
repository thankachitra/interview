package datastructure;

public class BST {
	
	Node root;
	public class Node
	{
		Node left ,right;
		int key;
	
	Node(int key)
	{
		this.key=key;
	}
	}
	
	public BST() {root=null;}
	public void insert(int key)
	{
		
		insertRec(root, key);
		
	}
	
	public Node insertRec(Node root, int key)
	{
		
		if (root==null) {
				root =new Node(key);
				return root;}
		else if (key<root.key)
			root.left=insertRec(root.left,key);
		else if (key>root.key)
			root.right=insertRec(root.right,key);
		return root;
	}
	public  void inorder(Node root)
	{
		if (root!=null)
		{
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);

		}
	}
	
	public  void preorder(Node root)
	{
		if (root!=null)
		{
			System.out.println(root.key);
			preorder(root.left);
			
			preorder(root.right);

		}
	}
	
	public  void postorder(Node root)
	{
		if (root!=null)
		{
			
			preorder(root.left);
				preorder(root.right);
			System.out.println(root.key);
		}
	}
	
	public static void main(String a[])
	{
		
		BST bst =new BST();
		bst.root=bst.new Node(80);
	//	bst.insert(50);
		bst.insert(40);
		bst.insert(60);
		bst.insert(20);
		bst.insert(100);
		bst.inorder(bst.root);
		System.out.println("adfasDF");
		bst.preorder(bst.root);
		System.out.println("adfasDF");
		bst.postorder(bst.root);
	}
		
}

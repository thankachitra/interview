package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	
	public static class Node
	{
		
		/* commentin */
		int data;
		boolean visited;
		ArrayList<Node> neighbours;
		Node(int data)
		{
			this.data=data;
			this.neighbours =new ArrayList<Node>();
			
		}
		void setVisited(boolean visited )
		{
			this.visited=visited;
		}
		void addNeighhours(Node a)
		
		{
			neighbours.add(a);
		}
		
	}
	/*public static void BFS_search(Node start)
	{
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(start);
		start.visited=true;
		
		while (!q.isEmpty())
		{
		
		Node n=q.remove();
		
			System.out.print("  "+n.data);
		
		ArrayList<Node> list =n.neighbours;
		Iterator<Node> it =list.iterator();
		while (it.hasNext())
		{
			Node temp=it.next();
			 if(temp!=null && !temp.visited)
             {
				 temp.visited=true;
					q.add(temp); 
             }
			
		}		
		}
		
	}*/
	
	public static void bfs(Node node)
    {
		
		Queue<Node> queue=new LinkedList<Node>();

    
        queue.add(node);
        node.visited=true;
        while (!queue.isEmpty())
        {
 
            Node element=queue.remove();
            System.out.print(element.data + "t");
            List<Node> neighbours=element.neighbours;
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    queue.add(n);
                    n.visited=true;
 
                }
            }
 
        }
        
    }
	public static void main(String a[])
	{
		Node node0=new Node(0);		
		Node node1=new Node(1);
		Node node3=new Node(3);
		Node node8=new Node(8);
		Node node4=new Node(4);
		Node node2=new Node(2);
		Node node7=new Node(7);
		Node node5=new Node(5);
		Node node6=new Node(6);
		
		node0.addNeighhours(node1);
		node0.addNeighhours(node3);
		node0.addNeighhours(node8);
		
		node1.addNeighhours(node7);
		
		node3.addNeighhours(node0);
		node3.addNeighhours(node4);
		node3.addNeighhours(node2);
		
		
		node8.addNeighhours(node4);
		node8.addNeighhours(node0);
		
		
		node7.addNeighhours(node1);
		node7.addNeighhours(node2);
		
		
		node4.addNeighhours(node8);
		node4.addNeighhours(node3);
		
		
		node2.addNeighhours(node5);
		node2.addNeighhours(node3);
		node2.addNeighhours(node7);
		node2.addNeighhours(node4);
		
		node5.addNeighhours(node2);
		node5.addNeighhours(node6);
		
		ArrayList<Node> list =node0.neighbours;
		
		Iterator<Node> it =list.iterator();
		
				while (it.hasNext())
				{
			//		System.out.println(it.next().data);
				}

			//	bfs(node0);
		}
	
		
	
	
}

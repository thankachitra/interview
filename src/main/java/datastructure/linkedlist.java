package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {

	public static void main(String a[])
	{
		LinkedList<String>  list=new LinkedList<>();
		
		list.add("chitra");
		list.add("muthu");
		list.add(1,"äbinaya");
		list.add("pranavi");
		System.out.println("list" +list);
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.add(1);
		q.add(3);
		q.add(10);
		int temp=q.peek();
		q.poll();
		System.out.println("temp " +temp + "q "+q);
		
		Iterator<Integer> it=q.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
	}
}

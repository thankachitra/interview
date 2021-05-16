package datastructure;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String a[])
	{
		
		System.out.println("äaaa");
		Scanner stream = new Scanner(System.in);	
		String input =stream.nextLine();
		int count;
		HashMap<Character,Integer> map= new HashMap<Character, Integer>();
		for(Character c:input.toCharArray())
		{
			if (map.containsKey(c))
			
				map.put(c,map.get(c)+1);
			
			else
				map.put(c, 1);
		}
		
	
		for (Character b:map.keySet())
		{
			int value=map.get(b);
			if (value>1)
			{			System.out.println("first non repeating character " +b +" "+value);
						break;
				}
			
		}
			
		
}
}

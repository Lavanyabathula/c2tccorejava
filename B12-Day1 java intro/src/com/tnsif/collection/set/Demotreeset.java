package com.tnsif.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Demotreeset {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		
	hs.add(20);
	hs.add(9);
	hs.add(13);
	hs.add(30);
	hs.add(10);
	System.out.println("Returning data in hashset");
	for(Integer s:hs)
    {
 	   System.out.println(s);
    }	
	System.out.println("Returning data using Treeset");

       TreeSet<Integer> ts=new TreeSet(hs);
       for(Integer s:ts)
       {
    	   System.out.println(s);
       }

	}

}

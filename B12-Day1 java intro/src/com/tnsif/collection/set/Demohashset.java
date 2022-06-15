package com.tnsif.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Demohashset {

	public static void main(String[] args) 
	{
  HashSet<Integer> hs=new HashSet<Integer>();
  hs.add(20);
  hs.add(10);
  hs.add(30);
  hs.add(40);
  hs.add(50);
  System.out.println("using advanced forloop: ");
  for(int s:hs)
  {
	  
	  System.out.println(s);
  }
  Iterator<Integer> it=hs.iterator();
  System.out.println("using iterator");
  while(it.hasNext())
  {
	  

	  System.out.println(it.next());

  }
  System.out.println("after delete ");
  hs.clear();
  for(int s:hs)
  {
	  
	  System.out.println(s);
	}
	}
}

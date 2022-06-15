package com.tnsif.demo;

//default,public,private,protected
public class Access1 
{
   public int i=10; //default
    
    public void show()
    {
    	System.out.println("Am in access1 class");
    }
    private void display()
    {
    	System.out.println("Am private");
    }
    protected void print()
    {
    	System.out.println("am protected in access1 class");
    }
}

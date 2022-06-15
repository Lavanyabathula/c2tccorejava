package com.tnsif.scannerbuffer;

import java.util.Scanner;

//scanner will scan character wise(1kb)
public class InputDemo {

	public static void main(String[] args)
	{
       Scanner scr=new Scanner(System.in);
       String x;
       System.out.println("Please enter a value");
       x=scr.nextLine();
       System.out.println("The entered value is"+x);

	}

}

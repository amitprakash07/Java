package com.amit.utils;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		/*BST b = new BST();
		int [] values = {7,5,3,4,21,9,25};
		
		for(int temp:values)
			b.add(temp);
		
		BST c = new BST();
		int [] newvalues = {7,5,3,4,21,9,25};
		
		for(int temp:newvalues)
			c.add(temp);
		
		Stack<BST> s= new Stack<BST>();
		
		s.push(b);
		s.push(c);
		
		s.reserve(50);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		int a[] = {1,2,3};
		
		char name[] = {'a','m','i','t'};
		String name1= "Amit";
		for(int i=0;i<name1.length();i++)
			name[i] = name1.charAt(i);
		
		System.out.println(System.getProperty("user.dir"));
		
		Scanner s = new Scanner(new File(System.getProperty("user.dir") + "\\resource\\Word.txt"));
		ArrayList<String> a= new ArrayList<String>();
		
		while(s.hasNextLine())
		{
			String []newString = s.nextLine().split("\\s+");
				for(String temp:newString)
					a.add(temp);
		}
			
		for(String temp:a)
			System.out.println(temp);
		
		
		s.close();*/
		
		/*
	       "/a/b"

	       "/x/y/z" -> "/x/y/z"
	       "./x/y/z" -> "/a/b/x/y/z"
	       "x/y/z"   -> "/a/b/x/y/z"
	       "x/../../z" ->  "/a/z"
	       "/a/x/./././///z" -> "/a/x/z"
	       */
		
		Path p = new Path("/a/b");
		System.out.println(p.cd("x/y/z"));
		
		
		
		
	}

}

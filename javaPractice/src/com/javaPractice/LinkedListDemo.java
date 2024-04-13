package com.javaPractice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	   System.out.println("Start");
	   
          LinkedList ll=new LinkedList();
          ll.add("One");
          ll.add("Two");
          ll.add("Three");
          ll.add("Four");
          System.out.println(ll);
          
          ll.removeFirst();
          System.out.println(ll);
          
          ll.removeLast();
          System.out.println(ll);
          
	   System.out.println("Stop");
	}

}

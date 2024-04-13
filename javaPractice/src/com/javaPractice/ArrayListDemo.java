package com.javaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("Start");
        ArrayList al=new ArrayList();
        al.add("Mango");
        al.add("Banana");
        al.add("Guava");
        
        
        ArrayList al1=new ArrayList();
        al1.add("Superman");
        al1.add("BatMan");
        al1.add("Spiderman");
        
        al1.addAll(al);
        
        System.out.println("Add all: "+al1);
        // SBS 
        al1.removeAll(al);
        System.out.println("Remove all: "+al1);
        
        
	}

}

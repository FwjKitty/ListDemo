package com.hand.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
	
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");
		lists.add("f");
		Iterator<String> iter = lists.iterator();
		while(iter.hasNext()){
			//lists.remove(2);
			System.out.println(iter.next());
		}
	}
	/**
	 * list set
	 * 
	 */
}
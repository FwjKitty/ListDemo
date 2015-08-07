package com.hand.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo01 {

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
			String str = iter.next();
			if("a".equals(str)){
				iter.remove();
			}else{
				System.out.println(str);
			}
		}
	}
	/**
	 * list set
	 * 
	 */
}
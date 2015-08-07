package com.hand.ListDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
	public static void main(String[] args) {
		Set<String> s = null;
		//无序
		s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		s.add("g");
		s.add("c");
		s.add("d");
		s.add("e");
		System.out.println(s);
		
		//有序
		s = new TreeSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		s.add("g");
		s.add("c");
		s.add("d");
		s.add("e");
		System.out.println(s);
	}
}

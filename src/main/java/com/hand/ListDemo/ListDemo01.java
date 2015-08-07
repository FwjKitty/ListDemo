package com.hand.ListDemo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ListDemo01 {

	public static void main(String[] args) {
		List<String> lists = null;
		lists = new ArrayList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("a");
		
		//遍历list集合
		/*for(String str : lists){
			System.out.println(str);
		}*/
		for(int i=0; i<lists.size(); i++){
			System.out.println(lists.get(i));
		}
		//移除元素
		lists.remove(0);
		System.out.println("删除之后-------");
		for(int i=0; i<lists.size(); i++){
			System.out.println(lists.get(i));
		}
		System.out.println("集合是否为空："+lists.isEmpty());
		System.out.println("b是否存在（返回存在的位置否则返回-1）："+lists.indexOf("b"));
	}
}
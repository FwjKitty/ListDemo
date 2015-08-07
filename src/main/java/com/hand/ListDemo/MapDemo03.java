package com.hand.ListDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "fwj1");
		map.put("key2", "fwj2");
		map.put("key3", "fwj3");
		map.put("key4", "fwj4");
		map.put("key5", "fwj5");
		/*String str = map.get("key1");
		System.out.println(str);*/
		Set<String> s = map.keySet();
		Iterator<String> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		Collection c = map.values();
		Iterator<String> i2 = c.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
	}
}
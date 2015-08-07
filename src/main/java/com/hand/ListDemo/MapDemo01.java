package com.hand.ListDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "fwj1");
		map.put("key2", "fwj2");
		map.put("key3", "fwj3");
		map.put("key4", "fwj4");
		map.put("key5", "fwj5");
		String str = map.get("key1");
		System.out.println(str);
	}
}
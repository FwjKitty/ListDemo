package com.hand.ListDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "fwj1");
		map.put("key2", "fwj2");
		map.put("key3", "fwj3");
		map.put("key4", "fwj4");
		map.put("key5", "fwj5");
		/*String str = map.get("key1");
		System.out.println(str);*/
		
		if(map.containsKey("key1")){
			System.out.println("key存在");
		}else{
			System.out.println("key不存在");
		}
		
		if(map.containsValue("fwj3")){
			System.out.println("value存在");
		}else{
			System.out.println("value不存在");
		}
	}
}
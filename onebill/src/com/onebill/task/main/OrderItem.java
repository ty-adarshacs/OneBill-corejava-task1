package com.onebill.task.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import com.onebill.task.Plane;

public class OrderItem {

	HashMap<String, Plane> map = new HashMap<String, Plane>();

	void add_map(String key, Plane obj) {
		if (map.containsValue(key)) {

			System.out.println("item alreday presenrt ");
		} else {
			map.put(key, obj);
			System.out.println(" item add sucefully");
		}

	}

	void remove_map(String key) {

		map.remove(key);
		System.out.println("remove sucefully");
		System.out.println("size map is" + map.size());

	}

	void displayitem(String name) {

		
		if(map.containsKey(name)) {

			Plane spe = map.get(name);
			System.out.println(spe.getName());
			System.out.println(spe.getUnitprice());
			System.out.println(spe.getCode());
		}else {
			System.out.println(" value is not present");
		}
		

	}

	void displayall() {
		for (Entry<String, Plane> entry : map.entrySet()) {
			System.out.println("name" + entry.getValue().getName() + "price :" + entry.getValue().getUnitprice()
					+ " code" + entry.getValue().getCode());
		}

	}

	void numbetofItem() {
		System.out.println("number of item present in cart:" + map.size());
	}

}

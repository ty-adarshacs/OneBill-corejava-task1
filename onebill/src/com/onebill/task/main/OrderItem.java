package com.onebill.task.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import com.onebill.task.Plane;

public class OrderItem {
HashMap<String, Plane> map = new HashMap<String, Plane>();

	void add_map(String key, Plane obj) {
		if (map.containsKey(key)) {

			System.out.println("ITEM ALREADY PRESENT........... ");
		} else {
			map.put(key, obj);
			System.out.println(" ITEM ADDED SUCEFULLY............");
		}

	}

	void remove_map(String key) {
		if (map.containsKey(key)) {

			map.remove(key);
			System.out.println("REMOVE SUCEFFULLY........");
			System.out.println("size map is" + map.size());
		} else {

			System.out.println(" SORRY ITEM NOT PRESENT IN CART ");
		}

	}

	void displayitem(String name) {

		if (map.containsKey(name)) {

			Plane spe = map.get(name);
			System.out.println(name + "name is :" + spe.getName());
			System.out.println("price" + spe.getUnitprice());
			System.out.println("code" + spe.getCode());
		} else {
			System.out.println(" SORRY ITEM NOT PRESENT IN CART......");
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

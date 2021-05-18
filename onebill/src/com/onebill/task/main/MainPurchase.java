package com.onebill.task.main;

import java.util.HashMap;

import com.onebill.task.Orderr;
import com.onebill.task.Plane;

public class MainPurchase {
	public static void main(String[] args) {
		// ArrayList<Plane> list=new ArrayList<Plane>();

		HashMap<String, Plane> map = new HashMap<String, Plane>();

		Plane plane1 = new Plane("sonymobile", 1200.00, "123");
		Plane plane2 = new Plane("case", 1300.00, "100");
		Plane plane3 = new Plane("watch", 1100.00, "121");

		map.put("mobile", plane1);
		map.put("case", plane2);
		map.put("battery", plane3);

		Plane plane = map.get("case");
		String brandname = plane.getName();
		double prices = plane.getUnitprice();
		String code = plane.getCode();

		System.out.println("----------------------------------------------------------------------");

		Orderr order1 = new Orderr();
		order1.setOrdername("mobile");
		order1.setOrderamount(prices);

		order1.quantity(10, brandname);
		order1.totalprice(prices, 10);
		System.out.println("----------------------------------------------------------------------");

	}

}

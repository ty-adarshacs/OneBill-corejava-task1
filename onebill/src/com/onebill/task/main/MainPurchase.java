package com.onebill.task.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.onebill.exception.Handler;

import com.onebill.task.Plane;

public class MainPurchase {
	public static void main(String[] args) throws Handler {

//		 System.out.println(list.contains(mobile1));
		OrderItem ot = new OrderItem();
		Scanner scan = new Scanner(System.in);
		Plane plane1 = new Plane("sonymobile", 1200.00, "123sony");
		Plane plane2 = new Plane("case", 130.00, "100cas");
		Plane plane3 = new Plane("watch", 2100.00, "121wat");
		Plane plane4 = new Plane("niko", 40000.00, "121niko");
		while (true) {
			// static OrderItem ot = new OrderItem();
			System.out.println(" ENTER YOUR CHOICE  ");
			System.out.println(" added to cart 1");
			System.out.println(" remove 2");
			System.out.println(" display 3");
			System.out.println(" display all 4");
			System.out.println("number of item present 6");
			System.out.println(" exite 5");

			int n = scan.nextInt();
			;
			switch (n) {
			case 1:
				System.out.println(" Enter your added item name");

				String name = scan.next();
				
				if (name == "mobile") {
					ot.add_map(name, plane1);
				}
				if (name == "case") {
					ot.add_map(name, plane2);
				}

				break;
			case 2:
				System.out.println("enter remove item");
				String remove = scan.next();
				ot.remove_map(remove);
				break;
			case 3:
				System.out.println("enter you item for datails");
				String name1 = scan.next();
				ot.displayitem(name1);
				break;
			case 4:
				ot.displayall();
				break;
			case 6:
				ot.numbetofItem();
			case 5:
				System.exit(0);
			}
		}

//		Scanner scan = new Scanner(System.in);
//
//		
//		//  SHOP1 Items price and brand------------------------------
//		HashMap<String, Plane> map = new HashMap<String, Plane>();
//
//		Plane plane1 = new Plane("sonymobile", 1200.00, "123sony");
//		Plane plane2 = new Plane("case", 130.00, "100cas");
//		Plane plane3 = new Plane("watch", 2100.00, "121wat");
//		Plane plane4 = new Plane("niko", 40000.00, "121niko");
////		
//
//		map.put("mobile", plane1);
//		map.put("case", plane2);
//		map.put("battery", plane3);
//		map.put("camera", plane4);
//		
//	//  SHOP2 Items price and brand------------------------------------
//		
//		HashMap<String, Plane> map2= new HashMap<String, Plane>();
//
//		Plane plane11 = new Plane("sonymobile", 1200.00, "123sony");
//		Plane plane22 = new Plane("case", 130.00, "100cas");
//		Plane plane33= new Plane("watch", 2100.00, "121wat");
//		Plane plane44= new Plane("niko", 40000.00, "121niko");
//		
//
//		map.put("mobile", plane11);
//		map.put("case", plane22);
//		map.put("battery", plane33);
//		map.put("camera", plane44);
//		
//		try {
//			String item;
//			System.out.println("Enter your order item");
//			item = scan.next();
//			int quantity;
//			System.out.println("Enter your quantity");
//			quantity = scan.nextInt();
//			Plane plane = map.get(item);
//			String brandname = plane.getName();
//			double prices = plane.getUnitprice();
//			String code = plane.getCode();
//
//			System.out.println("----------------------------------------------------------------------");
//
//			Orderr order1 = new Orderr();
//			order1.setOrdername(item);
//			order1.setOrderamount(prices);
//
//			order1.quantity(quantity, brandname);
//			order1.totalprice(prices, quantity);
//			System.out.println("----------------------------------------------------------------------");
//
//		} catch (Exception e) {
//			throw new Handler("item is not present");
//
//		}

	}

}

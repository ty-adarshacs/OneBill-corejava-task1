package com.onebill.task.main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import com.onebill.task.Orderr;
import com.onebill.task.Plane;

public class MainClass {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
//		String code;
//		Plane plane = new Plane();
//		plane.setName("plane2");
//		plane.setUnitprice(1200.00);
//		plane.setCode("123asd");
//		Orderr order = new Orderr();
//		order.setOrdername("plane2");
//		order.setOrderamount(2000.00);
//		Connection con = null;
//		PreparedStatement pst = null;
//		ResultSet res=null;
//		Class.forName("com.mysql.jdbc.Driver");
//		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/onebill", "root", "root");
//		System.out.println(" connection established");
//		
//		
//		
//		String quey="select * from onebill.plane where code=?";
//		pst=(PreparedStatement) con.prepareStatement(quey);
//		String id="123";
//		int code1=Integer.parseInt(id);
//		pst.setInt(1, code1);
//		res=pst.executeQuery();
//		while(res.next()) {
//			String planename=res.getString("name");
//		double planeprice=res.getDouble("unitprice");
//			System.out.println("employ name :"+planename);
//		System.out.println("employ id : "+planeprice);
//
//		}
		
//		String name = plane.getName();
//		double price = plane.getUnitprice();
//		String code = plane.getCode();
//		String query = "insert into onebill.plane values(?,?,?)";
//		pst = (PreparedStatement) con.prepareStatement(query);
//		pst.setString(1, name);
//
//		pst.setDouble(2, price);
//		pst.setString(3, code);
//		int res = pst.executeUpdate();
//		System.out.println(res);
	}

}

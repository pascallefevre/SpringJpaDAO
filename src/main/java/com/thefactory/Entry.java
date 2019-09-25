package com.thefactory;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thefactory.dao.ProductDAO;
import com.thefactory.domain.Product;


public class Entry {

	public static void main(String[] args) {
		test2();

	}
	public static void test1()
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] {"META-INF/appContext.xml"});
		ProductDAO pdao = (ProductDAO) ctx.getBean("PDao");
		
			List<Product> pl = pdao.findAll();
			for (Product p : pl) {
				System.out.println(p.toString());}
				
	}
	public static void test2()
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] {"META-INF/appContext.xml"});
		ProductDAO pdao = (ProductDAO) ctx.getBean("PDao");
		
		Product p1 = new Product( "Les Chaussures Présidentielles");
			pdao.create(p1);
		System.out.println("creat!");
	}

}

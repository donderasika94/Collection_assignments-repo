package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collections_assignments.model.Laptop;

public class LaptopTest {
	
	private static Laptop dellLaptop;
	private static Laptop lenovoLaptop;
	private static Laptop apple;
	
	
	
	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell","Vostro6388","Windows10","i7");
		lenovoLaptop = new Laptop("Lenovo","ThinkPad","Ubantu","i5");
		apple = new Laptop("Apple","MacBook","ios","i8");
		dellLaptop = new Laptop("Dell","Vostro6388","Windows10","i7");
	}
	

	@Test
	public void testArrayList() {
		ArrayList<Laptop>laptop = new ArrayList<>();
		laptop.add(dellLaptop);
		laptop.add(lenovoLaptop);
		laptop.add(apple);
		
		Iterator<Laptop>it = laptop.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(lenovoLaptop,it.next());
		assertEquals(apple,it.next());		
	}
	
	@Test
	public void testHashSet() {
		HashSet<Laptop>laptop = new HashSet<>();
		laptop.add(dellLaptop);
		laptop.add(apple);
		laptop.add(lenovoLaptop);
		laptop.add(dellLaptop);
		
		assertEquals(3,laptop.size());
		
		
	}

}

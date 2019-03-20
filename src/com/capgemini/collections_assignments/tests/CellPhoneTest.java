package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collections_assignments.model.CellPhone;

public class CellPhoneTest {
	private static CellPhone apple;
	private static CellPhone sony;
	private static CellPhone mi;
	
	
	@BeforeClass
	public static void setUp() {
		apple = new CellPhone("Apple","iphone7","128GB","ios",72000.0);
		sony = new CellPhone("sony","s8","DualCamera","Android",60000.0);
		mi = new CellPhone("Xaomi","mi1","64GB","mios",50000.0);
		mi = new CellPhone("Xaomi","mi1","64GB","mios",50000.0);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<CellPhone>cellphone = new ArrayList<CellPhone>();
		cellphone.add(apple);
		cellphone.add(sony);
		cellphone.add(mi);
		
		Iterator<CellPhone>it = cellphone.iterator();
		assertEquals(apple, it.next());
		assertEquals(sony,it.next());
		assertEquals(mi,it.next());
		
	}
	
	@Test
	public void testHashSet() {
		HashSet<CellPhone>cellphone = new HashSet<>();
		cellphone.add(apple);
		cellphone.add(sony);
		cellphone.add(mi);
		cellphone.add(mi);
		
		assertEquals(3,cellphone.size());
	}

}

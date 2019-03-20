package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collections_assignments.model.TelivisionSet;

public class TelivisionTest {
	
	private static TelivisionSet sony;
	private static TelivisionSet samsung;
	private static TelivisionSet lg;
	
	
	@BeforeClass
	public static void setUp() {
		sony = new TelivisionSet("Sony", "LED", true, 14000.0);
		samsung = new TelivisionSet("Samsung", "LCD", false, 12000.0);
		lg = new TelivisionSet("LG", "Plasma", false, 10500.0);
		sony = new TelivisionSet("Sony", "LED", true, 14000.0);
	}

	@Test
	public void testArrayList() {
		ArrayList<TelivisionSet>tv = new ArrayList<TelivisionSet>();
		tv.add(sony);
		tv.add(samsung);
		tv.add(lg);
		
		Iterator<TelivisionSet>it = tv.iterator();
		assertEquals(sony, it.next());
		assertEquals(samsung,it.next());
		assertEquals(lg,it.next());		
	}
	@Test
	public void testHashSet() {
		HashSet<TelivisionSet>tv = new HashSet<>();
		tv.add(sony);
		tv.add(samsung);
		tv.add(lg);
		tv.add(sony);
		
		assertEquals(3,tv.size());
		
		
	}
}

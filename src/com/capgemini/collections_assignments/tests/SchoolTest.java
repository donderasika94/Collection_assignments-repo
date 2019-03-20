package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collections_assignments.model.School;

public class SchoolTest {
	
	private static School jae;
	private static School ies;
	private static School ssb;
	
	
	@BeforeClass
	public static void setup() {
		jae = new School("SubhedarWada","Kalyan","Thane","A++");
		ies = new School("KingGeorge","Titwala","Kalyan","A");
		ssb = new School("VidyaMandir","Ambivali","Nashik","B");
		ies = new School("KingGeorge","Titwala","Kalyan","A");
	}

	@Test
	public void testArrayList() {
		ArrayList<School>school = new ArrayList<School>();
		school.add(jae);
		school.add(ies);
		school.add(ssb);
		
		Iterator<School>it = school.iterator();
		assertEquals(jae, it.next());
		assertEquals(ies,it.next());
		assertEquals(ssb,it.next());	
	}
	
	@Test
	public void testHashset() {
		HashSet<School>school = new HashSet<School>();
		school.add(jae);
		school.add(ies);
		school.add(ssb);
		school.add(ies);
		
		assertEquals(3,school.size());
	}

}

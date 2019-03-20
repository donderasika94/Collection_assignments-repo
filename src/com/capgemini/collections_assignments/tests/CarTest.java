package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.collections_assignments.model.Car;


public class CarTest {
	
	private static Car renault;
	private static Car maruti;
	private static Car suzuki;
	
	
	@BeforeClass
	public static void setUp() {
		renault = new Car("Renault","Duster",2014,1400000);
		maruti = new Car("Maruti Suzuki","Swift",2015,240000);
		suzuki = new Car("Maruti Suzuki","EcoSport",2016,340000);
		renault = new Car("Renault","Duster",2014,1400000);
	}
	
	@Test
	public void testDifferentCarData() {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(renault);
		cars.add(maruti);
		cars.add(suzuki);
		
		Iterator<Car>it = cars.iterator();
		assertEquals(renault, it.next());
		assertEquals(maruti,it.next());
		assertEquals(suzuki,it.next());	
		
	}
	
	@Test
	public void testHashSet() {
		HashSet<Car>cars = new HashSet<>();
		cars.add(renault);
		cars.add(maruti);
		cars.add(suzuki);
		cars.add(renault);
		
		assertEquals(3,cars.size());
		
		
	}
	
	@Test
	public void testCompareToMethod() {
		TreeSet<Car>cars = new TreeSet<>();
		cars.add(renault);
		cars.add(maruti);
		cars.add(suzuki);
		
		Iterator<Car>it = cars.iterator();
		assertEquals(5,renault.getMake().compareTo(maruti.getMake()));
		assertEquals(-5,suzuki.getMake().compareTo(renault.getMake()));
		assertEquals(0,maruti.getMake().compareTo(suzuki.getMake()));
		
	}

	

}

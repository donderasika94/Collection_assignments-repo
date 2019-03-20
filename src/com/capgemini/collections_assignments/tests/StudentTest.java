package com.capgemini.collections_assignments.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collections_assignments.model.Student;

public class StudentTest {
	
	private static Student student1;
	private static Student student2;
	private static Student student3;

	@BeforeClass
	public static void setUp() {
		student1 = new Student(27,"Tim","BE","Mango");
		student2 = new Student(102,"Alex","BE","Apple");
		student3 = new Student(1,"Ben","BE","Orange");
		
	}
	
	@Test
	public void testDifferentStudentData() {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		Iterator<Student>it = student.iterator();
		assertEquals(student1, it.next());
		assertEquals(student2,it.next());
		assertEquals(student3,it.next());	
		
	}
	
	@Test
	public void testStudentClass() {
		
		TreeSet<Student> student = new TreeSet<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		Iterator<Student>it = student.iterator();
		assertEquals("Alex",it.next().getStudentName());
		assertEquals("Ben",it.next().getStudentName());
		assertEquals("Tim",it.next().getStudentName());		
	}
	
	@Test
	public void testFavouriteFruit() {
		HashMap<String, String>map = new HashMap<>();
		map.put(student1.getStudentName(), student1.getFruit());
		map.put(student2.getStudentName(), student2.getFruit());
		map.put(student3.getStudentName(), student3.getFruit());
		
		assertEquals("Mango",map.get(student1.getStudentName()));
		assertEquals("Apple",map.get(student2.getStudentName()));
		assertEquals("Orange",map.get(student3.getStudentName()));
		
		assertTrue(map.keySet().contains(student1.getStudentName()));
		assertTrue(map.keySet().contains(student2.getStudentName()));
		assertTrue(map.keySet().contains(student3.getStudentName()));
		assertTrue(map.values().contains(student1.getFruit()));
		assertTrue(map.values().contains(student2.getFruit()));
		assertTrue(map.values().contains(student3.getFruit()));
		
		
	}
	
	

}
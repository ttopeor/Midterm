package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	public static Student A;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() {
		ArrayList<Student>Studentlist = new ArrayList<Student>();
		ArrayList<Course>Courselist = new ArrayList<Course>();
		ArrayList<Semester>Semesterlist = new ArrayList<Semester>();
		ArrayList<Section>Sectionlist = new ArrayList<Section>();
		
		Student ex1 = new Student("A", "B", "C",new Date(1994,4,10), eMajor.BUSINESS,"Newark",
				"(111)-111-1111","A@gmial.com");
		Student ex2 = new Student("E", "F", "G",new Date(1994,4,10), eMajor.CHEM,"Newark",
				"(222)-222-2222","B@gmial.com");
		Student ex3 = new Student("H", "I", "J",new Date(1994,4,10), eMajor.COMPSI,"Newark",
				"(333)-333-3333","C@gmial.com");
		Studentlist.add(ex1);
		Studentlist.add(ex2);
		Studentlist.add(ex3);
		ex1 = A;
		
		Course ex11 = new Course("CHEM101",3,eMajor.CHEM);
		Course ex12 = new Course("ECON100",3,eMajor.BUSINESS);
		Course ex13 = new Course("PHYSICS",3,eMajor.PHYSICS);
		Courselist.add(ex11);
		Courselist.add(ex12);
		Courselist.add(ex13);
		
		Semester ex14 = new Semester(new Date(2017,1,10),new Date(2018,1,2));
		Semester ex15 = new Semester(new Date(2016,1,10),new Date(2017,1,2));
		Semesterlist.add(ex14);
		Semesterlist.add(ex15);
		
		
	
		

	}

	@Test
	public void Majorchangetest() {
		assertEquals(eMajor.BUSINESS, A.getMajor());

		A.setMajor(eMajor.CHEM);

		assertEquals(eMajor.CHEM,A.getMajor());
	}
}
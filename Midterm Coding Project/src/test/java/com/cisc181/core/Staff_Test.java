package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
    @SuppressWarnings("deprecation")
	
	
	public static Staff A;
    public static Staff B;
    public static Staff C;
    public static Staff D;
    public static Staff E;

    
    @SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup(){
		ArrayList<Staff>staffs = new ArrayList<Staff>();
		
		
		Staff ex1 = new Staff("A", "B", "C",new Date(1994,4,10), "Newark",
				"(111)-111-1111", "ABC@gmail.com", "9 to 12", 2, 3000,new Date(2001,5,1), eTitle.DJ);
		Staff ex2 = new Staff("D", "E", "F",new Date (1977,3,11), "Newark",
				"(222)-222-2222", "DEF@gmail.com", "9 to 12", 1, 3000,new Date (2003,6,30), eTitle.MR);
		Staff ex3 = new Staff("G", "H", "I", new Date(1961,5,23), "Newark",
				"(333)-333-333", "GHI@gmail.com", "9 to 12", 3, 3000,new Date(2001,5,18), eTitle.DR);
		Staff ex4 = new Staff("J", "K", "L",new Date(1985,3,15), "Newark",
				"(444)-444-4444", "JKL@gmial.com", "9 to 12", 3, 3000,new Date(2100,4,30), eTitle.MS);
		Staff ex5 = new Staff("M", "N", "O",new Date(2011,2,1), "Nwark",
				"(555)-555-555", "MNO@gmial.com", "9 to 12", 1, 3000,new Date(1999,2,6), eTitle.MR);
		
		
		staffs.add(ex1);
		staffs.add(ex2);
		staffs.add(ex3);
		staffs.add(ex4);
		staffs.add(ex5);
		
		A = ex1;
		B = ex2;
		C = ex3;
		D = ex4;
		E = ex5;
	
		
	}
	

	
	
	@Test
	public void testofsalary() {
		int avg = (int) ((A.getSalary() + B.getSalary() + C.getSalary() + D.getSalary() + E.getSalary())/5);
		assertEquals(avg,3000); 
		
	}	

	@Test(expected = PersonException.class)
	public void ageExceptiontest() throws Exception {
		@SuppressWarnings("deprecation")
		Staff ex6 = new Staff("M", "N", "O",new Date(2222,2,1), "Nwark",
			"(555)-555-555", "MNO@gmial.com", "9 to 12", 1, 3000,new Date(1999,2,6), eTitle.MR);
	}
	
	@Test(expected = PersonException.class)
	public void phoneExceptiontest() throws Exception {
		@SuppressWarnings("deprecation")
		Staff ex7 = new Staff("M", "N", "O",new Date(2222,2,1), "Nwark",
			"111111111", "MNO@gmial.com", "9 to 12", 1, 3000,new Date(1999,2,6), eTitle.MR);
	}
	
}

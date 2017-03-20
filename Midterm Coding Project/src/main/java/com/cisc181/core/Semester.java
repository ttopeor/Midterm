package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;


	public UUID getSemesterID() {
		return SemesterID;
	}


	public Date getStartDate() {
		return StartDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}


	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}


	public Semester(Date startDate,Date endDate){
		SemesterID = UUID.randomUUID();
		StartDate = startDate;
		EndDate = endDate;
	}
	
}
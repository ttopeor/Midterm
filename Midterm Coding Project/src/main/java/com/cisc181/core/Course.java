package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public Course(String coursename,int gradepoints,eMajor major){
		super();
		CourseName = coursename;
		GradePoints = gradepoints;
				
	}
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

}

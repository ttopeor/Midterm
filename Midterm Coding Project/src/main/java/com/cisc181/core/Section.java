package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	public Section(UUID courseID,UUID semesterID,int roomID){
		CourseID = courseID;
		SemesterID = semesterID;
		RoomID = roomID;
		
		
		
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}

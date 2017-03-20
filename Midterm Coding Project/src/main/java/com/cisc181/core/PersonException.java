package com.cisc181.core;


import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PersonException extends Exception {
	
	private Person person;
	
	public PersonException(Person person){
		this.person = person;
		}
	public void ageException() throws Exception{
		
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(this.person.getDOB());
		int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if(age > 100){
			throw new Exception(this);
		}
		
	}
	
	public void phoneException() throws Exception{
		String regx = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	
		Pattern numberPattern = Pattern.compile(regx);
		Matcher matcher = numberPattern.matcher(this.person.getPhone());
		if(!matcher.matches()){
			throw new Exception(this);
		}
		
	}

}


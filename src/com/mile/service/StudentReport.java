/*
	A simple java program to calculate grade based on the marks. 
	It consist of some getter setter methods , exception handling , grade logic and constructors.
*/

package com.mile.service;

import com.mile.exception.NullMarksArrayException;
import com.mile.exception.NullNameException;
import com.mile.exception.NullStudentException;
import com.mile1.bean.Student;

public class StudentReport {
	
	public String findGrade(Student studentObject) {
		String str="";
		int arr[] = studentObject.getMarks();
		int sum = 0;
		for(int i:arr) {
			if(i<35) {  str="F"; return str;	} 
			sum += i;}
		
		if(sum<=150) {str="D";}
		else if(sum>150&&sum<=200) {str="C"; }
		else if(sum>200&&sum<=250) {str="B"; }
		else if (sum>250&&sum<=300) {str="A"; }
				return str;
		
		
		}
	
	public String validate(Student studentObject) throws NullStudentException, NullMarksArrayException, NullNameException {
		if(studentObject == null) { throw new NullStudentException();}
		else if (studentObject.getMarks()==null) { throw new NullMarksArrayException();}
		else if(studentObject.getName()==null) {throw new NullNameException();}
		
		String grade = findGrade(studentObject);
		
		return grade;
	}
	
	public int findNumberofNullMarks(Student data[]) {
		int count = 0 ;
		for(int i = 0; i < data.length ; i++) {
			try {
			if(data[i].getMarks()==null) { count ++ ;} }
			catch(NullPointerException e) {
				
			}
			
		}
		return count;
		
	}
	
	public int findNumberofNullNames(Student data[]) {
		int count = 0 ;
		for(int i = 0; i < data.length ; i++) {
			try {
				if(data[i].getName()==null) { count ++ ;} }
				catch(NullPointerException e) {
					
				}
				
		}
		return count;
		
	}
	
	public int findNumberofNullObjects(Student data[]) {
		int count = 0 ;
		for(int i = 0; i < data.length ; i++) {
			try {
				if(data[i]==null) 
				count ++ ; 
			}
				catch(NullPointerException e) {
					 
			}
		}
		return count;
		
	}
	
	
		
}



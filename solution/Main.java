package com.gl.ga.driverClass;

import com.gl.ga.superDept.Admindepartment;
import com.gl.ga.superDept.hrDept;
import com.gl.ga.superDept.techDept;

public class Main
{

	
	public static void main (String[] args) 
	{
		
		//superDept SD = new superDept();
	   Admindepartment admin = new Admindepartment();
		hrDept hrdept = new hrDept();
		techDept tech =new techDept();
		
		System.out.println(" Welcome to" + admin.departmentName() +  "\n" + admin.getTodaysWork() + 
				"\n" + admin.getWordDeadline() + "\n" + admin.isTodayAHoliday());
		
		System.out.println();
		System.out.println(" Welcome to" + hrdept.departmentName() +  "\n" + hrdept.getTodaysWork() + 
				"\n" + hrdept.getWordDeadline() + "\n" + hrdept.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(" Welcome to" + tech.departmentName() +  "\n" + tech.getTodaysWork() + 
				"\n" + tech.getWordDeadline() + "\n " +tech.getTechStackInformation() + "\n" + tech.isTodayAHoliday());
		
		
	}
	
}
	
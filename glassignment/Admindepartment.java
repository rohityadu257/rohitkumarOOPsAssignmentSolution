package com.gl.ga.superDept;

public class Admindepartment extends superDept{
	 
	 public String departmentName() {
			return " Admin Department ";
		}
		
	 public String getTodaysWork() {
			return " Complete your Document Submission ";
		}
		
	 public String getWordDeadline() {
			return " Complete by EOD ";
		}
	 void holiday() {
		 super.isTodayAHoliday();
	 }
}
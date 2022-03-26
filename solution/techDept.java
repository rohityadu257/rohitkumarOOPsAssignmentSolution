package com.gl.ga.superDept;

public class techDept extends superDept {
	 
	
	public  String departmentName() {
			return " Tech Department ";
		}
		
	public String getTodaysWork() {
			return " complete Coding of Module 1 ";
		}
		
	public String getWordDeadline() {
			return " Complete by EOD ";
		}
	public String getTechStackInformation() {
			return "core Java ";
		}
	
	void holiday() {
		 super.isTodayAHoliday();
	 }
	 
 }
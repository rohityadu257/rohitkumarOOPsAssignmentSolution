package com.gl.ga.superDept;

 public class superDept {

	public String departmentName() {
		return " Super Department ";
	}
	
	public String getTodaysWork() {
		return " No Work as of Now ";
	}
	
	public String getWordDeadline() {
		return " Nil ";
	}
	public String isTodayAHoliday() {
		return " Today is not a Holiday ";
	}
  

 public static class Admindepartment extends superDept{
	 
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
 public static class hrDept extends superDept{
	  
	public String departmentName() {
			return " HR Department ";
		}
		
	public String getTodaysWork() {
			return " Fill today’s worksheet and mark your attendance ";
		}
		
	public String getWordDeadline() {
			return " Complete by EOD ";
		}
	public String doActivity() {
			return " team Lunch ";
		}
	void holiday() {
		 super.isTodayAHoliday();
	 }
  }
  
  public static class techDept extends superDept {
	 
	
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
  
 }

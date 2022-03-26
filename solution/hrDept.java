package com.gl.ga.superDept;

public  class hrDept extends superDept{
	  
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

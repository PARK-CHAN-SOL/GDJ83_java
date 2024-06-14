package com.sol.s5.date;

import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {

//		Calendar ca = new GregorianCalendar();

		// 현재 시간과 날짜 정보가 만들어짐 객체가 만들어지는 시점에
		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.MINUTE));
		System.out.println(ca.get(Calendar.SECOND));
		System.out.println(ca.get(Calendar.MONTH)+1);
		
		Date date = ca.getTime();
		System.out.println(date);
		
		Calendar future = Calendar.getInstance();
		future.set(Calendar.YEAR, 2074);
		
		future.set(Calendar.DATE, future.get(Calendar.DATE)+17);
		future.set(2074, 11, 15);
		
		System.out.println(future.getTime());
		
		
		Single single = Single.get();
	}

}

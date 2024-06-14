package com.sol.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		birth.set(1998, 2, 22);
		System.out.println(birth.getTime());
		System.out.println((double)(ca.getTimeInMillis()-birth.getTimeInMillis())/86400000);
		
		long b = birth.getTimeInMillis();
		b = b + 8640000000L;
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());
		
		String s = "1998-03-22";
		
		String[] a = s.split("-");
		
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1])-1, Integer.parseInt(a[2]));
		
		ca = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm");
		
		System.out.println(sdf.format(ca.getTime()));
		
		System.out.println(UUID.randomUUID().toString());
	}

}

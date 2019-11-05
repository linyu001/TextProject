package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {
	public static void main(String[] args) {
		SimpleDateFormat sip =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =sip.format(new Date());
	    System.out.println(time);
	}
	public void add(){
		
	}

}

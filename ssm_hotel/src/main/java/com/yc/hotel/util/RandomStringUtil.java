package com.yc.hotel.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomStringUtil {

	/**
	 * 自动生成入住id
	 * @return
	 */
	public static String getRandomId(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}
	
}

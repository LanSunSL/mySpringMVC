package cn.mldn.myspring.di.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private String pattern ;
	private String date ;
	private SimpleDateFormat sdf ;
	public DateUtil() {
		this.sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	public DateUtil(String pattern) {
		this.pattern = pattern ;
		this.sdf = new SimpleDateFormat(this.pattern);
	}
	public void setDate(String date) {
		this.date = date ;
	}
	public Date getFormatDate() {
		try {
			return this.sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ABC {
	public static void main(String[] args) {
		String ds1 = "2007-06-30";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		String ds2 = null;
		try {
			ds2 = sdf2.format(sdf1.parse(ds1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ds2);	
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		LocalDate today = LocalDate.now();
		System.out.println(String.format("Today: %s", today.format(formatter)));
		
		//bigdecimal
		DecimalFormat f = new DecimalFormat("##.00");  // this will helps you to always keeps in two decimal places
		BigDecimal a = new BigDecimal("10.00");
		BigDecimal a1 = new BigDecimal("10.0");
		BigDecimal a2 = new BigDecimal("10.1");
		BigDecimal a3 = new BigDecimal("10.10");
		BigDecimal a4 = new BigDecimal("10");

		System.out.println(f.format(a));
		System.out.println(f.format(a1));
		System.out.println(f.format(a2));
		System.out.println(f.format(a3));
		System.out.println(f.format(a4));
		
		
	}
}

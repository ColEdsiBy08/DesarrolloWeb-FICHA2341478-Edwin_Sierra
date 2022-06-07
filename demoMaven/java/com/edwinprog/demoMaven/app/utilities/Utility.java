package com.edwinprog.demoMaven.app.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

	public static Date convertirFecha(String Fecha) {
		SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=formato.parse(Fecha);
			System.out.println("La fecha convertida es "+date);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No la convierte la fecha");
		}
		return date;
	}
}

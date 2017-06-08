package com.craftcoder.java.date;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ConversorDeDataEmStringTest {

	@Test
	public void deveriaDarErroAoTentarConverterUmCalendarEmString() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 6, 25);
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataEmString = formatador.format(calendar);
		
		System.out.println(dataEmString);
	}
	
	@Test
	public void deveriaConverterUmaDataEmString() throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 6, 25);
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data = calendar.getTime();
		String dataEmString = formatador.format(data);
		
		assertEquals("25/07/2017", dataEmString);
	}
	
}

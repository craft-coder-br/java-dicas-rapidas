package com.craftcoder.java.date;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ConversorDeStringEmDataTest {

	@Test
	public void deveriaDarErroAoTentarConverterUmaStringEmData() throws Exception {
		String dataEmString = "2017/01/06";
		
		SimpleDateFormat formatador = new SimpleDateFormat();
		
		Date data = formatador.parse(dataEmString);
		
		System.out.println(data);
	}
	
	@Test
	public void deveriaConverterUmaStringEmData() throws Exception {
		String dataEmString = "2017-06-25";
		
		//d - dia
		//M - mes
		//y - ano
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
		
		Date data = formatador.parse(dataEmString);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		assertEquals(2017, calendar.get(Calendar.YEAR));
		assertEquals(5, calendar.get(Calendar.MONTH));
		assertEquals(25, calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void deveriaConverterUmaStringEmDataUsandoPadraoBrasileiro() throws Exception {
		String dataEmString = "25/06/2017";
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data = formatador.parse(dataEmString);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		assertEquals(25, calendar.get(Calendar.DAY_OF_MONTH));
		assertEquals(5, calendar.get(Calendar.MONTH));
		assertEquals(2017, calendar.get(Calendar.YEAR));
	}
	
}

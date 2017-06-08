package com.craftcoder.java.date;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public class ArtigoTest {

	@Test
	public void deveriaConverterDeMapParaListUsandoJava8() throws Exception {
		List<Artigo> artigosCraftCoder = new ArrayList<>();
		
		artigosCraftCoder.add(new Artigo(1L, "Java 8"));
		artigosCraftCoder.add(new Artigo(2L, "CDI"));
		artigosCraftCoder.add(new Artigo(3L, "Hibernate"));
		artigosCraftCoder.add(new Artigo(4L, "Docker"));
		
		Map<Long, Artigo> banco = artigosCraftCoder
			.stream()
			.collect(Collectors.toMap(artigo -> artigo.getId(), artigo -> artigo));
		
		assertEquals("Java 8", banco.get(1L).getAssunto());
		assertEquals("CDI", banco.get(2L).getAssunto());
		assertEquals("Hibernate", banco.get(3L).getAssunto());
		assertEquals("Docker", banco.get(4L).getAssunto());
	}
	
	@Test
	public void deveriaConverterDeMapParaListUsandoJava8ComMethodReference() throws Exception {
		List<Artigo> artigosCraftCoder = new ArrayList<>();
		
		artigosCraftCoder.add(new Artigo(1L, "Java 8"));
		artigosCraftCoder.add(new Artigo(2L, "CDI"));
		artigosCraftCoder.add(new Artigo(3L, "Hibernate"));
		artigosCraftCoder.add(new Artigo(4L, "Docker"));
		
		Map<Long, Artigo> banco = artigosCraftCoder
				.stream()
				.collect(Collectors.toMap(Artigo::getId, artigo -> artigo));
		
		assertEquals("Java 8", banco.get(1L).getAssunto());
		assertEquals("CDI", banco.get(2L).getAssunto());
		assertEquals("Hibernate", banco.get(3L).getAssunto());
		assertEquals("Docker", banco.get(4L).getAssunto());
	}
	
}

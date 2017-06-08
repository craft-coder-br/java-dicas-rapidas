package com.craftcoder.java.date;

public class Artigo {

	private Long id;
	
	private String assunto;

	public Artigo(Long id, String assunto) {
		this.id = id;
		this.assunto = assunto;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getAssunto() {
		return assunto;
	}
	
}

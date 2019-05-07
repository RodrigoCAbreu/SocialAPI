package com.example.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 9070982767521725502L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
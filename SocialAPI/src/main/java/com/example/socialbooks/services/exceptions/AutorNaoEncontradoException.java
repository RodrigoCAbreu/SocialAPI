package com.example.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 9070982767521725502L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}

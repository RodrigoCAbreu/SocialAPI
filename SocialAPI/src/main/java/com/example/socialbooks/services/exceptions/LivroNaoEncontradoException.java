package com.example.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 9070982767521725502L;

	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}

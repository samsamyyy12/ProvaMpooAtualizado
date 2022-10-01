package model;

//Definição de Exceção para cadastro de produto existente

public class DuplicatedProductException extends Exception{
	public DuplicatedProductException(String mensagem){
		super(mensagem);
	}
}

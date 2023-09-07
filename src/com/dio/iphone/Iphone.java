package com.dio.iphone;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando Musica!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica Pausada!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica!");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir página da internet!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada!");
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo Ligação!");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendendo ligação!");
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Reproduzindo correio de voz!");
		
	}

}

package Dispositivos.Smarthphone;

import Dispositivos.AparelhoTelefonico.AparelhoTelefonico;
import Dispositivos.Internet.Internet;
import Dispositivos.ReprodutorDeAudio.ReprodutorDeAudio;

public class Iphone implements AparelhoTelefonico, Internet, ReprodutorDeAudio {
	public void exibirPagina() {
		System.out.println("Exibindo pagina via Iphone.");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba via Iphone.");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando pagina via Iphone.");
	}
	
	public void ligar() {
		System.out.println("Ligando via Iphone...");
	}
	
	public void atender() {
		System.out.println("Atendendo a ligação via Iphone.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo correio de voz via Iphone.");
	}
	
	public void tocar() {
		System.out.println("Tocando Musica via Iphone.");
	}
	
	public void pausar() {
		System.out.println("Música Pausada via Iphone.");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando Música via Iphone.");
	}
}

package Dispositivos.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico {
	public void ligar() {
		System.out.println("Ligando via celular...");
	}
	
	public void atender() {
		System.out.println("Atendendo a ligação via celular.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo correio de voz via celular.");
	}
}

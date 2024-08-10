package Dispositivos.ReprodutorDeAudio;

public class Ipod implements ReprodutorDeAudio {
	public void tocar() {
		System.out.println("Tocando Musica via Ipod.");
	}
	
	public void pausar() {
		System.out.println("Música Pausada via Ipod.");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando Música via Ipod.");
	}
}

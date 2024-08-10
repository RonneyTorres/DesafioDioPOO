package Dispositivos.Usuario;

import Dispositivos.AparelhoTelefonico.AparelhoTelefonico;
import Dispositivos.AparelhoTelefonico.Celular;
import Dispositivos.Smarthphone.Iphone;
import Dispositivos.Internet.Internet;
import Dispositivos.Internet.Navegador;
import Dispositivos.ReprodutorDeAudio.Ipod;
import Dispositivos.ReprodutorDeAudio.ReprodutorDeAudio;

public class Usuario {

	public static void main(String[] args) {
		AparelhoTelefonico aparelhoTelefonico = new Celular();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		AparelhoTelefonico smartphone = new Iphone();
		smartphone.atender();
		smartphone.ligar();
		smartphone.iniciarCorreioVoz();
		
		Internet internet = new Navegador();
		internet.adicionarNovaAba();
		internet.atualizarPagina();
		internet.exibirPagina();
		
		Internet internetphone = new Iphone();
		internetphone.adicionarNovaAba();
		internetphone.atualizarPagina();
		internetphone.exibirPagina();
		
		ReprodutorDeAudio reprodutorDeAudio = new Ipod();
		reprodutorDeAudio.tocar();
		reprodutorDeAudio.pausar();
		reprodutorDeAudio.selecionarMusica();
		
		ReprodutorDeAudio reprodutorDeAudioPhone = new Iphone();
		reprodutorDeAudioPhone.tocar();
		reprodutorDeAudioPhone.pausar();
		reprodutorDeAudioPhone.selecionarMusica();
		
		

	}

}

package Dispositivos.Internet;

public class Navegador implements Internet {
	public void exibirPagina() {
		System.out.println("Exibindo pagina via navegador.");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba via navegador.");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando pagina  via navegador.");
	}
}

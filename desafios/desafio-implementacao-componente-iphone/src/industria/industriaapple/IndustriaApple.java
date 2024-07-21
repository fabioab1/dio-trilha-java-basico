package industria.industriaapple;

import componentes.iphone.Iphone;

public class IndustriaApple {
	public static void main (String[] args) {
		Iphone iphone2007 = new Iphone();
		
		// Telefone
		iphone2007.ligar("(18) 12345-6789");
		iphone2007.atender();
		
		// Navegar na internet
		iphone2007.exibirPagina("https://web.dio.me");
		iphone2007.adicionarNovaAba();
		iphone2007.exibirPagina("https://github.com");
		iphone2007.atualizarPagina();
		
		// Reproduzir músicas
		iphone2007.tocar();
		iphone2007.pausar();
		iphone2007.selecionarMusica("M4rkim - Finn");
		iphone2007.pausar();
	}
}

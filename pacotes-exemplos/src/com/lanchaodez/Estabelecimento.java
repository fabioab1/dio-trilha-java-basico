package com.lanchaodez;

import com.lanchaodez.area.cliente.Cliente;
import com.lanchaodez.atendimento.Atendente;
import com.lanchaodez.atendimento.cozinha.Almoxarife;
import com.lanchaodez.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		// Almoxarife almoxarife = new Almoxarife();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//já pensou os clientes ouvindo que o gás acabou ?
		// cozinheiro.pedirParaTrocarGas(atendente);
		
	}
}

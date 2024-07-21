package exemplointerface.estabelecimento;

import exemplointerface.equipamentos.copiadora.Copiadora;
import exemplointerface.equipamentos.digitalizadora.Digitalizadora;
import exemplointerface.equipamentos.digitalizadora.Scanner;
import exemplointerface.equipamentos.impressora.*;
import exemplointerface.equipamentos.multifuncional.*;

public class Fabrica {
	public static void main (String [] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}

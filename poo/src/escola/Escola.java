package escola;

public class Escola {
	public static void main (String [] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Fábio");
		felipe.setIdade(14);
		felipe.setMatricula(1663175);
		
		System.out.println("O aluno " + felipe.getNome() + ", de matrícula " + felipe.getMatricula() + ", tem " + felipe.getIdade() + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 	
	}
}

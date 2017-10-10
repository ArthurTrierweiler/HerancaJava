package br.com.heranca;

public class Professor extends Aluno {
	
	public boolean GetResposta() {
		if (colou == true) {
			System.out.println("O(a) aluno(a) " + nome + " zerou a prova, !");
			return true;
		} else {
			System.out.printf("O(a) aluno(a) " + nome + " não zerou a prova, !");
			return false;
		}
	}
}
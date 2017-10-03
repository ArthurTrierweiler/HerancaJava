package br.com.heranca;

public class Mutante extends Humano {

	int perigo;

	public Gerente(String nome, String dna, double radiacao, int perigo) {
		super(nome, dna, radiacao);
		this.perigo = perigo;
	}

	public void ImprimeDados() {
		System.out.println("O nome é: " + this.nome);
		System.out.println("O DNA é: " + this.dna);
		System.out.println("A sua radiação é: " + this.radiacao);
		System.out.println("O perigo proporcionado é: " + this.perigo);
	}
}

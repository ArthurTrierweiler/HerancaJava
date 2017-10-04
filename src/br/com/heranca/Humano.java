package br.com.heranca;

public class HUmano {
	String nome;
	String radiacao;
	boolean poderes;
	
	public String GetNome() {
		return this.nome;
	}
	
	public String GetDna() {
		return this.dna;
	}
	
	public boolean GetRadiacao() {
		return poderes;
	}
	
	public String Nome(String name) {
		return nome = name;
	}
	
	public String DNA(String dnaHumano) {
		return dna = dnaHumano;
	}
	
	public boolean Radiacao(boolean poderes) {
		return radiacao = poderes;
	}

}
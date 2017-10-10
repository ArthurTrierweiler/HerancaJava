package br.com.heranca;

public class Aluno {
	String nome;
	String cpf;
	boolean colou;
	
	public String GetNome() {
		return this.nome;
	}
	
	public String GetCpf() {
		return this.cpf;
	}
	
	public boolean GetVerdade() {
		return colou;
	}
	
	public String Nome(String nomee) {
		return nome = nomee;
	}
	
	public String CPF(String cpfAluno) {
		return cpf = cpfAluno;
	}
	
	public boolean Verdade(boolean reprovacao) {
		return colou = reprovacao;
	}

}
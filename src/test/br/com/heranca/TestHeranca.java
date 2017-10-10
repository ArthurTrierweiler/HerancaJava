package br.com.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.heranca.Professor;

public class TestaHeranca {
	Professor professor;
	
	@Before
	public void before() {
		professor = new Professor();
	}

	@Test
	public void testaNome() {
		professor.Nome("Albert");
		assertEquals(professor.GetNome(), "Albert");
		}
	
	@Test
	public void testaCpf() {
		professor.CPF("122.334.445-66");
		assertEquals(professor.GetCpf(), "122.334.445-66");
	}
	
	@Test
	public void testaVerdade() {
		professor.Verdade(true);
		assertEquals(professor.GetVerdade(), true);
	}
	
	@Test
	public void testaResposta() {
		professor.Verdade(true);
		assertEquals(professor.GetResposta(), true);
	}
	
}
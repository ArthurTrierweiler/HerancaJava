package test.br.com.heranca;

public class TestaHeranca {
	Mutante mutante;
	
	@Before
	public void before() {
		mutante = new Mutante();
	}

	@Test
	public void testaNome() {
		mutante.Nome("Hulk");
		assertEquals(mutante.GetNome(), "Hulk");
		}
	
	@Test
	public void testaDna() {
		policia.Dna("29032001");
		assertEquals(mutante.GetDna(), "29032001");
	}
	
	@Test
	public void testaRadiacao() {
		mutante.Perigo(true);
		assertEquals(mutante.GetPerigo(), true);
	}
	
}
import static org.junit.Assert.*;

import org.junit.Test;

public class TestePilha {

	@Test
	public void pilhaVazia() {
		Pilha p = new Pilha();
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}
	
	@Test
	public void empilhaUmElemento() {
		Pilha p = new Pilha();
		String item = "Primeiro elemento";
		
		p.empilhar(item);
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals(item, p.topo());
	}
	
	@Test
	public void empilhaDoisElementos() {
		Pilha p = new Pilha();
		String elemento1 = "Primeiro elemento";
		String elemento2 = "Segundo elemento";
		
		p.empilhar(elemento1);
		p.empilhar(elemento2);
		
		assertEquals(2, p.tamanho());
		assertEquals(elemento2, p.topo());
	}
	
	@Test
	public void empilhaEDesempilha() {
		Pilha p = new Pilha();
		String elemento1 = "Primeiro elemento";
		String elemento2 = "Segundo elemento";
		
		p.empilhar(elemento1);
		p.empilhar(elemento2);
		
		assertEquals(2, p.tamanho());
		assertEquals(elemento2, p.topo());
		
		Object desempilhado = p.desempilhar();
		
		assertEquals(1, p.tamanho());
		assertEquals(elemento2, desempilhado);
		assertEquals(elemento1, p.topo());
	}
}

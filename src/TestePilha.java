import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePilha {

	private Pilha mPilha;
	
	@Before
	public void init() {
		mPilha = new Pilha(10);
	}
	@Test
	public void pilhaVazia() {
		assertTrue(mPilha.estaVazia());
		assertEquals(0, mPilha.tamanho());
	}
	
	@Test
	public void empilhaUmElemento() {
		String item = "Primeiro elemento";
		
		mPilha.empilhar(item);
		assertFalse(mPilha.estaVazia());
		assertEquals(1, mPilha.tamanho());
		assertEquals(item, mPilha.topo());
	}
	
	@Test
	public void empilhaDoisElementos() {
		String elemento1 = "Primeiro elemento";
		String elemento2 = "Segundo elemento";
		
		mPilha.empilhar(elemento1);
		mPilha.empilhar(elemento2);
		
		assertEquals(2, mPilha.tamanho());
		assertEquals(elemento2, mPilha.topo());
	}
	
	@Test
	public void empilhaEDesempilha() {
		String elemento1 = "Primeiro elemento";
		String elemento2 = "Segundo elemento";
		
		mPilha.empilhar(elemento1);
		mPilha.empilhar(elemento2);
		
		assertEquals(2, mPilha.tamanho());
		assertEquals(elemento2, mPilha.topo());
		
		Object desempilhado = mPilha.desempilhar();
		
		assertEquals(1, mPilha.tamanho());
		assertEquals(elemento2, desempilhado);
		assertEquals(elemento1, mPilha.topo());
	}
	
	@Test(expected = PilhaVaziaException.class)
	public void removeDaPilhaVazia(){
		mPilha.desempilhar();
	}
	
	@Test
	public void adicionaNaPilhaCheia(){
		for (int cont = 0; cont < 10; cont++) {
			mPilha.empilhar("item " + cont);
		}
		
		try {
			mPilha.empilhar("BOOOOMMMM - item extra");
			fail();
		} catch (PilhaCheiaException e){}
		
	}
}

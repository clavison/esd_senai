package pilhas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTest {
	
	Pilha pilha;
	
	@BeforeEach
	void inicializa() {
		pilha = new Pilha();
	}
	

	@Test
	void emptyTest() {
		assertNull(pilha.peek());
	}
	
	@Test
	void pushTest() {
		pilha.push(new Elemento("A"));
		assertEquals("A", pilha.peek().getValor());
		pilha.push(new Elemento("B"));
		assertEquals("B", pilha.peek().getValor());
	}
	
	@Test
	void popTest() {
		pilha.push(new Elemento("A"));
		pilha.push(new Elemento("B"));
		pilha.push(new Elemento("C"));
		assertEquals("C", pilha.peek().getValor());
		pilha.pop();
		assertEquals("B", pilha.peek().getValor());
		pilha.pop();
		assertEquals("A", pilha.peek().getValor());
		pilha.pop();
		assertNull(pilha.peek());
	}
	
	@Test
	void viewTest() {
		pilha.push(new Elemento("A"));
		pilha.push(new Elemento("B"));
		pilha.push(new Elemento("C"));
		assertEquals("C B A", pilha.view());
		pilha.pop();
		pilha.pop();
		pilha.pop();
		assertEquals("Pilha vazia", pilha.view());
	}

}

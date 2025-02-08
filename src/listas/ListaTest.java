package listas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaTest {

	Lista lista;

	@BeforeEach
	void inicializa() {
		lista = new Lista();
	}

	@Test
	void emptyTest() {
		assertNull(lista.getPrimeiro());
		assertNull(lista.getUltimo());
		assertEquals(0, lista.getTamanho());
	}

	@Test
	void adicionarFinalTest() {
		lista.adicionarFinal(new Elemento("A"));
		lista.adicionarFinal(new Elemento("B"));
		assertEquals("A", lista.getPrimeiro().getValor());
		assertEquals("B", lista.getUltimo().getValor());
		assertEquals(2, lista.getTamanho());
	}

	@Test
	void adicionarInicioTest() {
		lista.adicionarInicio(new Elemento("A"));
		lista.adicionarInicio(new Elemento("B"));
		assertEquals("B", lista.getPrimeiro().getValor());
		assertEquals("A", lista.getUltimo().getValor());
		assertEquals(2, lista.getTamanho());
	}

	@Test
	void removerFinalTest() {
		lista.adicionarInicio(new Elemento("A"));
		lista.adicionarInicio(new Elemento("B"));
		lista.adicionarInicio(new Elemento("C"));
		lista.adicionarInicio(new Elemento("D"));
		assertEquals(4, lista.getTamanho());
		lista.removerFinal();
		assertEquals(3, lista.getTamanho());
		assertEquals("B", lista.getUltimo().getValor());
	}

	@Test
	void removerInicioTest() {
		lista.adicionarFinal(new Elemento("A"));
		lista.adicionarFinal(new Elemento("B"));
		lista.adicionarFinal(new Elemento("C"));
		lista.adicionarFinal(new Elemento("D"));
		assertEquals(4, lista.getTamanho());
		lista.removerInicio();
		assertEquals(3, lista.getTamanho());
		assertEquals("B", lista.getPrimeiro().getValor());
	}

	@Test
	void viewTest() {
		lista.adicionarInicio(new Elemento("A"));
		lista.adicionarFinal(new Elemento("B"));
		lista.adicionarInicio(new Elemento("C"));
		lista.adicionarFinal(new Elemento("D"));
		assertEquals(4, lista.getTamanho());
		assertEquals("C A B D", lista.view());
		lista.removerFinal();
		lista.removerInicio();
		lista.removerFinal();
		lista.removerInicio();
		assertEquals("Lista vazia", lista.view());
	}

}

package filas.simples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FilaTest {
	Fila fila;

	@BeforeEach
	void inicializa() {
		fila = new Fila();
	}

	@Test
	void emptyTest() {
		assertTrue(fila.isEmpty());
	}

	@Test
	void enqueueTest() {
		fila.enqueue(new Elemento("A"));
		fila.enqueue(new Elemento("B"));
		fila.enqueue(new Elemento("C"));
		assertFalse(fila.isEmpty());
		assertEquals(fila.getInicio().getValor(), "A");
		assertEquals(fila.getFim().getValor(), "C");
	}

	@Test
	void dequeueTest() {
		fila.enqueue(new Elemento("A"));
		fila.enqueue(new Elemento("B"));
		fila.enqueue(new Elemento("C"));
		fila.dequeue();
		assertEquals(fila.getInicio().getValor(), "B");
		assertEquals(fila.getFim().getValor(), "C");
		
	}

	@Test
	void viewTest() {
		fila.enqueue(new Elemento("A"));
		fila.enqueue(new Elemento("B"));
		fila.enqueue(new Elemento("C"));
		assertEquals("A B C", fila.view());
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		assertEquals("Fila vazia", fila.view());
	}

}

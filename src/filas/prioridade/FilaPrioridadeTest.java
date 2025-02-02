package filas.prioridade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaPrioridadeTest {

	FilaPrioridade fila;

	@BeforeEach
	void inicializa() {
		fila = new FilaPrioridade();
	}

	@Test
	void emptyTest() {
		assertTrue(fila.isEmpty());
	}

	@Test
	void enqueueTest() {
		fila.enqueue(new Elemento("A",2));
		fila.enqueue(new Elemento("B",5));
		fila.enqueue(new Elemento("C",1));
		assertFalse(fila.isEmpty());
		assertEquals(fila.getInicio().getValor(), "B");
		assertEquals(fila.getFim().getValor(), "C");
	}
	
	@Test
	void enqueueWithSamePriorityTest() {
		fila.enqueue(new Elemento("A",2));
		fila.enqueue(new Elemento("B",5));
		fila.enqueue(new Elemento("C",1));
		fila.enqueue(new Elemento("D",5));
		assertFalse(fila.isEmpty());
		assertEquals(fila.getInicio().getValor(), "B");
		assertEquals(fila.getFim().getValor(), "C");
		assertEquals("B D A C", fila.view());
	}

	@Test
	void dequeueTest() {
		fila.enqueue(new Elemento("A",2));
		fila.enqueue(new Elemento("B",5));
		fila.enqueue(new Elemento("C",1));
		fila.enqueue(new Elemento("D",1));
		fila.dequeue();
		assertEquals(fila.getInicio().getValor(), "A");
		assertEquals(fila.getFim().getValor(), "D");
		
	}

	@Test
	void viewTest() {
		fila.enqueue(new Elemento("A",1));
		fila.enqueue(new Elemento("B",2));
		fila.enqueue(new Elemento("C",3));
		fila.enqueue(new Elemento("D",4));
		assertEquals("D C B A", fila.view());
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		assertEquals("Fila vazia", fila.view());
	}

}

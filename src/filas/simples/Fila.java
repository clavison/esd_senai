package filas.simples;

public class Fila {

	private Elemento inicio;
	private Elemento fim;

	public boolean isEmpty() {
		return inicio == null;
	}

	public void enqueue(Elemento e) {
		if (isEmpty()) {
			inicio = e;
			fim = e;
		} else {
			fim.setProximo(e);
			fim = e;
		}
	}

	public void dequeue() {
		if (!isEmpty()) {
			inicio = inicio.getProximo();
			if (inicio == null) {
				fim = null;
			}
		}
	}

	public String view() {
		if (isEmpty()) {
			return "Fila vazia";
		}
		Elemento atual = inicio;
		String retorno = "";
		while (atual != null) {
			retorno += atual.getValor() + " ";
			atual = atual.getProximo();
		}
		return retorno.trim();
	}

	public Elemento getInicio() {
		return inicio;
	}

	public void setInicio(Elemento inicio) {
		this.inicio = inicio;
	}

	public Elemento getFim() {
		return fim;
	}

	public void setFim(Elemento fim) {
		this.fim = fim;
	}

}

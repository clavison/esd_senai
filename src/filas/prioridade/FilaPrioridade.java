package filas.prioridade;

public class FilaPrioridade {

	private Elemento inicio;
	private Elemento fim;

	public boolean isEmpty() {
		return inicio == null;
	}

	public void enqueue(Elemento e) {
		if (isEmpty() || e.getPrioridade() > inicio.getPrioridade()) {
			e.setProximo(inicio); // Insere antes do início se for de maior prioridade
			inicio = e;
			fim = e;
		} else {
			Elemento atual = inicio;
			while (atual.getProximo() != null && atual.getProximo().getPrioridade() >= e.getPrioridade()) {
				atual = atual.getProximo();
			}
			e.setProximo(atual.getProximo());
			atual.setProximo(e);
			if(e.getProximo() == null) {
				fim = e;
			}
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

package filas.prioridade;

public class Elemento {
	private String valor;
	private int prioridade;
	private Elemento proximo;

	public Elemento(String valor, int prioridade) {
		setValor(valor);
		setPrioridade(prioridade);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return valor;
	}
}

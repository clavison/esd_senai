package listas;

public class Elemento {

	private String valor;
	private Elemento anterior;
	private Elemento proximo;

	public Elemento(String valor) {
		setValor(valor);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Elemento getAnterior() {
		return anterior;
	}

	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}
	
	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return valor;
	}

}

package filas.simples;

public class Elemento {
	private String valor;
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

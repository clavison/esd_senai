package pilhas;

public class Elemento {

	private String valor;
	private Elemento anterior;

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

	@Override
	public String toString() {
		return valor;
	}

}

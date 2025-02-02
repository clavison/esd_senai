package pilhas;

public class Pilha {
	
	private Elemento topo;
	
	public boolean isEmpty() {
		return topo == null;
	}
	
	public void push(Elemento e) {
		if(isEmpty()) {
			topo = e;
		}else {
			e.setAnterior(topo);
			topo = e;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			topo = topo.getAnterior();
		}
	}
	
	public Elemento peek() {
		return topo;
	}
	
	public String view() {
		if (isEmpty()) {
			return "Pilha vazia";
		} else {
			String retorno = "";
			Elemento atual = topo;
			while (atual != null) { 
				retorno += atual + " "; 
				atual = atual.getAnterior(); 
			}
			return retorno.trim();
		}
	}

}

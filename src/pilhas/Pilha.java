package pilhas;

public class Pilha {
	
	private Elemento topo;
	
	public boolean empty() {
		return topo == null;
	}
	
	public void push(Elemento e) {
		if(empty()) {
			topo = e;
		}else {
			e.setAnterior(topo);
			topo = e;
		}
	}
	
	public void pop() {
		if(!empty()) {
			topo = topo.getAnterior();
		}
	}
	
	public Elemento peek() {
		return topo;
	}
	
	public String view() {
		if (empty()) {
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

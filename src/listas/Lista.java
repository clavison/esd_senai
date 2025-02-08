package listas;

public class Lista {
	
	private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    
    public boolean isEmpty() {
        return primeiro == null;
    }
    
    public void adicionarFinal(Elemento e) {
        if (isEmpty()) {
            primeiro = e;
            ultimo = e;
        } else {
        	ultimo.setProximo(e);
            e.setAnterior(ultimo);
            ultimo = e;
        }
        tamanho++;
    }
    
    public void adicionarInicio(Elemento e) {
        if (isEmpty()) {
            primeiro = e;
            ultimo = e;
        } else {
        	primeiro.setAnterior(e);
            e.setProximo(primeiro);
            primeiro = e;
        }
        tamanho++;
    }
    
    public void removerFinal() {
    	if(!isEmpty()) {
    		if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                ultimo = ultimo.getAnterior();
                ultimo.setProximo(null);
            }
            tamanho--;
    	}
    }
    
    public void removerInicio() {
        if(!isEmpty()) {
        	if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo();
                primeiro.setAnterior(null);
            }
            tamanho--;
        }
    }
    
    public boolean buscar(Elemento e) {
        Elemento atual = primeiro;
        while (atual != null) {
            if (atual.getValor().equals(e.getValor())) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    public String view() {
    	if(isEmpty()) {
    		return "Lista vazia";
    	}
    	String retorno = "";
        Elemento atual = primeiro;
        while (atual != null) {
            retorno += atual.getValor() + " ";
            atual = atual.getProximo();
        }
        return retorno.trim();
    }

	public int getTamanho() {
		return tamanho;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}
	
	

}

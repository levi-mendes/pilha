
public class Pilha {

	private Object[] mElementos = new Object[20];
	private int mQtde;
	
	public boolean estaVazia() {		
		return mQtde == 0;
	}

	public int tamanho() {
		return mQtde;
	}

	public void empilhar(String item) {
		mElementos[mQtde] = item;
		mQtde++;
	}

	public Object topo() {		
		return mElementos[mQtde - 1];
	}

	public Object desempilhar() {
		Object topo = topo();
		mQtde--;
		
		return topo;
	}

}



public class Pilha {

	private Object[] mElementos;
	private int mQtde;
	
	public Pilha(int qtde) {
		mElementos = new Object[qtde];
	}

	public boolean estaVazia() {		
		return mQtde == 0;
	}

	public int tamanho() {
		return mQtde;
	}

	public void empilhar(String item) {
		if (mQtde == mElementos.length) {
			throw new PilhaCheiaException("A pilha já está cheia");
		}
		
		mElementos[mQtde] = item;
		mQtde++;
	}

	public Object topo() {		
		return mElementos[mQtde - 1];
	}

	public Object desempilhar() {
		if (estaVazia()) {
			throw new PilhaVaziaException("Pilha vazia !!!");
		}
		
		Object topo = topo();
		mQtde--;
		
		return topo;
	}

}


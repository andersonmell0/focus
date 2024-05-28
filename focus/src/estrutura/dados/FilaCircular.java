package estrutura.dados;

public class FilaCircular<T> implements Fila<T> {
	
	T[] dados;
	int base = 0;
	int topo = -1;
	
	public FilaCircular(int tamanho) {
		this.dados = (T[]) new Object[tamanho];
	}
	
	private int mover(int posicao) {
		return posicao+1 == dados.length ? 0 : posicao+1;
	}
	
	@Override
	public void adicionar(T valor) {
		if (isCheia()) {
			throw new IllegalStateException("Fila Cheia!");
		}
		topo = mover(topo);
		dados[topo] = valor;
	}

	@Override
	public T remover() {
		if (isVazia()) {
			throw new IllegalStateException("Fila Vazia");
		}
		T dado = dados[base];
		if (base == topo) { //ultimo elemento?
			limpar();
		} else {
			dados[base] = null; //remove elemento
			base = mover(base);
		}
		return dado;
	}

	@Override
	public boolean isCheia() {
		return !isVazia() && mover(topo) == base;
	}

	@Override
	public boolean isVazia() {
		return topo == -1;
	}

	@Override
	public void limpar() {
		base = 0;
		topo = -1;
		for (int i =0; i< dados.length;i++) {
			dados[i]=null;
		}
	}
	
}
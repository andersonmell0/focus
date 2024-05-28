package estrutura.dados;

public class FilaEncadeada<T> implements Fila<T> {
	
	T[] dados;
	int base = 0;
	int topo = -1;
	
	public void limpar() {
		base = 0;
		topo = 0;
	}

	@Override
	public void adicionar(T valor) {
		// TODO Auto-generated method stub		
	}

	@Override
	public T remover() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCheia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVazia() {
		// TODO Auto-generated method stub
		return false;
	}
}
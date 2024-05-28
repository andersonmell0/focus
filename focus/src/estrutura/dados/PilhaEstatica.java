package estrutura.dados;

public class PilhaEstatica implements Pilha{
	
	private int[] dados;	
	private int topo = -1;
	
	public PilhaEstatica(int tamanho) {
		dados = new int[tamanho];
	}
	
	@Override
	public boolean isVazia() {
		return topo == -1;
	}

	@Override
	public void adicionar(int valor) {
		// TODO Auto-generated method stub		
	}

	@Override
	public int remover() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCheia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void limpar() {
		// TODO Auto-generated method stub		
	}
}
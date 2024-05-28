package estrutura.dados;

public class Vetores {
	
	public static void main(String[] args) {
		
		int [] x = new int[] {10,20,3,4};
		var numeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		var y = new double[10];
		
		System.out.println(x[1]);
		System.out.println("tamanho vetor x: " + x.length);		
		System.out.println("tamanho vetor y: " + y.length);
		System.out.println("tamanho vetor numeros: " + numeros.length);
		
		var xadrez = new char[8][8];
		
		var irregular = new int[][]{
				{1,2},
				{3},
				{5},
				{7}
		};
	}
}
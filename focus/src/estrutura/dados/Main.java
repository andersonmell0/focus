package estrutura.dados;

public class Main {

	public static void main(String[] args) {
		var longNum = 12L;
		var nove = 011;
		var floatNum = .5f;
		
		System.out.println(longNum);
		System.out.println(nove);
		System.out.println(floatNum);
		
		
		//Casting
		int y = 10;
		short x = (short) y;
		
		int i = 0;
		i += 10;
		
		System.out.println(i);
		
		var naipe = Naipes.Copas;		
		System.out.println(naipe);
		
		var valor ="Ouros";
		Naipes naipes = Naipes.valueOf(valor);
		
		System.out.println(naipes);
	}
	
}
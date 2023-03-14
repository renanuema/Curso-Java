
public class TestandoCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		//Esse aparece a mesma informação que o de cima pois ele mantém 66 como valor
		//valor = valor + 1;
		//System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		//Adicionei um espaço
		palavra = palavra + " " + 2020;
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";
		System.out.println(parcela1 + parcela2);		
		
	}

}


public class TestandoValores {

	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		//Nesse caso aparece o 5
		segundo = primeiro;
		
		primeiro = 10;

		// quanto vale o segundo?
		//Continua valendo 5, pois o 10 foi informado depois, não realiza o input desse valor
		
		System.out.println(segundo);
		
	}

}

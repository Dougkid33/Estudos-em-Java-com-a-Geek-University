package EstruturasCondicionais;
import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int numberA = 0;
		int result = 0;
		
		System.out.println("Entre com o numero desejado :");
		numberA = texto.nextInt();
		
		if(numberA <=0) {
			System.out.println("Número inválido");
		}
		else {
			result = (int) Math.sqrt(numberA);
			System.out.println(" A raiz quadrada de " +numberA+" e "+result+" .");
			
		}
		
		
		
		texto.close();

	}

}

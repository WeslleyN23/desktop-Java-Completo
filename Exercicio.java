package Array;
import java.util.Arrays;
public class Exercicio {
	
	public static void main(String[] args) {
		
		//Primeira forma de se criar um array
		double[] notasA = new double[3];
		//Segunda forma de se criar um array
		double[] notasB = {10, 9.6, 2.1};
		
		//Obeserve que o resultado será 0 pois as variáveis foram inicializadas com o valor padrão dos tipos primitivos.
		//Caso objto será null, boolean será false, inteiro, short, byte, long, serão 0, o float/double serão 0.0.
		System.out.println(Arrays.toString(notasA));
		
		notasA[0] = 7;
		notasA[1] = 4.4;
		notasA[2] = 9;
		
		//A classe Arrays ajuda a converter o conteúdo do array para String.
		System.out.println(Arrays.toString(notasA));
		
		double totalA = 0;
		for(int i = 0; i < 3; i++) {
			totalA += notasA[i];
		}
		
		int totalB = 0;
		for (int i = 0; i < notasB.length; i++) {
			totalB += notasB[i];
		}
		System.out.println("A média final é "+totalA/notasA.length);
		System.out.println("A média final é "+totalB/notasB.length);		
	}
}
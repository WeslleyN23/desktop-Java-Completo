package Classe;

public class DateTeste {
		public static void main(String[] args) {
			
			//Objeto da classe DateTeste
			Date data1 = new Date();
			
			//Objeto da classe DateTeste
			Date data2 = new Date(23, "Junho", 1998);
			
			//Atributos do objeto data
			//data.ano = 1998;
			//data.mes = "Junho";
			//data.dia = 23;
			
			//É possível armazenar o retorno do método.
			String dataFormatada = data1.obterDataFormatada();
			
			//Saída chamando o método obterDataFormatada da classe Date
			System.out.println(data2.obterDataFormatada());
			//Saída utilizando a variável com o valor do método.
			System.out.print(dataFormatada);
		}
}

package Classe;

public class Date {
	
	int dia;
	String mes;
	int ano;
	
	Date(){
		//Construtor padrão
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}
	
	Date (int diaPadrao, String mesPadrao, int anoPadrao){
		//Construtor com parâmetros
		dia = diaPadrao; 
		mes = mesPadrao;
		ano = anoPadrao;
	}
	
	//Uma função que vai retornar valores String.
	String obterDataFormatada() {
		return String.format("%d de %s de %d", dia, mes, ano);	
	}
	//Uma função que não retorna nada e usa outra função.
	void impimirDataFormatada() {
		System.out.println(obterDataFormatada());;	
	}
}

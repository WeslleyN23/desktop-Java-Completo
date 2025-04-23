package Classe;

public class AreaCircTeste {
	public static void main(String []args) {
		
		AreaCirc res = new AreaCirc(5.6);
		System.out.println(res.area());
		
		//Como a variável Pi é estatic, acessamos diretamente na classe.
		AreaCirc.pi = 3.1415; 
	}
}

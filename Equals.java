package Classe;

public class Equals {
	public static void main(String[]args) {
		EqualsUsuario u1 = new EqualsUsuario();
		u1.nome = "Emanuela";
		u1.email = "emanuela14@gmail.com";
		EqualsUsuario u2 = new EqualsUsuario();
		u2.nome = "Emanuela";
		u2.email = "emanuela14@gmail.com";
		
		System.out.println(u1 == u2); 		//Será falso
		System.out.println(u1.equals(u2)); //Também dará falso
		System.out.println(u2.equals(u1)); //Também dará falso

	}
}

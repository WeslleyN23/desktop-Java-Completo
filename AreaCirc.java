package Classe;

public class AreaCirc {
	double raio;
	static double pi = 3.141569; // Agora Pi é uma variável pertencente somente a Classe AreaCirc.
	
	AreaCirc(double raioIni){
		raio = raioIni;
		
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}
}

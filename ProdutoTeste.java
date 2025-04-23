package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Notebook", 4500);
		Produto produto2 = new  Produto("Smarthphone", 1999);
		Produto produto3 = new  Produto("Televisão", 2500);
		
		Produto.desconto = 0.29;
		
		/*produto1.nome = "Notebook";
		produto2.nome = "Smarthphone";
		produto3.nome = "Televisão";
		produto1.preco = 4500;
		produto2.preco = 1999;
		produto3.preco = 2500;
		produto1.desconto = 0.1;
		produto2.desconto = 0.20;
		produto3.desconto = 0.15;*/
		
		System.out.println(produto1.nome);
		System.out.println(""
				+ "Preço original = "
				+ "R$"+produto1.preco+"\nDesconto aplicado = R$"+ Produto.desconto * produto1.preco
				);
		System.out.printf("Com desconto = R$%.2f", produto1.preco - (Produto.desconto * produto1.preco));
		
		System.out.println("\n"+produto2.nome);
		System.out.println(""
				+ "Preço original = "
				+ "R$"+produto2.preco+"\nDesconto aplicado = R$"+ Produto.desconto * produto2.preco
				);
		System.out.printf("Com desconto = R$%.2f", produto2.preco - (Produto.desconto * produto2.preco));
		
		System.out.println("\n"+produto3.nome);
		System.out.println(""
				+ "Preço original = "
				+ "R$"+produto3.preco+"\nDesconto aplicado = R$"+ Produto.desconto * produto3.preco
				);
		System.out.printf("Com desconto = R$%.2f", produto3.preco - (Produto.desconto * produto3.preco));
	}
}
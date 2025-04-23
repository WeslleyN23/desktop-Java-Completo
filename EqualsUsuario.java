package Classe;

public class EqualsUsuario {
	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
		if(objeto instanceof EqualsUsuario) {
			
			EqualsUsuario outro = (EqualsUsuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;
			
		}else {
			return false;
		}
	}
}

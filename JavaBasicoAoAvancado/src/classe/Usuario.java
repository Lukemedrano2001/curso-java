package classe;

public class Usuario {
	String nome;
	String email;
	
	public Usuario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	// Equals
	public boolean equalsObjeto(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome) ;
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}else {
			return false;			
		}
	}
}

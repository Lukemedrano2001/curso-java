package exerciciosCursoJava.classe;

public class ClassePessoa {
	String nome;
	double peso;
	
	ClassePessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public String pessoaString() {
		return String.format("Nome da Pessoa: %s | Peso da Pessoa: %.2f", this.nome, this.peso);
	}
	
	public void comer(ClasseComida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
}

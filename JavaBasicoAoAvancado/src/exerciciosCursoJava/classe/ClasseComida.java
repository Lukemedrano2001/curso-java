package exerciciosCursoJava.classe;

public class ClasseComida {
	String nome;
	double peso;
	
	ClasseComida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public String comidaString() {
		return String.format("Nome da Comida: %s | Peso da Comida: %.2f", this.nome, this.peso);
	}
}
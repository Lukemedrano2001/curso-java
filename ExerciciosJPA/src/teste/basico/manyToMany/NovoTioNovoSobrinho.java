package teste.basico.manyToMany;

import infraestrutura.DAO;
import model.manyToMany.Sobrinho;
import model.manyToMany.Tio;

public class NovoTioNovoSobrinho {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("João");
		
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinha2 = new Sobrinho("Ana"); 
		
		// Mantendo a consistência na relação entre tios e sobrinhos
		// Tia 1
		tia1.getSobrinhos().add(sobrinho1);
		tia1.getSobrinhos().add(sobrinha2);
		
		// Sobrinho 1
		sobrinho1.getTios().add(tia1);
		sobrinho1.getTios().add(tio2);
		
		// Tio 2
		tio2.getSobrinhos().add(sobrinho1);
		tio2.getSobrinhos().add(sobrinha2);
		
		// Sobrinha 2
		sobrinha2.getTios().add(tia1);		
		sobrinha2.getTios().add(tio2);
		
		
		dao.abrirTransacao()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinha2)
			.fecharTransacao()
			.fecharDAO();
	}
}
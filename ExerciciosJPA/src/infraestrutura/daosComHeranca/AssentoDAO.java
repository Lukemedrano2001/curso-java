package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.oneToOne.Assento;

public class AssentoDAO extends DAO<Assento> {
	// Você pode ter métodos alternativos aqui
	
	public AssentoDAO() {
		super(Assento.class);
	}
}

package generics.herancaComGenerics.lista;

import java.util.List;

public class ListaUtilitarios {
	// Você pode ter quantos tipos genericos quiser no metodo
	
	// Não estamos usando o generics, pois ao usar o metodo, precisamos fazer o cast
	public static Object getUltimoLista1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	// Agora estamos usando o generics, e não precisamos fazer o cast
	public static <TIPO> TIPO getUltimoLista2(List<TIPO> lista) {
		return lista.get(lista.size() - 1);
	}
}
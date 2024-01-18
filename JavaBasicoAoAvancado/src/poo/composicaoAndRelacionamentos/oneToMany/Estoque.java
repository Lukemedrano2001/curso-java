package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    // Composição, Unidirecional (One to Many): Um estoque pode ter muitos produtos
	// Na maioria das vezes use Unidirecional, para evitar recursão, e ter um melhor desempenho

    final HashMap<Integer, Produto> produtos;

    Estoque() {
        this.produtos = new HashMap<Integer, Produto>();
    }

    public void adicionaProduto(int produtoId, Produto produto) {
        this.produtos.put(produtoId, produto);
    }

    @Override
    public String toString() {
        StringBuilder detalhes = new StringBuilder();

        for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
            Produto produto = entry.getValue();
            
            detalhes.append(produto).append("\n");
        }

        return detalhes.toString();
    }
}
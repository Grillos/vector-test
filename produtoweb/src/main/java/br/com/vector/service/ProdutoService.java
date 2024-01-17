package br.com.vector.service;

import java.util.ArrayList;
import java.util.List;

import br.com.vector.model.Produto;

public class ProdutoService {

	ProdutoDAO dao = new ProdutoDAO();
	public void cadastrar(Produto produto) {
		dao.inserir(produto);
		
	}
	
}

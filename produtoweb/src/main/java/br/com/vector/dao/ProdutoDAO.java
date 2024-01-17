package br.com.vector.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.monthalcantara.conexao.Conexao;
import br.com.monthalcantara.model.Cliente;

public class ProdutoDAO {
	Connection con = Conexao.getConnection();
	Produto produto;
	PreparedStatement preparador;
	ResultSet resultado;

	public void inserir(Produto produto) {
		String sql = "insert into produtos (cod, descricao, valor) values (?,?,?)";
		try {
			preparador = con.prepareStatement(sql);
			preparador.setInt(1, produto.getCod());
			preparador.setString(2, produto.getDescricao());
			preparador.setDecimal(3, produto.getValor);
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conexao.fecharConexao(con, preparador);
	}
	
}
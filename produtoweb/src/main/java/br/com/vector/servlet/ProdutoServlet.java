package br.com.vector.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import br.com.vector.model.Produto;
import br.com.vector.service.Produtoervice;

@WebServlet({ "/produto", "/produtoServlet" })
public class ProdutoServlet extends HttpServlet {

	ProdutoService service = new ProdutoService();
	Long cod = null;
	String descricao = null;
	BigDecimal valor = new BigDecimal();

	public ProdutoServlet() {
		System.out.println("Construindo Servlet....");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inicializado");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamando Service");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produto produto = null;

		RequestDispatcher dispatcher = req.getRequestDispatcher("produto.jsp");
		req.setAttribute("produto", produto);
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		
		cod = req.getParameter("cod");
		descricao = req.getParameter("descricao");
		valor = req.getParameter("valor");

		Produto produto = new Produto();

		produto.setCod(cod);
		produto.setDescricao(descricao);
		produto.setValor(valor);

		service.cadastrar(produto);
		req.setAttribute("vazio", "ok");
			
		String index = req.getParameter("index");
		RequestDispatcher dispatcher = req.getRequestDispatcher("produto.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	public void destroy() {
		System.out.println("Servlet Ser� destru�do");
		super.destroy();
	}
}

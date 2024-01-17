<!DOCTYPE html>
<%@page import="br.com.monthalcantara.service.ClienteService"%>
<%@page import="br.com.monthalcantara.model.Cliente"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
function myFunction() {
  document.getElementById("myForm").submit();
}
</script>
<body bgcolor="">
	<h1 align="center" >Cadastro de Produtos</h1>
	<hr>
	<form id="myForm" method="post" action="cliente">
		<input type="number" name="cod" placeholder="Digite seu nome" /> <br />
		<input type="text" name="descricao" placeholder="Digite seu login" /> <br />
		<input type="text" name="valor" placeholder="Digite seu Email" /> <br />

		<br> <br> <input type="submit" value="Salvar" />

	</form>
	</table>
</body>
</html>
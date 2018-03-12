public class TestaProduto {
	public static void main (String[] args) {

		Product prodTeste = new Product();

		prodTeste.setCodigo("63431911");
		prodTeste.setDescricao("Pastel");
		prodTeste.setCusto(5);
		prodTeste.setValor(2);

		prodTeste.mostraDados();
		prodTeste.verificaMargem();

	}
}

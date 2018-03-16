public class TestaProduto {
	public static void main (String[] args) {

		Product prodTeste = new Product("63431911","pastel");
		prodTeste.mostraDados();
		prodTeste.verificaMargem();

		Product prodTeste2 = new Product("19116343","bolo");
		prodTeste2.mostraDados();
		prodTeste2.verificaMargem();

		Product prodTeste3 = new Product("99999993","pao",10,5);
		prodTeste3.mostraDados();
		prodTeste3.verificaMargem();

		
		



	}
}

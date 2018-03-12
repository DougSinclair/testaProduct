public class Product {

	private String codigo = "";
	private String descricao = "";
	private double custo = 0.00;
	private double valor = 0.00;

	public String getCodigo(){
		return codigo;
	}
	public void setCodigo (String codigo){
		this.codigo = codigo;
	}
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao( String descricao){
		this.descricao = descricao;
	}
	public double getCusto(){
		return custo;
	}
	public void setCusto (double custo) {
		this.custo = custo ;
	}
	public double getValor(){
		return valor;
	}
	public void setValor (double valor) {
		this.valor = valor ;
	}

	public void mostraDados () {

		System.out.println ( "codigo:" + this.codigo);
		System.out.println ( "descricao:" + this.descricao);
		System.out.println ( "custo:" + this.custo);
		System.out.println ( "valor:" + this.valor);
	}

	public void verificaMargem (){
		double margem = (120 * this.custo)/100;
		if (this.valor >= margem) {
			System.out.println ("Margem >= 20%");
		}else{
			System.out.println ("Margem inteira à 20%");
		}
	}
}
public class Product {

//random
	
	private String codigo = "";
	private String descricao = "";
	private double custo = 5.00;
	private double valor = 6.00;



	public Product(){}

	public Product(String codigo,String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
        }
	
	public Product(String codigo,String descricao,double custo,double valor){
		this.codigo = codigo;
		this.descricao = descricao;
		this.custo = custo;
		this.valor = valor;
        }
		
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

		System.out.println ( "código:" + this.codigo);
		System.out.println ( "descrição:" + this.descricao);
		System.out.println ( "custo:" + this.custo);
		System.out.println ( "valor:" + this.valor);
	}

	public void mostraDados2 () {

		System.out.println ( "código:" + this.codigo);
		System.out.println ( "descrição:" + this.descricao);
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

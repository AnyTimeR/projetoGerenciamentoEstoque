package MODEL;

public class Produto {
	private String nome;
	private String descricao;
	private double valor;
	private Categoria categoria;
	private Fornecedor fornecedor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	@Override
	public String toString() {
		return "Produto [NOME: " + nome + ", DESCRIÇÃO: " + descricao + ", VALOR: " + valor + ", CATEGORIA: " + categoria
				+ ", FORNECEDOR: " + fornecedor + "]";
	}
	
}

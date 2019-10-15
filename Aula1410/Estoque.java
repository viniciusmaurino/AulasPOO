public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque(){
	}
	
	public Estoque (String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setQtdMinima (int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public int getQtdMinima() {
		return this.qtdMinima;
	}
	
	public void setRepor(int qtd) {
		this.qtdAtual = this.qtdAtual + qtd;
	}
	
	public void setDarBaixa(int qtd) {
		this.qtdAtual = this.qtdAtual - qtd;
	}
	
	public int getQtdAtual() {
		return this.qtdAtual;
	}
	
	public String mostra() {
		return "Nome: " + this.nome + " | Quantidade mínima: " + this.qtdMinima + " | Quantidade atual: " + this.qtdAtual;
	}
	
	public boolean precisaRepor() {
		if (this.qtdAtual <= this.qtdMinima) {
			return true;
		} else {
			return false;
		}
	}
	
}

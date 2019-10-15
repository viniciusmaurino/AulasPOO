public class Elevador {
	private int totalAndar;
	private int andarAtual;
	private int capacidade;
	private int pessoas;
	
	public Elevador (int totalAndar, int andarAtual, int capacidade, int pessoas) {
		this.totalAndar = totalAndar;
		this.andarAtual = andarAtual;
		this.capacidade = capacidade;
		this.pessoas = pessoas;
	}
	
	public boolean entra() {
		if (this.pessoas < this.capacidade) {
			this.pessoas++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sai() {
		if (this.pessoas > 0) {
			this.pessoas--;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sobe() {
		if (this.andarAtual < this.totalAndar) {
			this.andarAtual++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean desce() {
		if (this.andarAtual > 1) {
			this.andarAtual--;
			return true;
		} else {
			return false;
		}
	}

	public int andarAtual() {
		return this.andarAtual;
	}
	
}

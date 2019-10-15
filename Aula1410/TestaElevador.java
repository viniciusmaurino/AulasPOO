
public class testaElevador {

	public static void main(String[] args) {
		
		boolean auxSobe, auxDesce, auxEntra, auxSai;

		Elevador r = new Elevador (10,1,8,0);
		
		auxEntra = r.entra();
		if (auxEntra == true) {
			System.out.println("Pessoa entrou no elevador");
		} else {
			System.out.println("Elevador já está lotado!");
		}
		
		auxSobe = r.sobe();
		if (auxSobe == true) {
			System.out.println("Chegou ao andar " + r.andarAtual());
		} else {
			System.out.println("Já está no último andar!");
		}
		
		auxDesce = r.desce();
		if (auxDesce == true) {
			System.out.println("Chegou ao andar " + r.andarAtual());
		} else {
			System.out.println("Já está no térreo!");
		}
		
		auxSai = r.sai();
		if (auxSai == true) {
			System.out.println("Pessoa saiu do elevador");
		} else {
			System.out.println("Elevador já está vazio!");
		}

	}

}


public class UsaEstoque {

	public static void main(String[] args) {
		
		Estoque estoque1 = new Estoque ("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque ("Monitor LCD 17 polegadas", 11, 13);
		Estoque estoque3 = new Estoque ("Mouse Óptico", 6, 2);
		
		estoque1.setDarBaixa(5);
		
		estoque2.setRepor(7);
		
		estoque3.setDarBaixa(4);
		
		if (estoque1.precisaRepor() == true) {
			System.out.println("Precisa repor Impressora!");
		} else {
			System.out.println("Estoque de Impressora está ok!");
		}
		
		if (estoque2.precisaRepor() == true) {
			System.out.println("Precisa repor Monitor!");
		} else {
			System.out.println("Estoque de Monitor está ok!");
		}
		
		if (estoque3.precisaRepor() == true) {
			System.out.println("Precisa repor Mouse!");
		} else {
			System.out.println("Estoque de Mouse está ok!");
		}
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());

	}

}

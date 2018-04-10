
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estoque {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	CadastrandoProduto calc = new CadastrandoProduto();
	
	while(true) {
		System.out.println("--------------------------");
		System.out.println("Escolha uma opção abaixo:");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Ver Estoque");
		System.out.println("3 - Sair");
		
		int valorMenu = in.nextInt();
		
		if(valorMenu == 1) {
			calc.setNomeProduto(
					JOptionPane.showInputDialog("Informe o Nome do Produto"));
			calc.setValor1(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o Valor do Produto")));
			calc.setValor2(Float.parseFloat(
					JOptionPane.showInputDialog("Informe  a Quantidade do Produto")));
			calc.somar();
		}

		else if(valorMenu == 2) {
			System.out.println(calc.getResultados());
		}
		
		
		else if(valorMenu == 3) {
			break;
		}
		
	}
	System.out.println(calc.getResultados());
	in.close();
}
}
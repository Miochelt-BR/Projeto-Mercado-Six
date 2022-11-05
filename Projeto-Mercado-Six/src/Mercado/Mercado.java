package Mercado;

import TestaMercado.model.Atacado;
import TestaMercado.model.TestaMercado;
import TestaMercado.model.Varejo;
import util.Cores;

import java.util.Scanner;

public class Mercado {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

            int opcao;

		TestaMercado c1 = new TestaMercado("Carambola",8.0f,3.0f,10,"fruta", 1);
		TestaMercado c2 = new TestaMercado("banana",3.0f,1.0f,8,"fruta", 2);

		Atacado c3 = new Atacado("Caqui",4.0f,2.0f,3,"fruta", 3,5);
		Atacado c4 = new Atacado("Uva",12.0f,4.0f,3,"fruta", 4,5);

		Varejo c5 = new Varejo("Coca-cola",8.0f,1.0f,2023,"Refrigerante",5,1);
		Varejo c6 = new Varejo("Fanta-uva",6.0f,1.0f,2023,"Refrigerante",6,1);

		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		c4.visualizar();
		c5.visualizar();
		c6.visualizar();

        		while (true) {

        	System.out.println("******************************************************");
        	System.out.println("                                                      ");
        	System.out.println("           Mercado Six.Seja bem vindes!!!             ");
			System.out.println("                                                      ");
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "******************************************************");
			System.out.println("                                                      ");
			System.out.println("                    Mercado Six                       ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("                   1 - Cadastrar produto              ");
			System.out.println("                   2 - Listar produto                 ");
			System.out.println("                   3 - Excluir produto                ");
			System.out.println("                   4 - Alterar produto                ");
			System.out.println("                   5 - SAIR                           ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      ");
			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nMercado Six.Obrigado pela preferência. Volte sempre!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Cadastrar produto");

				break;
			case 2:
				System.out.println("\n Ver Listar produto");

				break;
			case 3:
				System.out.println("\n Excluir produto");

				break;
			case 4:
				System.out.println("\n Alterar produto");

				break;
			case 5:
				System.out.println("\n Sair");

				break;
			default:
				System.out.println("\n Opção inválida");
			}
		}
    }
}

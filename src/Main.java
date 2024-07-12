import br.com.alura.conversordemoedas.model.Menu;
import br.com.alura.conversordemoedas.service.ConversorMoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao;
        Menu menu = new Menu();
        ConversorMoedas conversor = new ConversorMoedas();
        Scanner leitura = new Scanner(System.in);

        while (true) {
            menu.exibirMenu();
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 9) {
                System.out.println("Sessão encerrada!");
                break;
            }
            System.out.println("Digite um valor para ser convertido: ");
            long valorMoeda = leitura.nextLong();

            conversor.converteMoeda(opcao, valorMoeda);
        }
    }
}
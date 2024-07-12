package br.com.alura.conversordemoedas.model;

public class Menu {
    private final String menu;

    public Menu() {
        menu = """
                *******************************************************
                Seja Bem-Vindo/a ao Conversor de Moedas
                
                1) Dólar Americano =>> Peso Argentino
                2) Peso Argentino =>> Dólar Americano
                3) Dólar Americano =>> Real Brasileiro
                4) Real Brasileiro =>> Dólar Americano
                5) Dólar Americano =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar Americano
                7) Dólar Americano =>> Iene Japonês
                8) Iene Japonês =>> Dólar Americano
                9) Sair
                
                Escolha uma opção válida:
                *******************************************************
                """;
    }

    public void exibirMenu() {
        System.out.println(menu);
    }
}

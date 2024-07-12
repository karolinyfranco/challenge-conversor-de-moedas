package br.com.alura.conversordemoedas.service;

public class ConversorMoedas {
    ConsumoApi converte = new ConsumoApi();

    public void converteMoeda(int opcao, long valorMoeda) {
        switch (opcao) {
            case 1:
                executarConversao("USD", "ARS", valorMoeda);
                break;
            case 2:
                executarConversao("ARS", "USD", valorMoeda);
                break;
            case 3:
                executarConversao("USD", "BRL", valorMoeda);
                break;
            case 4:
                executarConversao("BRL", "USD", valorMoeda);
                break;
            case 5:
                executarConversao("USD", "COP", valorMoeda);
                break;
            case 6:
                executarConversao("COP", "USD", valorMoeda);
                break;
            case 7:
                executarConversao("USD", "JPY", valorMoeda);
                break;
            case 8:
                executarConversao("JPY", "USD", valorMoeda);
                break;
            default:
                System.out.println("Digite uma opção válida entre 1 e 8.");
                break;
        }
    }

    private void executarConversao(String moedaOrigem, String moedaDestino, long valorMoeda) {
        converte.consultaMoeda(moedaOrigem, moedaDestino);
        double add = converte.getJsonCoin().conversion_rate() * valorMoeda;
        System.out.println("O valor " + valorMoeda + " [" + moedaOrigem + "] equivale à =>>> " + add + " [" + moedaDestino + "]");
    }
}

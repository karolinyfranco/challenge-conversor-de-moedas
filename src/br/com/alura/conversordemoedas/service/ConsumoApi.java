package br.com.alura.conversordemoedas.service;

import br.com.alura.conversordemoedas.model.TaxaDeConversao;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    private TaxaDeConversao moedaJSON;
    public TaxaDeConversao getJsonCoin() {
        return moedaJSON;
    }
    public void consultaMoeda(String moedaOrigem, String moedaDestino){
        var keyAPI = "b0c75a4e69088e56da8b0c64";
        String url = "https://v6.exchangerate-api.com/v6/" + keyAPI + "/pair/" + moedaOrigem + "/" + moedaDestino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            moedaJSON = gson.fromJson(response.body(), TaxaDeConversao.class);
        } catch  (IllegalArgumentException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

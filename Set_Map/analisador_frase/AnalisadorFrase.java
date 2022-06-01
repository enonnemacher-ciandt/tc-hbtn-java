import java.util.*;

public class AnalisadorFrase {

    public static TreeMap contagemPalavras(String frase) {
        TreeMap<String, Integer> listaDeOcorrencias = new TreeMap<String, Integer>(); // chave é a palavra, valor é a quantidade de ocorrencias

        // transforma em minusculas, remove espaços antes, depois, caracteres especiais ? . !, e coloca as palavras na lista
        List<String> listaDePalavras = Arrays.asList(frase.toLowerCase().trim().split("[.!?] *| +"));

        for (String item : listaDePalavras) { // itera sobre o vetor de palavras
            Integer ocorrencia = listaDeOcorrencias.get(item); // busca o valor da chave no TreeMap, se não existir, retorna null
            if (ocorrencia != null) {
                listaDeOcorrencias.put(item, ++ocorrencia); // se palavra já existir, acrescenta +1 no contador ocorrencia
            } else {
                listaDeOcorrencias.put(item, 1); // se não existir, acrescenta a palavra e 1 na quantidade
            }
        }

        return listaDeOcorrencias;
    }
}

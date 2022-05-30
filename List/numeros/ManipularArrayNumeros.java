import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) throws Exception {
        if (buscarPosicaoNumero(numeros, numero) != -1) {
            throw new Exception("Numero jah contido na lista");
        }
        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero) throws Exception {
        if (buscarPosicaoNumero(numeros, numero) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        }
        numeros.remove(buscarPosicaoNumero(numeros, numero));
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        if (buscarPosicaoNumero(numeros, numeroSubstituir) != -1) {
            numeros.set(buscarPosicaoNumero(numeros, numeroSubstituir), numeroSubstituto);
        } else {
            numeros.add(numeroSubstituto);
        }
    }
}

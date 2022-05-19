import humor.*;
import comida.*;

public class Personagem {

    private int pontosDeFelicidade;

    public Humor obterHumorAtual() {
        if (this.pontosDeFelicidade < -5) {
            return new Irritado();
        } else if (this.pontosDeFelicidade <= 0) {
            return new Triste();
        } else if (this.pontosDeFelicidade <= 15) {
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return this.pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}

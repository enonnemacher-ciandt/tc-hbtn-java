import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(2);
        System.out.printf("Valor: R$ %s\nTaxa: %s%%\n", numberFormat.format(valor), numberFormat.format(taxa));
    }
}
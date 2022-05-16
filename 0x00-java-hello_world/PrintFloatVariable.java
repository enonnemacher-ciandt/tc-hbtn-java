import java.util.Locale;

public class PrintFloatVariable {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        final float PI = 3.14159f;
        System.out.printf("Valor de pi: %.3f\n", PI);
    }
}
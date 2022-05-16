public class PrintStringVariable {
    public static void main(String[] args) {
        String texto = "Holberton School";
        System.out.printf("%s\n%s\n%s\n", texto, texto, texto.substring(0,9));
    }
}
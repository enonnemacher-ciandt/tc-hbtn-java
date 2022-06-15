import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T extends Estudante> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> listaEstudantes) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listaEstudantes);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<T> desserializar() {
        List<T> listaEstudantes = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.nomeArquivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            listaEstudantes = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return listaEstudantes;
    }
}

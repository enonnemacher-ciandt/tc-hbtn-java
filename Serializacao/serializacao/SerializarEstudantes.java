import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> listaEstudantes) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listaEstudantes);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> listaEstudantes = new ArrayList<Estudante>();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.nomeArquivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            listaEstudantes = (List<Estudante>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return listaEstudantes;
    }
}

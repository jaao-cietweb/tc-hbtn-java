import java.io.*;
import java.util.List;

public class SerializarEstudantes <Estudante>{
    static String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        SerializarEstudantes.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> listEstudantes){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listEstudantes);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
        finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel serializar");
                }
            }
        }
    }

    public List<Estudante> desserializar(){
        @SuppressWarnings("unchecked") List<Estudante> e1 = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            e1 = (List<Estudante>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return e1;
    }
}

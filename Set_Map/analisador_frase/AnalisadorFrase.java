import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap <String, Integer> contagemPalavras(String frase){
        TreeMap <String, Integer> map = new TreeMap<>();

        String fraseTratada = frase.replaceAll("[?.!]" , "");
        String [] fraseSeparada = fraseTratada.split(" ");
        for (String palavra: fraseSeparada) {
            if (map.containsKey(palavra.toLowerCase())){
                map.put(palavra.toLowerCase(), (map.get(palavra.toLowerCase() ))+1);
            }
            else {
                map.put(palavra.toLowerCase(), 1);
            }
        }
        return map;
    }
}

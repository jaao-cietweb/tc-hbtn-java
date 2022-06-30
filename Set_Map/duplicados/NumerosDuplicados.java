import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    static TreeSet <Integer> buscar(int[] array ) {
        TreeSet <Integer> tree = new TreeSet<>();
        HashSet <Integer> hash = new HashSet<>();
        for (int num: array) {
            if (hash.contains(num)) {
                tree.add(num);
            }
            else hash.add(num);
        }
        return tree;
    }
}

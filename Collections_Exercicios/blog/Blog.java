import java.util.*;

public class Blog {

    List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem (Post postagem){
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<String>();

        for (Post postagem: postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> categorias = new TreeMap<String, Integer>();
        for (Post postagem: postagens) {
            if(categorias.containsKey(postagem.getCategoria())){
                Integer contagem = categorias.get(postagem.getCategoria());
                categorias.put(postagem.getCategoria(), contagem +1);
            }
            else {
                categorias.put(postagem.getCategoria(), 1);
            }
        }
        return categorias;
    }
}

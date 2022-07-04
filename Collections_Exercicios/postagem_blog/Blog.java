import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem (Post postagem){
        if(postagens.contains(postagem)){
            throw new IllegalArgumentException("Postagem jah existente");
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<Autor>();

        for (Post postagem: postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> categorias = new TreeMap<Categorias, Integer>();
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

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postagensAutor = new TreeSet<Post>();

        for (Post postagem: postagens){
            if (postagem.getAutor().equals(autor)){
                postagensAutor.add(postagem);
            }
        }
        return postagensAutor;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor,Set<Post>> postagensCategoria = new TreeMap<>();

        for (Post postagem: postagens){
            if (postagensCategoria.containsKey(postagem.getAutor())){
                Set<Post> valor = postagensCategoria.get(postagem.getAutor());
                valor.add(postagem);
                postagensCategoria.put(postagem.getAutor(), valor);
            }
            else {
                Set<Post> valor = new TreeSet<>();
                valor.add(postagem);
                postagensCategoria.put(postagem.getAutor(), valor);
            }
        }
        return postagensCategoria;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> postagemCategoria = new TreeSet<Post>();

        for (Post postagem: postagens) {
            if (postagem.getCategoria().equals(categoria)) {
                postagemCategoria.add(postagem);
            }
        }
        return postagemCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> postagensCategorias = new TreeMap<>();

        for (Post postagem: postagens){
            if (postagensCategorias.containsKey(postagem.getCategoria())){
                Set<Post> valor = postagensCategorias.get(postagem.getCategoria());
                valor.add(postagem);
                postagensCategorias.put(postagem.getCategoria(), valor);
            }
            else{
                Set <Post> valor = new TreeSet<>();
                valor.add(postagem);
                postagensCategorias.put(postagem.getCategoria(), valor);
            }
        }
        return postagensCategorias;
    }


}

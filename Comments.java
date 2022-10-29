package arquivos;

public class Comments {

    private String articulo;
    private String nome;
    private String comentario;

    public Comments(String articulo, String comentario, String nome) {
        this.articulo = articulo;
        this.comentario = comentario;
        this.nome=nome;
    }//final de comments

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }



}

package arquivos;

public class Artigos {
    private String id;
    private String titulo;
    private String resumo;
    private String firma;
    private String url;

    public Artigos(String id, String titulo, String resumo, String url, String firma) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.url = url;
        this.firma=firma;
    }

    public Artigos() {

    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String conteudo) {
        this.resumo = conteudo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String foto) {
        this.url = url;
    }

}

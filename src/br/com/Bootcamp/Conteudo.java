package br.com.Bootcamp;

public abstract class Conteudo {
    private String Titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10d;

    public abstract double calcXP();

    //getters and setters
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

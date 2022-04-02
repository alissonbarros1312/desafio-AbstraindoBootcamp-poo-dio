package br.com.Bootcamp;

public class Atividade extends Conteudo {
    private int cargaHoraria;

    public Atividade() {
    }

    @Override
    public double calcXP() {
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nAtividade{\n" +
                "     titulo = " + getTitulo() +
                "\n     descricao = " + getDescricao() +
                "\n     cargaHoraria=" + this.getCargaHoraria()+
                "}\n";
    }

    //getters and setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

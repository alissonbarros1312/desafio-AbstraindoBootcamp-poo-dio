package br.com.Bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria() {
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;

}

    @Override
    public double calcXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria{\n" +
                "     titulo = "+ getTitulo()+
                "\n     descricao = "+ getDescricao() +
                "\n     dataMentoria = " + dataMentoria +
                "}\n";
    }
}

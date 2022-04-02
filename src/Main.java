import br.com.Bootcamp.Atividade;
import br.com.Bootcamp.Bootcamp;
import br.com.Bootcamp.Developer;
import br.com.Bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AdicionandoBootcamps add = new AdicionandoBootcamps();

        Developer devAlisson = new Developer();
        add.addBoot(devAlisson,1);
        devAlisson.setNome("Alisson");
        System.out.println("Cursos Incritos dev Alisson " + devAlisson.getConteudosIncritos());
        devAlisson.progresso();
        devAlisson.progresso();
        devAlisson.progresso();
        System.out.println("Cursos Concluidos dev Alisson " + devAlisson.getConteudosConcluidos());
        System.out.println("XP : " + devAlisson.calcTotalXP());

        System.out.println("--------------------------------");
        Developer devSara = new Developer();
        add.addBoot(devSara,2);
        devSara.setNome("Sara");
        System.out.println("Cursos Inscritos dev Sara: " + devSara.getConteudosIncritos());
        devSara.progresso();
        System.out.println("Cursos Concluidos dev Sara: " + devSara.getConteudosConcluidos());
        System.out.println("XP : " + devSara.calcTotalXP());

    }
}

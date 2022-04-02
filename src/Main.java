import br.com.Bootcamp.Developer;

public class Main {
    public static void main(String[] args) {

        AdicionandoBootcamps add = new AdicionandoBootcamps();

        Developer devAlisson = new Developer();
        add.addBoot(devAlisson,1);
        devAlisson.setNome("Alisson");
        System.out.println("Cursos Incritos dev " + devAlisson.getNome() + " " + devAlisson.getConteudosIncritos());
        devAlisson.progresso();
        devAlisson.progresso();
        devAlisson.progresso();
        System.out.println("Cursos Concluidos dev " + devAlisson.getNome() + " " + devAlisson.getConteudosConcluidos());
        System.out.println("XP : " + devAlisson.calcTotalXP());

        System.out.println("--------------------------------");
        Developer devSara = new Developer();
        add.addBoot(devSara,2);
        devSara.setNome("Sara");
        System.out.println("Cursos Inscritos dev " + devSara.getNome() + " " + devSara.getConteudosIncritos());
        devSara.progresso();
        System.out.println("Cursos Concluidos dev " + devSara.getNome() + " " + devSara.getConteudosConcluidos());
        System.out.println("XP : " + devSara.calcTotalXP());

    }
}

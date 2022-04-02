import br.com.Bootcamp.Atividade;
import br.com.Bootcamp.Bootcamp;
import br.com.Bootcamp.Developer;
import br.com.Bootcamp.Mentoria;

import java.time.LocalDate;

public class AdicionandoBootcamps {

    public void addBoot(Developer dev, int i){

        if(i == 1){

            Atividade atv1 = new Atividade();
            atv1.setTitulo("Logica da Programacao");
            atv1.setDescricao("descricao do curso");
            atv1.setCargaHoraria(50);

            Atividade atv2 = new Atividade();
            atv2.setTitulo("Fundamentos Basicos do Java");
            atv2.setDescricao("descricao do curso");
            atv2.setCargaHoraria(65);

            Mentoria mentoria1 = new Mentoria();
            mentoria1.setDataMentoria(LocalDate.now());
            mentoria1.setTitulo("Mentoria Java Basico");
            mentoria1.setDescricao("Abstraindo Fundamentos basicos do Java");

            Bootcamp bootcamp1 = new Bootcamp();
            bootcamp1.setNome("Bootcamp Java Básico");
            bootcamp1.setDescricao("--- Descricao Bootcamp Java Basico ---");
            bootcamp1.getConteudos().add(atv1);
            bootcamp1.getConteudos().add(atv2);
            bootcamp1.getConteudos().add(mentoria1);
            dev.inscricaoBootcamp(bootcamp1);

        } else if(i == 2){

            Atividade atv1 = new Atividade();
            atv1.setTitulo("Estruturas condicionais e estruturas de repeticao");
            atv1.setDescricao("--- descricao do curso ---");
            atv1.setCargaHoraria(75);

            Atividade atv2 = new Atividade();
            atv2.setTitulo("Arrays e Matrizes");
            atv2.setDescricao("--- descricao do curso ---");
            atv2.setCargaHoraria(90);

            Mentoria mentoria1 = new Mentoria();
            mentoria1.setDataMentoria(LocalDate.now());
            mentoria1.setTitulo("Mentoria Java Intermediario");
            mentoria1.setDescricao("Abstraindo Fundamentos Intermediarios do Java");

            Bootcamp bootcamp2 = new Bootcamp();
            bootcamp2.setNome("Bootcamp Java Intermediario");
            bootcamp2.setDescricao("--- Descricao Bootcamp Java Intermediario ---");
            bootcamp2.getConteudos().add(atv1);
            bootcamp2.getConteudos().add(atv2);
            bootcamp2.getConteudos().add(mentoria1);
            dev.inscricaoBootcamp(bootcamp2);

        } else if (i == 3){

            Atividade atv1 = new Atividade();
            atv1.setTitulo("Collections em Java");
            atv1.setDescricao("--- descricao do curso ---");
            atv1.setCargaHoraria(100);

            Atividade atv2 = new Atividade();
            atv2.setTitulo("Frameworks em Java");
            atv2.setDescricao("--- descricao do curso ---");
            atv2.setCargaHoraria(90);

            Bootcamp bootcamp3 = new Bootcamp();
            bootcamp3.setNome("Bootcamp Java Avançado");
            bootcamp3.setDescricao("--- Descricao Bootcamp Java Avancado ---");
            bootcamp3.getConteudos().add(atv1);
            bootcamp3.getConteudos().add(atv2);
            dev.inscricaoBootcamp(bootcamp3);

        }

    }

}
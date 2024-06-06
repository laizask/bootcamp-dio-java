package brcomdiodesafio.dominio;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: Curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());;

        //System.out.println(curso1);
        //System.out.println(mentoria);//


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);

        Dev devLaiza = new Dev();
        devLaiza.setNome("Laiza");
        devLaiza.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Laiza:" + devLaiza.getConteudosInscritos());
        devLaiza.progredir();
        System.out.println("Conteudos inscritos Laiza:" + devLaiza.getConteudosInscritos());
        System.out.println("Conteudos concluidos Laiza:" + devLaiza.getConteudosConcluidos());
        System.out.println("XP" + devLaiza.calcularTotalXp());

        System.out.println("------------------");

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Diego:" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("Conteudos inscritos Diego:" + devDiego.getConteudosInscritos());
        System.out.println("Conteudos concluidos Diego:" + devDiego.getConteudosConcluidos());
        System.out.println("XP" + devDiego.calcularTotalXp());


    }
}

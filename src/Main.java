import br.com.dio.desfio.dominio.Curso;
import br.com.dio.desfio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Focado na liguagem  java");
        curso.setCargaHoraria(12);

        Curso curso1 = new Curso();
        curso1.setTitulo("Logica de programação");
        curso1.setDescricao("Voltado ao aprendizado de logica de programação com java");
        curso1.setCargaHoraria(22);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Dedicada a evolução na liguagem java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setCargaHoraria(95);
		curso.setTitulo("Java");
		curso.setDescricao("Curso de desenvolvimento de Java");
		
		Curso curso2 = new Curso();
		curso2.setCargaHoraria(95);
		curso2.setTitulo("Js");
		curso2.setDescricao("Curso de desenvolvimento de Js");
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria para alunos com duvidas em java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso2);
		System.out.println(mentoria);
		
	}

}

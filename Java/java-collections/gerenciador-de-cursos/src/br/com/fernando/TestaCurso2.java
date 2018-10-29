package br.com.fernando;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Luiz Fernando",34567);
		Aluno a2 = new Aluno("Fernando",33333);
		Aluno a3 = new Aluno("Luiz",44444);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados: ");

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });




	}

}

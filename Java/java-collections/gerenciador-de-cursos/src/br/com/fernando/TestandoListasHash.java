package br.com.fernando;

import java.util.*;

public class TestandoListasHash {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Luiz Fernando Santos da Silva");
		alunos.add("Aluno 2");
		alunos.add("Aluno 3");
		alunos.add("Aluno 4");
		alunos.add("Aluno 5");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        Boolean alunoMatriculado = alunos.contains("Luiz Fernando Santos da Silva");
        System.out.println("Aluno esta matriculado "+ alunoMatriculado);

        List<String> alunosArray = new ArrayList<>(alunos);

        System.out.println(alunosArray.contains("Aluno 5"));
        System.out.println(alunosArray.get(1));




	}
}

package br.com.fernando;

import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);

    }

    public boolean estaMatriculado(Aluno aluno) {
		return  this.alunos.contains(aluno);
    }

    public Aluno buscarMatricula(int numero) {
        for (Aluno aluno :alunos){
            if (aluno.getMatricula()==numero){
                return aluno;
            }
        }
        throw new NoSuchElementException("matricula nao encontrado: "+numero);
    }
}

package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProblemaAlura {
        public static void main(String[] args) {
            Aula aulaIntro = new Aula("Introdução às Coleções", 20);
            Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
            Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

            List<Aula> aulas = new ArrayList<>();
            aulas.add(aulaIntro);
            aulas.add(aulaModelando);
            aulas.add(aulaSets);

            for (Aula aula : aulas) {
                System.out.println(aula);
            }

            Collections.sort(aulas,new Comparar());

            for (Aula aula : aulas) {
                System.out.println(aula);
            }
        }
    }

    class Aula {

        private String titulo;
        private int tempo;

        public Aula(String titulo, int tempo) {
            this.titulo = titulo;
            this.tempo = tempo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getTempo() {
            return tempo;
        }

        public void setTempo(int tempo) {
            this.tempo = tempo;
        }

        public String toString() {
            return "[título: " + titulo + ", tempo: " + tempo + " minutos]";
        }
}

class Comparar implements Comparator<Aula> {



    @Override
    public int compare(Aula a1, Aula a2) {
        return a1.getTempo() - a2.getTempo();
    }
}
package com.example.agileschool;

public class Customer {

        private String aluno;
        private int classe;
        private int ra;

        public Customer(String aluno, int classe, int ra) {
            this.aluno = aluno;
            this.classe = classe;
            this.ra = ra;
        }

        public String getAluno() {
            return aluno;
        }

        public void setAluno(String nome) {
            this.aluno = nome;
        }

        public int getClasse() {
            return classe;
        }

        public void setClasse(int classe) {
            this.classe = classe;
        }

        public int getRa() {
            return ra;
        }

        public void setRa(int ra) {
            this.ra = ra;
        }
    }


package com.mycompany.academia;

public class Exercicio implements Pacotes{
    
    //Criando métodos para utilizar na classe Aluno
    public void Treino_Segunda(){
        System.out.println("Hoje vai ser peitoral e tríceps");
    }
    
    public void Treino_terca(){
        System.out.println("Hoje vai ser costas e bíceps");
    }
    
    public void Treino_quarta(){
        System.out.println("Hoje vai ser 1 hora de exercicios aeróbicos");
    }
     
    public void Treino_quinta(){
        System.out.println("Hoje vai ser pernas e glúteos");
    }
    
    public void Treino_sexta(){
        System.out.println("Hoje vai ser ombro e abdominais");
    }

    @Override
    public void pacote_personal1(){
        System.out.println("Nome do Personal Trainer: João");
        System.out.println("Mensalidade: 520R$");
        System.out.println("Atendendo as: Segundas, Quartas e Sextas.");
    }
    
    @Override
    public void pacote_personal2(){
        System.out.println("Nome do Personal Trainer: Gustavo");
        System.out.println("Mensalidade: 240R$");
        System.out.println("Atendendo as: Terças e Quartas.");
    }
    
    @Override
    public void pacote_personal3(){
        System.out.println("Nome do Personal Trainer: Amanda");
        System.out.println("Mensalidade: 160R$");
        System.out.println("Atendendo as: Sextas e Sabados.");
    }
}

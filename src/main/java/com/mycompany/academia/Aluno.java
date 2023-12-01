package com.mycompany.academia;

public class Aluno extends Exercicio{
    private String nome;
    private double IMC;
    private String idade;

    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    //Método Construtor
    public Aluno(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //Criando método para calcular IMC
    public void calcular_imc(double peso, double altura){
        IMC = peso/(altura*altura);
        if(IMC <= 18.5){
            System.out.println("Seu IMC é de: "+IMC+" e você esta abaixo do peso.");
        }else if(IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Seu IMC é de: "+IMC+", e você está em um peso normal.");
        }else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Seu IMC é de: "+IMC+", e você está acima do peso.");
        }else if(IMC >= 30 && IMC <= 34.9){
            System.out.println("Seu IMC é de: "+IMC+", e você esta Obesidade Grau I");
        }else if(IMC >= 35 && IMC <= 39.9){
            System.out.println("Seu IMC é de: "+IMC+", e você esta Obesidade Grau II");
        }else if(IMC >= 40){
            System.out.println("Seu IMC é de: "+IMC+", e você está Obesidade Grau III");
        }
    }
    
    //Método para imprimir os dados
    public void dados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
    
    
    
    
    
}

package com.mycompany.academia;

public class Academia {

    public static void main(String[] args) {
        Aluno alu = new Aluno("Lucas", "19"); //Realizando o encapsulamento
        
        alu.dados(); //Chamando o método para imprimir os dados
        alu.calcular_imc(65, 1.70); //Chamando o método para calcular o IMC com peso e altura incluso no método
        System.out.println("--------------------------------------------------"); //Quebra de linha
        alu.pacote_personal1(); //Chamando o método de pacotes da interface.
        
        //alu.pacote_personal2();
        //alu.pacote_personal3();
        
        System.out.println("--------------------------------------------------");
        alu.Treino_Segunda(); // Chamando o método extendido da classe Exercicio
    }
}

package org.example;

public class Vaca {
    private static int contadorId = 1; // Contador estático para gerar IDs únicos
    private int id; // Identificador único para cada vaca
    private String nome;
    private int idade;
    private double peso;
    private float numero; // Novo campo para o número personalizado

    // Construtor
    public Vaca(String nome, int idade, double peso, float numero) {
        this.id = contadorId++; // Atribui e incrementa o contador
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.numero = numero;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public float getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", numero=" + numero +
                '}';
    }
}

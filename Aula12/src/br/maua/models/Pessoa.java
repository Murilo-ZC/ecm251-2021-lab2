package br.maua.models;

/**
 * Modelo utilizado para representar uma pessoa com
 * nome e cpf.
 */
public class Pessoa {
    final public String nome;
    final public String cpf;

    /**
     * Construtor que iniciliza os atributos da classe
     * @param nome Nome da pessoa
     * @param cpf CPF da pessoa
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve o estado do objeto
     * @return Devolve os valores de nome e cpf
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

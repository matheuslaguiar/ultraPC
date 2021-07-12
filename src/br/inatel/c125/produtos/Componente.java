package br.inatel.c125.produtos;

public class Componente {
    private String tipo;
    private String nome;

    // Construtor
    public Componente(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    // getters & setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}

package br.inatel.c125.produtos;

public class MemoriaUSB {
    private String marca;
    private long capacidade;

    // Construtor
    public MemoriaUSB(String marca, long capacidade) {
        this.marca = marca;
        this.capacidade = capacidade;
    }

    // getters & setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public long getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(long capacidade) {
        this.capacidade = capacidade;
    }

    
}

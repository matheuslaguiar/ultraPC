package br.inatel.c125.pessoa;

import br.inatel.c125.produtos.Computador;

public class Cliente {
    private String nome;
    private long cpf;
    private Computador[] computadores;

    public Cliente(String nome, long cpf, int qtdComputador){
        this.cpf = cpf;
        this.nome = nome;
        computadores = new Computador[qtdComputador];
    }

    public double calculaCompra(){
        double total = 0;
        for(Computador temp : computadores){
            if(temp == null)
                break;
            total += temp.getPreco();
        }
        return total;
    }

    public void addComputador(Computador computador){
        for(int i = 0; i < this.computadores.length; i++){
            if(this.computadores[i] == null){
                this.computadores[i] = computador;
                break;
            }
        }
    }
    
    // getters & setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public Computador[] getComputadores() {
        return computadores;
    }
    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }
}

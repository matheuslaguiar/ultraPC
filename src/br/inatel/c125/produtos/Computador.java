 package br.inatel.c125.produtos;

public class Computador {
    private String marca;
    private double preco;
    private MemoriaUSB memoria;
    private SistemaOperacional SO;
    private Componente[] componentes;
    
    public Computador(String marca, double preco, int qtdComponentes, String nomeSistema){
        this.marca = marca;
        this.preco = preco;
        componentes = new Componente[qtdComponentes];
        SO = new SistemaOperacional(nomeSistema);
    }

    public void mostraPcConfig(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + SO.getNome());
        System.out.println("Componentes:");
        for(Componente temp : componentes){
            if(temp == null)
                break;
            System.out.println("    " + temp.getTipo() + " " + temp.getNome());
        }
        if(memoria == null)
            System.out.println("Memoria USB não disponível");
        else{
            System.out.println("Memoria USB: " + memoria.getMarca());
            System.out.println("Capacidade da Memoria USB: " + memoria.getCapacidade());
        }
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB mem){
        this.memoria = mem;
    }

    public void addComponentes(Componente comp){
        for(int i = 0;i < this.componentes.length; i++){
            if(componentes[i] == null){
                componentes[i] = comp;
                break;
            }
        }
    }

    // getters & setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public MemoriaUSB getMemoria() {
        return memoria;
    }
    public void setMemoria(MemoriaUSB memoria) {
        this.memoria = memoria;
    }
    public SistemaOperacional getSO() {
        return SO;
    }
    public void setSO(SistemaOperacional sO) {
        SO = sO;
    }
    public Componente[] getComponentes() {
        return componentes;
    }
    public void setComponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    
}

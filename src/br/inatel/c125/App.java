package br.inatel.c125;
import br.inatel.c125.produtos.Componente;
import br.inatel.c125.produtos.Computador;
import br.inatel.c125.produtos.MemoriaUSB;
import br.inatel.c125.pessoa.Cliente;

public class App {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Aloísio", 123456789, 2);
        Computador PC1 = new Computador("Seninha", 100, 4, "Windows");
        Computador PC2 = new Computador("Acer", 500000, 4, "MacOSX");

        PC1.addComponentes(new Componente("GPU", "Geforce RTX 2060"));
        PC1.addComponentes(new Componente("CPU", "Intel i5"));
        PC1.addComponentes(new Componente("SSD", "256MB"));
        PC1.addComponentes(new Componente("RAM", "2GB"));
        PC1.mostraPcConfig();

        cliente1.addComputador(PC1);

        PC2.addComponentes(new Componente("CPU", "AMD Ryzen 5"));
        PC2.addComponentes(new Componente("HD", "1TB"));
        PC2.addComponentes(new Componente("RAM", "12GB"));
        PC2.addComponentes(new Componente("Headphone", "Phillips TAUH202"));
        PC2.addMemoriaUSB(new MemoriaUSB("Kingston", 16));
        PC2.mostraPcConfig();

        cliente1.addComputador(PC2);

        System.out.println("Total da compra: " + cliente1.calculaCompra());

    }
}

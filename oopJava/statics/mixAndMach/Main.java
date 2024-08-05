package statics.mixAndMach;

public class Main {
    
}

/*
 * Em um metodo static, não é possivel acessar elementos que não sejam static
 * Mas em um metodo que não seja estático, ou seja, próprio de um objeto, todas as propriedades podem
 * ser acessadas livremente, já que caso algo não estático seja acessado significa que existe um objeto
 * com as devidas caracteristicas
 */

class Carro{
    String placa;
    int ano;
    static int qtdCarros;

    Carro (String placa, int ano){
        this.placa = placa;
        this.ano = ano;
        qtdCarros++;
    }

    void dirigir(){
        System.out.println("Vrum Vrum");
    }

    static void dirigir2(){
        //Não funciona porque está tentando acessar algo não estático (Pertencente a um objeto) a partir
        //De um contexto de uma classe. 
        //dirigir();

        //Para funcionar deve ser feito o seguinte
        Carro gol = new Carro("ABC1234", 2010);
        gol.dirigir();
    }
}
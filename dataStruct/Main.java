package dataStruct;

import java.util.ArrayList;

import dataStruct.Objetos.Pessoa;

public class Main {

    public static void main(String[] args) {
        arrayList(); 
    }
    
    private static void arrayList(){
        ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();

        //Adicionando
        pessoas.add(new Pessoa("Raimundo", 15));
        pessoas.add(new Pessoa("Abner", 17));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("João", 16));
        pessoas.add(new Pessoa("Mariane", 20));
        pessoas.add(new Pessoa("Adriana", 50));
        pessoas.add(new Pessoa("Marcos", 46));

        //Usando a propriedade da lista de forEach
        pessoas.forEach( i -> {
            System.out.println(i.getNome());
        }); 

        System.out.println("------Agora com o padrão ---------");

        //Usando o loop for each padrão
        for (Pessoa i : pessoas) {
            System.out.println(i.getNome());    
        }

        //Colocando cada terceira pessoa como mecanico e salário 2300.54
        for (int i = 2; i < pessoas.size()-1; i+= 3){
            pessoas.get(i).setProfissao("Mecanico");
            pessoas.get(i).setSalario(2300.54f);
        }

        
        System.out.println("------ Com profissão ---------");
        pessoas.forEach(i -> {
            System.out.println("Nome : " + i.getNome() + " Profissão: "+ i.getProfissao() + " Salario: " + i.getSalario());
        });

        //Deletando cada 2 pessoas
        /*
         * Fazendo desse jeito, pois a cada vez que é deletado uma pessoa, o index é modificado,
         * por isso é criado um arrayList para rememover as pessoas que estão selecionadas
         */
        ArrayList <Pessoa> toRemove = new ArrayList<Pessoa>();
        for (int i = 1; i < pessoas.size()-1; i+= 2){
            toRemove.add(pessoas.get(i));
        }

        pessoas.removeAll(toRemove);

        System.out.println("------ Pós deleção ---------");
        pessoas.forEach(i -> {
            System.out.println("Nome : " + i.getNome() + " Profissão: "+ i.getProfissao() + " Salario: " + i.getSalario());
        });
    }
}

import java.util.Scanner;

import net.pedro.Age;
import net.pedro.exception.BurroException;

/* 
 * Exit 0 - Sem problemas
 * Exit 1 - Problema de Conversão
 * Exit 2 - Problema de Burrice
 * Exit 3 - Erro desconhecido
*/


public class Main {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);    
        int idade = 0;

        System.out.print("Digite uma idade a ser validada: ");
        try{
            idade = Integer.parseInt(myScanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("O input digitado não é um inteiro");
            System.exit(1);
        }catch(Exception e){
            System.out.println("Ocorreu um erro");
            System.out.println(e);
            System.exit(3);
        }

        try{
            Age.validateAge(idade);
        }catch(BurroException e){
            System.out.println("Ocorreu um erro de burrice durante a execução do programa: " + e.getMessage());
            System.exit(2);
        }finally{
            myScanner.close();
        }

        
        System.out.println("Programa rodou sem erros");
        System.exit(0);
    }
}
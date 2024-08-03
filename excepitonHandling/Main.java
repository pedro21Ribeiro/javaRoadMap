import java.util.Scanner;

import net.pedro.Age;

public class Main {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);    

        System.out.print("Digite uma idade a ser validada: ");
        int idade = Integer.parseInt(myScanner.nextLine());
        Age.validateAge(idade);
        System.out.println("Programa rodou sem erros");

        myScanner.close();
    }
}
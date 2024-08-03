import java.util.Scanner;

import net.pedro.Age;
import net.pedro.exception.BurroException;

public class Main {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);    

        System.out.print("Digite uma idade a ser validada: ");
        int idade = Integer.parseInt(myScanner.nextLine());

        try{
            Age.validateAge(idade);
            System.out.println("Programa rodou sem erros");
        }catch(BurroException e){
            System.out.println("Ocorreu um erro de burrice no programa: " + e.getMessage());
        }finally{
            myScanner.close();
        }
    }
}
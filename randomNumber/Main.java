package randomNumber;

import java.util.Scanner;
import randomNumber.randomGenerator.RandomNum;

public class Main {
    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            menu();
            choice = myScanner.nextInt();
            myScanner.nextLine();
            if(choice >= 1 && choice < 4){
                dificulty(choice);
            }else if(choice == 0){
                System.out.println("Saindo do programa");
            }else{
                System.out.println("Escolha invalida");
            }
        }
        myScanner.close();
    } 

    private static void menu(){
        System.out.println("1 - Fácil\n2 - Médio\n3 - Difícil\n0 - sair");
    }

    private static void dificulty(int dificulty){
        switch (dificulty) {
            case 1:
                guess(RandomNum.generate(30));
                break;
            case 2:
                guess(RandomNum.generate(50));
                break;
            case 3:
                guess(RandomNum.generate(100));
                break;
            default:
                System.out.println("Dificuldade impossivel");
                return;
        }

    }

    private static void guess(int number){
        myScanner = new Scanner(System.in); 
        System.out.println("Digite o numero");
        int chute = myScanner.nextInt();
        myScanner.nextLine();
        Boolean acertou = chute == number;
        
        if(acertou){
            System.out.println("Parabéns você acertou");
        }else{
            System.out.println("O numero correto era " + number + " Tente novamente");
        }
    }
}
